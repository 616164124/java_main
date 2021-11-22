package zb.算法.简单算法;

import zb.算法.common.CommonUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 桶排序 {
    public static void main(String[] args) {
        int[] aa = {1, 8, 7, 44, 42, 46, 38, 34, 33, 17, 15, 16, 27, 28, 24};
        int[] a = CommonUtil.randomInt(20);

        System.out.println(Arrays.toString(a));
        List[] buckets = new ArrayList[5];
        for (int i = 0; i < buckets.length; i++)//初始化
        {
            buckets[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < a.length; i++)//将待排序序列放入对应桶中
        {
            int index = a[i] / 10;//对应的桶号
            buckets[index].add(a[i]);
        }
        for (int i = 0; i < buckets.length; i++)//每个桶内进行排序(使用系统自带快排)
        {
            buckets[i].sort(null);
            for (int j = 0; j < buckets[i].size(); j++)//顺便打印输出
            {
                System.out.print(buckets[i].get(j) + " ");
            }
        }
    }

}
