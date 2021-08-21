package com.Leetcode;

import jdk.nashorn.internal.runtime.FindProperty;

import java.sql.Array;
import java.util.Arrays;

/**
 * 数组中有很多重复的数字，找到不重复的一个数字
 */
public class 数组只出现一次的数字 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        int i = find();
        l = System.currentTimeMillis()-l;
        System.out.println(l+"\t"+i);
    }

    public static int find() {
        int[] nums = {11,11 ,23,23,2, 3,3, 23, 2,1};
        //先进行升序排列
        Arrays.sort(nums);
        //枚举nums中的第偶数个数字
        for (int i = 0; i + 1 < nums.length; i += 2) {
            //如果数字和它后一位不相同，说明当前数字只出现了一个
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        //如果前面所有的数字都出现了两次，说明答案是最后一个数字
        return nums[nums.length - 1];
    }

}

