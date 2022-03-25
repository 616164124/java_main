package zb.算法.二叉树;

import java.util.Stack;

public class Test01 {
    public static void main(String[] args) {

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");

        nodeA.setLeft(nodeB);
        nodeA.setRight(nodeC);
        nodeC.setRight(nodeF);
        nodeB.setRight(nodeE);
        nodeB.setLeft(nodeD);
        nodeE.setLeft(nodeG);
        nodeC.setRight(nodeF);

        preOrder(nodeA);
        System.out.println();
        midOrder(nodeA);
        System.out.println();
        postOrder(nodeA);
        System.out.println();
        preOrder2(nodeA);
        System.out.println();
        midOrder2(nodeA);

    }

    /**
     * 先序遍历
     * @param root
     */
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.getValue());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
    public static void preOrder2(Node root){
        if(root==null){
            return;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node node = stack.pop();
            System.out.print(node.getValue());
            if(node.getRight()!=null){
                stack.push(node.getRight());
            }
            if(node.getLeft()!=null){
                stack.push(node.getLeft());
            }
        }
    }
    /**
     * 中序遍历
     */
    public static void midOrder(Node root){
        if(root==null){
            return;
        }
        midOrder(root.getLeft());
        System.out.print(root.getValue());
        midOrder(root.getRight());
    }
    public static void midOrder2(Node root){
        if(root==null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (!stack.isEmpty() || cur!=null){
            while (cur!=null){
                stack.push(cur);
                cur=cur.getLeft();
            }
            Node node = stack.pop();
            System.out.print(node.getValue());
            if(node.getRight()!=null){
                cur=node.getRight();
            }
        }
    }
    /**
     * 后序遍历
     */
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getValue());

    }
}
