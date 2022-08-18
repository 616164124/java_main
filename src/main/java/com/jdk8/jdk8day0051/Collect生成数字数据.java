package com.jdk8.jdk8day0051;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Collect生成数字数据 {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(10, 20, 30, 40, 50);
        //平均数
        Double collect = ids.stream().collect(Collectors.averagingInt(s -> s));
        System.out.println("平均数====》"+collect);
        //数据统计信息（总数，平均数，最大值，最小值）
        IntSummaryStatistics collect1 = ids.stream().collect(Collectors.summarizingInt(vale -> vale));
        System.out.println("总数====》"+collect1);

    }
}
