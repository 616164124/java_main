package zb.算法.二叉树;

public class Node {
    private String value;        //节点的值
    private Node node;        //此节点，数据类型为Node
    private Node left;        //此节点的左子节点，数据类型为Node
    private Node right;       //此节点的右子节点，数据类型为Node

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(String value) {
        this.value=value;
        this.left=null;
        this.right=null;
    }
    public String toString() {         //自定义的toString方法，为了方便之后的输出
        return this.value+" ";
    }
}