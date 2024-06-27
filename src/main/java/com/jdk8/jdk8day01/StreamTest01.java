package com.jdk8.jdk8day01;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 参考资料：https://blog.csdn.net/qq_39408587/article/details/122174695
 */
public class StreamTest01 {
    public static void main(String[] args) {
        Date date = new Date();

        List<User> userList =
                Arrays.asList(new User(56, "jkl"),
                        new User(12, "jkl"), new User(15, "lk"), new User(60, "tr"), new User(32, "op"));
        List<User> nameList =
                Arrays.asList(new User(56, "akl"),
                        new User(12, "bkl"), new User(15, "cck"), new User(60, "ccr"), new User(32, "cca"));

        List<User> dateList =
                Arrays.asList(new User(56, "akl",date),
                        new User(12, "bkl",date), new User(15, "cck",date), new User(60, "ccr",date), new User(32, "cca",date));


        //        根据id进行排序(由小到大排序)
        userList.stream().map(User::getId).sorted().forEach(System.out::println);
        System.out.println("========根据id进行排序（由大到小排序）======================");
        // 根据id进行排序（由大到小排序）
        List<User> collect = userList.stream().sorted(Comparator.comparing(User::getId).reversed()).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("========根据id进行排序（由小到大排序）======================");
        List<User> collect2 = userList.stream().sorted(Comparator.comparing(User::getId)).collect(Collectors.toList());
        collect2.forEach(System.out::println);
        System.out.println("========根据name进行排序（由小到大排序）======================");
        List<User> collect3 = nameList.stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
        collect3.forEach(System.out::println);
        System.out.println("========根据date进行排序（由小到大排序）======================");
        List<User> collect4 = dateList.stream().sorted(Comparator.comparing(User::getDate)).collect(Collectors.toList());
        collect4.forEach(System.out::println);

    }
}
