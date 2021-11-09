package zb.算法.common;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author mikael
 */
public class IntUtil {

    /**
     * 产生range范围内 nums个数
     *
     * @param nums  个数
     * @param range 范围
     * @return int[]
     */
    public static int[] randomInt(int nums, int range) {
        int[] arr = new int[nums];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(range);
        }
        return arr;
    }

    /**
     * 产生nums个随机数组
     *
     * @param nums 个数
     * @return int[]
     */
    public static int[] randomInt(int nums) {

        int[] arr = new int[nums];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1000);
        }
        return arr;
    }

}
