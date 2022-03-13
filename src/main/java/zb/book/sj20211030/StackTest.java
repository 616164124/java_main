package zb.book.sj20211030;

import javax.xml.soap.Node;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * @author mikael
 */
public class StackTest {
    public static void main(String[] args) {
        //
        Queue queue= new PriorityQueue();
        queue.add("123");
        queue.add("45");
        queue.add("45");
        queue.add("45");

        System.out.println(queue);
        Stack<Object> stack = new Stack<>();
        stack.push("12");
        System.out.println(stack);
    }
}
