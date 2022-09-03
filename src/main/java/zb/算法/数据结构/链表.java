package zb.算法.数据结构;


import java.util.Arrays;
import java.util.List;

/**
 * @author mikael
 */
public class 链表 {
    private static class Node {
        int item;
        Node next;
    }

    public static void main(String[] args) {
        Node one = new Node();
        Node two = new Node();
        Node three = new Node();
        one.next = two;
        two.next = three;

        /***************************************************/
        List<Integer> list = Arrays.asList(12, 12, 342, 5, 13, 3214, 513);
        list.stream().distinct().sorted()
                .forEach(System.out::println);



    }
}
