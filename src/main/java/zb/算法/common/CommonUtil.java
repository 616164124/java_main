package zb.算法.common;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author mikael
 */
public class CommonUtil {

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

    /**
     * 将i和j位置上的数据互换
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        if(arr==null||arr.length==0){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * i,j不能相等
     * @param arr
     * @param i
     * @param j
     */
    public static void swap2(int[]arr,int i ,int j){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }

    public static void main(String[] args) {
        int[] arr={1,23,4};
        swap2(arr,0,2);
        System.out.println(Arrays.toString(arr));
    }
}
