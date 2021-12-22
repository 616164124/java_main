package zb.算法.第一个收藏视频.链表反转;

import zb.算法.第一个收藏视频.base.Node;

public class Method2 {
    public static void main(String[] args) {
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node0.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        node0=test2(node0);
        while (null != node0) {
            System.out.print(node0.getData() + ",");
            node0 = node0.getNext();
        }

        System.out.println("\n************打印反转前的链表**************");

        // 打印反转前的链表
        Node h = node0;
        while (null != h) {
            System.out.print(h.getData() + " ");
            h = h.getNext();
        }
        // 调用反转方法
        node0 = Reverse1(node0);

        System.out.println("\n**************************");
        // 打印反转后的结果
        while (null != node0) {
            System.out.print(node0.getData() + " ");
            node0 = node0.getNext();
        }

    }

    /**
     * 递归，在反转当前节点之前先反转后续节点
     */
    public static Node Reverse1(Node node) {
        // head看作是前一结点，head.getNext()是当前结点，reHead是反转后新链表的头结点
        if (node == null || node.getNext() == null) {
            return node;// 若为空链或者当前结点在尾结点，则直接还回
        }
        Node reHead = Reverse1(node.getNext());// 先反转后续节点head.getNext()
        node.getNext().setNext(node);// 将当前结点的指针域指向前一结点
        node.setNext(null);// 前一结点的指针域令为null;
        return reHead;// 反转后新链表的头结点
    }

    public static Node test01(Node node) {
        if (node == null || node.getNext() == null) {
            return node;
        }
        Node rehead = test01(node.getNext());
        node.getNext().setNext(node);
        node.setNext(null);
        return rehead;
    }
    public static Node test2(Node node){
        if(node ==null||node.getNext()==null){
            return node;
        }
        Node test=test2(node.getNext());
        node.getNext().setNext(node);
        node.setNext(null);
        return test;
    }


}
