package com.Jdk8Features;

import JUC.com.Jdk8Features.User;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingUser {
  public static void main(String[] args) {
    List<JUC.com.Jdk8Features.User> objects =
        Arrays.asList(
            new JUC.com.Jdk8Features.User(12, "hua", 17),
            new JUC.com.Jdk8Features.User(22, "li2", 17),
            new JUC.com.Jdk8Features.User(22, "zhao1", 17),
            new JUC.com.Jdk8Features.User(12, "zhao1", 64));
    // 根据User的Age分组,然后以age为map的key返回
    Map<Integer, List<JUC.com.Jdk8Features.User>> collect =
        objects.stream().collect(Collectors.groupingBy(JUC.com.Jdk8Features.User::getAge));
    // 看看collect 跟collect2 中map的区别
    Map<String, List<JUC.com.Jdk8Features.User>> collect2 =
        objects.stream().collect(Collectors.groupingBy(User::getName));
    System.out.println(collect.get(64));
    System.out.println(collect2);
    // 字符串中区分数字跟字符
    String str = "jfksjf763jfl";
    char[] chars = str.toCharArray();
    StringBuffer stringBuffer = new StringBuffer();
    StringBuffer stringBuffer2 = new StringBuffer();
    for (char aChar : chars) {
      if (aChar < 'a') {
        stringBuffer.append(aChar);
      } else {
        stringBuffer2.append(aChar);
      }
    }
    System.out.println(stringBuffer);
    System.out.println(stringBuffer2);
  }
}
