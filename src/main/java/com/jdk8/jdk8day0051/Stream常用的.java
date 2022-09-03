package com.jdk8.jdk8day0051;

import com.dao.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream常用的 {
    public static void main(String[] args) {
        List<String> ids = Arrays.asList("205", "10", "308", "49", "627", "193", "111", "193");
        //使用流操作
        List<User> results = ids.stream()
                .filter(s -> s.length() > 2)
                .distinct()
                .map(Integer::valueOf)
                .sorted(Comparator.comparingInt(o -> o))
                .limit(3)
                .map(id -> new User(id, "", id))
                .collect(Collectors.toList());

        System.out.println(results);
        /**
         * https://juejin.cn/post/7118991438448164878#heading-4
         *
         * 使用filter过滤掉不符合条件的数据
         * 通过distinct对存量元素进行去重操作
         * 通过map操作将字符串转成整数类型
         * 借助sorted指定按照数字大小正序排列
         * 使用limit截取排在前3位的元素
         * 又一次使用map将id转为User对象类型
         * 使用collect终止操作将最终处理后的数据收集到list中
         *
         */

    }
}
