package com.jdk8.jdk8day01;



import JUC.com.thread.day009.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 具体内容参考网站 https://www.jianshu.com/p/932ef18941fb
 *
 * <p>初始创建stream
 *
 * <p>中间操作 https://www.jianshu.com/p/932ef18941fb
 *
 * <p>筛选与切片 filter limit skip distinct
 */
public class StreamTest {

  public static void main(String[] args) {

    List<User> userList =
        Arrays.asList(
            new User(12, "jkl"), new User(15, "lk"), new User(60, "tr"), new User(32, "op"));

    List<String> stringList = Arrays.asList("aa", "oi", "ere", "tr", "AbA");
   // List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);

    // 根据集合中的stream（）创建
    Stream<String> stringStream = stringList.stream();

    List<String> stringList1 = new ArrayList<>();

    stringList.stream().map((s) -> s.toUpperCase()).forEach(System.out::println); // 转化成大写
    System.out.println("---------------filter----------------");
    stringList.stream()
        .filter((s) -> s.endsWith("A") || s.startsWith("A"))
        .forEach(System.out::println);
    stringList.stream()
        .filter((s) -> s.startsWith("a"))
        .forEach(System.out::println); // 过滤不符合（(s)->s.startsWith("a")）条件的内容
    System.out.println("---------------limit----------------");
    stringList.stream().limit(2).forEach(System.out::println); // 截取stringList前面2个元素    skip即跳过几条记录
    System.out.println("---------------sorted----------------");

    userList.stream().map(User::getAge).sorted().forEach(System.out::println); // user按age排序由小到大
    System.out.println("---------------allMatch----------------"); // allMathc  代表这个流里是否全部符合条件
    System.out.println(stringList.stream().allMatch((s) -> s.startsWith("A") && s.endsWith("A")));
    System.out.println("---------------reduce----------------");
    System.out.println(stringList.stream().reduce("", (x, y) -> x + y));
    System.out.println("sff");
  }
}
