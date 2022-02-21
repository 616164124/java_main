package zb.算法.简单算法;

public class 二叉树排序 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(1);
        tree.insert(8);
        tree.insert(3);
        outPutTree(Tree.root);
        getMinValue(Tree.root);
        getMaxValue(Tree.root);
    }

    //遍历树中的集合
    public static void outPutTree(Tree tree) {
        System.out.print(tree.data + " ");
        if (tree.hasLeftSon()) {
            outPutTree(tree.leftSon);
        }
        if (tree.hasRightSon()) {
            outPutTree(tree.rightSon);
        }
    }

    //找出树中最小的值
    public static void getMinValue(Tree tree) {
        if (tree.hasLeftSon()) {
            getMinValue(tree.leftSon);
        } else {
            System.out.println("最小值" + tree.data);
        }
    }

    //找出树中最大的值
    public static void getMaxValue(Tree tree) {
        if (tree.hasRightSon()) {
            getMaxValue(tree.rightSon);
        } else {
            System.out.println("最大值" + tree.data);
        }
    }

}


/**
 * 二叉树
 */
class Tree {
    public Integer data;//每一个节点的值
    public static Tree root;//根节点(有且仅有一个)
    public Tree father;//父节点
    public Tree leftSon;//左子节点
    public Tree rightSon;//右子节点

    //左树是否为空
    public boolean hasLeftSon() {
        return leftSon != null;
    }

    //右树是否为空
    public boolean hasRightSon() {
        return rightSon != null;
    }

    //插入节点
    public void insert(Integer data, Tree father) {
        /**
         * 思想：先让data和root中的值进行比较，大于0插入右边，小于0插入左边，计划使用递归思想
         */
        //等于root.data
        if (data.compareTo(father.data) == 0) {
            return;
        }
        //大于root.data
        if (data.compareTo(father.data) > 0) {
            //父节点没有右节点
            if (!father.hasRightSon()) {
                father.rightSon = new Tree();//生成一个右节点
                father.rightSon.data = data;//给右节点赋值
                father.rightSon.father = father;//指定右节点的父亲是谁
            } else {
                insert(data, father.rightSon);
            }
        }

        //小于同上
        if (data.compareTo(father.data) < 0) {
            //父节点没有左节点
            if (!father.hasLeftSon()) {
                father.leftSon = new Tree();//生成一个右节点
                father.leftSon.data = data;//给右节点赋值
                father.leftSon.father = father;//指定右节点的父亲是谁
            } else {
                insert(data, father.leftSon);
            }
        }
    }

    /**
     * 总体插入操作
     * 1.判断是否有树根，没有的话将数据添加到树根里
     * 2.有树根调用insert的重载方法，判断插入到左son还是右son
     *
     * @param data
     */
    public void insert(Integer data) {
        if (root == null) {
            root = new Tree();
            root.data = data;
            return;
        } else {
            insert(data, root);
        }
    }


}