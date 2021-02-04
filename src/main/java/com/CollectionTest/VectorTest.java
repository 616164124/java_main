package com.CollectionTest;




import com.dao.User;

import java.util.*;

// 线程安全  容量按old +old 的量增加
public class VectorTest {
  public static void main(String[] args) {
    Vector vector = new Vector();
    vector.add(1);
    vector.add(1);
    vector.add(1);
    vector.add(1);
    System.out.println(vector);
    Set<Integer> integers = new HashSet<>();

    // 有序集合的实现  根据key来排序
    TreeMap<Object, Object> o1 = new TreeMap<>();
    o1.put(1, "111");
    o1.put(4, "33");
    o1.put(2, "2222");
    o1.put(3, "444");
    System.out.println(o1);
    // 字符串的key
    TreeMap<Object, Object> o2 = new TreeMap<>();
    o2.put("1", "111");
    o2.put("a", "33");
    o2.put("3", "2222");
    o2.put("c", "444");
    System.out.println(o2);
    // 需要指定list中的类型
    List<String> objects = new ArrayList<>();
    objects.add("ni");
    objects.add("1");
    objects.add("3");
    objects.add("ll");
    Collections.sort(objects);
    System.out.println(objects);
    // 自定义排序
    List<User> userList =
        Arrays.asList(
            new User(12, "hua", 17),
            new User(22, "li2", 17),
            new User(22, "zhao1", 17),
            new User(12, "zhao1", 64));
    Collections.sort(
        userList,
        new Comparator<User>() {
          @Override
          // 可以自定义哪个字段来排序 参考网址
          // https://www.cnblogs.com/yw0219/p/7222108.html?utm_source=itdadao&utm_medium=referral
          public int compare(User o1, User o2) {
            return o1.getAge() - o2.getAge();
          }
        });
    System.out.println(userList);
    // jkd8 新特性写法 根据 number 排序
//    userList.stream().map(user -> user.getNumber()).sorted().forEach(System.out::print);
    System.out.println(userList);
  }
}
