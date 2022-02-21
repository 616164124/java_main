package zb.算法.第一个收藏视频.寻找数组的中心下标;

import java.util.Arrays;

/**
 * @author mikael
 */
public class FirstMethod {
    public static void main(String[] args) {
        int[] a = {0, 9, 9, 9, 9};
        System.out.println(getIndex(a));
    }

    public static int getIndex(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
            if ((sum - total) == total) {
                return i;
            }
        }

        return -1;
    }
}
