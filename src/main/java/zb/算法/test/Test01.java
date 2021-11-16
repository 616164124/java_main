package zb.算法.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.PriorityQueue;

/**
 * @author mikael
 */
public class Test01 {
    public static void main(String[] args) {
        //
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(11);
        queue.add(7);
        queue.add(5);
        queue.add(12);
        queue.add(2);
        queue.add(6);
        queue.add(14);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        boolean subsequence = isSubsequence("34", "1234");
        System.out.println(subsequence);
        String a = "loeeeng";
        String b = "neg";
        System.out.println(a.indexOf(b, 2));

        int i = a.indexOf(b);
        System.out.println(i);
        int aa=12,bb=12,cc=13;
        int u= aa^cc^bb;
        int uu=~aa;
        System.out.println(uu);
        int i1 = Integer.bitCount(1);

        System.out.println(i1);
        String r = Integer.toString(9, 2);



    }

    public static boolean isSubsequence(String s, String target) {
        for (int i = 0, pos = 0; i < s.length(); i++, pos++) {
            pos = target.indexOf(s.charAt(i), pos);
            if (pos == -1) return false;
        }
        return true;
    }

}
