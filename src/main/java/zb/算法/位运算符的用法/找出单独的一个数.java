package zb.算法.位运算符的用法;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author mikael
 */
public class 找出单独的一个数 {
    public static void main(String[] args) {
        System.out.println(ThreadLocalRandom.current().nextInt(62));
        //数组
        int[] a = {1, 1, 2, 2, 23, 42153, 23, 3, 3};
        int x = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            x = (x ^ a[i + 1]);
        }
        System.out.println(x);
        int c = 13 ^ 13;
        System.out.println(c);
    }
}
