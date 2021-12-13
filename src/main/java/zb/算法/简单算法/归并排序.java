package zb.算法.简单算法;

import zb.算法.common.CommonUtil;

import java.util.Arrays;

public class 归并排序 {
    // 归并排序的实现
    public static void main(String[] args) {
        int[] nums = CommonUtil.randomInt(10);
        System.out.println(Arrays.toString(nums));
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }

    public static int[] sort(int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        if (left < right) {
            // 左边
            sort(nums, left, mid);
            // 右边
            sort(nums, mid + 1, right);
            // 左右归并
            merge(nums, left, mid, right);
        }
        return nums;
    }

    public static void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;

        // 把较小的数先移到新数组中
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // 把右边边剩余的数移入数组
        while (j <= right) {
            temp[k++] = nums[j++];
        }

        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            nums[k2 + left] = temp[k2];
        }

    }


}
