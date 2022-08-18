package com.dataStructure;

import java.util.*;

/**
 * 跳表类
 * @param <T> 泛型
 */
public class SkipList<T>{
    /**
     * 跳表结点内部类
     */
    private class Node{
        //前后上下
        private Node next,pre,up,down;
        private Integer key;
        private T value;
        public Node(int key,T value){
            this.key = key;
            this.value = value;
        }

        public Node getNext() { return next; }

        public void setNext(Node next) { this.next = next; }

        public Node getPre() { return pre; }

        public void setPre(Node pre) { this.pre = pre; }

        public Node getUp() { return up; }

        public void setUp(Node up) { this.up = up; }

        public Node getDown() { return down; }

        public void setDown(Node down) { this.down = down; }

        public int getKey() { return key; }

        public void setKey(int key) { this.key = key; }

        public T getValue() { return value; }

        public void setValue(T value) { this.value = value; }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    //使tail有哨兵作用
    private static final int MAX_KEY = Integer.MAX_VALUE;
    //使head有哨兵作用
    private static final int MIN_KEY = Integer.MIN_VALUE;
    //掷骰子
    private static final Random random = new Random();
    //当前跳表内索引层的最大值
    private int currentMaxLevel = 1;
    //头尾结点，两个哨兵
    private Node head,tail;
    //当前跳表内存储了多少个元素(不包括索引结点)
    private int size = 0;

    public SkipList(){ clear(); }

    /**
     * 重置当前的状态,也可用于初始化
     */
    public void clear(){
        //重置层数
        setCurrentMaxLevel(1);
        //设置头尾
        setHead(new Node(MIN_KEY,null));
        setTail(new Node(MAX_KEY,null));
        //连接头尾
        horizontalLink(getHead(),getTail());
    }

    //掷骰子，1即可以向上，否则不行
    private boolean canUpgrade(){
        return getRandom().nextInt(2)==1;
    }

    /**
     * 竖直方向连接两个结点(作为内部其他方法的工具方法)
     * @param down 下方结点
     * @param up 上方结点
     */
    private void verticalLink(Node down,Node up){
        down.setUp(up);
        up.setDown(down);
    }


    /**
     * 水平方向连接两个结点(作为内部其他方法的工具方法)
     * @param pre 前面的结点
     * @param next 后面结点
     */
    private void horizontalLink(Node pre,Node next){
        pre.setNext(next);
        next.setPre(pre);
    }

    /**
     * 插入结点操作(作为内部其他方法的工具方法)
     * @param pre 插入位置的前一个结点
     * @param cur 要插入的结点
     */
    private void insertAfter(Node pre,Node cur){
        Node next = pre.getNext();
        horizontalLink(pre,cur);
        horizontalLink(cur,next);
    }

    /**
     * 寻找结点
     * @param key
     * @return 如果存在key,则返回对应node,否则返回小于该key值的最后一个结点
     */
    private Node findNode(int key){
        Node node = getHead();
        while(true){
            while (node.getNext().getKey()<=key&&node.getNext().getKey() != MAX_KEY){
                node = node.getNext();
            }
            if(node.getDown() != null){
                node = node.getDown();
            }else {
                break;
            }
        }
        return node;
    }

    /**
     *  1.先查找到需要插入的地方
     *  2.执行插入
     *  3.判定需不需要进行升层
     * @param key    插入节点的key
     * @param value  插入节点的value
     */
    public void put(int key,T value){
        Node node = findNode(key);
        if(node.getKey() == key){
            node.setValue(value);
        }else{
            //1.创建出节点
            Node cur = new Node(key,value);
            //2.插入节点
            insertAfter(node,cur);
            //用作判定是否超过现有的层数
            int currentLevel = 1;
            //3.判定需不需要进行升层，使用抛硬币的方法,1/2的概率
            boolean canUpGradeFlag=canUpgrade();
            Node pre=node;
            while(canUpGradeFlag){
                //1.currentLevel
                if(currentLevel>=getCurrentMaxLevel()){
                    //2.此时先提高层数
                    setCurrentMaxLevel(getCurrentMaxLevel()+1);
                    //3.创建出两端
                    Node newHead = new Node(MIN_KEY,null);
                    Node newTail = new Node(MAX_KEY,null);
                    //4.水平上的连接
                    horizontalLink(newHead,newTail);
                    //5.上下的承接
                    verticalLink(getHead(),newHead);
                    verticalLink(getTail(),newTail);
                    //6.赋值
                    setHead(newHead);
                    setTail(newTail);
                }
                //7.找到上方该插入位置的前后结点
                while(pre.getUp() == null){
                    pre = pre.getPre();
                }
                //得到上一层要插入位置的前一个结点
                pre = pre.getUp();
                //8.新建关于当前插入节点的上层节点
                Node up = new Node(key, null);
                //插入节点
                insertAfter(pre,up);
                //层次关系
                verticalLink(cur,up);
                //迭代更新下方结点，方便垂直连接该插入结点的各索引层
                cur = up;
                //更新flag
                canUpGradeFlag = canUpgrade();
                //当前结点的索引层数加一
                currentLevel++;
            }
            //节点数加一
            setSize(getSize()+1);
        }
    }

    /**
     *  1.先查找到需要删除的key
     *  2.如果没有就返回
     *  3.找到后从底向上开始删除
     * @param key 要删除的节点的key
     */
    public boolean remove(int key){
        Node node = findNode(key);
        if(node.getKey()!=key){ return false; }
        else{
            int currentLevel=0;
            while(node != null){
                Node pre = node.getPre();
                Node next = node.getNext();
                //水平方向断开该结点
                horizontalLink(pre,next);
                //当该层除头尾结点外无结点时，说明该层包括以上层都可以舍弃了,进行一个新的更
                //结点的销毁是GC的事，我们只需要断开连接
                if(pre.getNext().getKey() == MAX_KEY && pre.getKey() == MIN_KEY&&getCurrentMaxLevel()>1){
                    setHead(pre.getDown());
                    setTail(next.getDown());
                    getHead().setUp(null);
                    getTail().setUp(null);
                    //记得拿当前的层数更新跳表层数
                    setCurrentMaxLevel(currentLevel);
                    break;
                }
                node = node.getUp();
                currentLevel++;
            }
            //节点数减一
            setSize(getSize()-1);
            return true;
        }
    }

    public T get(int key){
        Node node=findNode(key);
        if(node.getKey()!=key){
            return null;
        }
        return node.getValue();
    }

    /**
     * 范围查询(左闭右闭)
     * @param start 起始key
     * @param end   终止key
     * @return 内容为<key,value>的链表集合
     */
    public List<Map<Integer,T>> getRangeByKey(int start, int end){
        Node node=findNode(start);
        if(node.getKey()!=start){ node=node.getNext(); }
        List<Map<Integer,T>> list=new LinkedList<>();
        while(node.key<=end){
            Map<Integer,T> map=new HashMap<>();
            map.put(node.getKey(),node.getValue());
            list.add(map);
            node=node.getNext();
        }
        return list;
    }

    /**
     * 自己写的很乐色
     * @return
     */
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("SkipList:{\n");
        sb.append("\tlevel:"+this.currentMaxLevel+",\n");
        sb.append("\t{\n");
        Node tempHead=getHead();
        while(tempHead!=null){
            sb.append("\t\t"+tempHead.getKey()+"\t");
            Node tempNode=tempHead.getNext();
            while(tempNode.getKey()!=getTail().getKey()){
                sb.append(tempNode.getKey()+"\t");
                tempNode=tempNode.getNext();
            }
            sb.append(tempNode.key+"\n");
            tempHead=tempHead.getDown();
        }
        sb.append("\t}\n");
        sb.append("}\n");
        return sb.toString();
    }

    public int getCurrentMaxLevel() { return currentMaxLevel; }

    private void setCurrentMaxLevel(int currentMaxLevel) { this.currentMaxLevel = currentMaxLevel; }

    private Node getHead() { return head; }

    private void setHead(Node head) { this.head = head; }

    private Node getTail() { return tail; }

    private void setTail(Node tail) { this.tail = tail; }

    private Random getRandom() { return random; }

    private int getSize() { return size; }

    private void setSize(int size) { this.size = size; }
}


class Demo{
    public static void main(String[] args) {
        SkipList<Integer> skipList=new SkipList<>();
        skipList.put(1,1);
        skipList.put(2,2);
        skipList.put(2,3);
        System.out.println(skipList);
        skipList.remove(2);
        System.out.println(skipList);
        skipList.put(3,3);
        skipList.put(0,0);
        skipList.put(2,2);
        System.out.println(skipList.getRangeByKey(0,5));
    }
}
