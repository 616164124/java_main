package zb.算法.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author mikael
 */
public class Test01 {
    public static void main(String[] args) {
        //
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("11");
        queue.add("7");
        queue.add("5");
        queue.add("12");
        queue.add("2");
        queue.add("6");
        queue.add("14");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        PriorityQueue<HashMap<Integer, String>> queue2 = new PriorityQueue<>();
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(11, "h");
        hashMap1.put(8, "h");
        hashMap1.put(121, "h");
        hashMap1.put(56, "h");


        HashMap<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(1, "h");

        HashMap<Integer, String> hashMap3 = new HashMap<>();
        hashMap3.put(8, "h");

        queue2.add(hashMap1);

        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll().toString());
        }

    }

}
