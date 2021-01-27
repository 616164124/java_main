package com.Jdk8Features;



import JUC.com.Jdk8Features.User;

import java.util.Optional;

/**
 * 参考网址：https://blog.csdn.net/u012068483/article/details/102783572?depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-1&utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-1
 *
 * <p>
 *
 * <p>List<Employee> employees = Optional.ofNullable(company).// 若company为空,则返回空Optional
 * map(theCompany -> theCompany.getEmployees()). // 若getEmployees()返回空,则返回空Optional
 * orElse(Collections.EMPTY_LIST); // 若上述两步中有一步为空,则返回空列表
 *
 * <p>// 遍历员工列表employees employees.forEach(employee -> System.out.println(employee));
 */
public class OptionalTest {
  public static void main(String[] args) {
    Optional<Object> o = Optional.ofNullable(null);
    Optional<Integer> o2 = Optional.ofNullable(1);
    JUC.com.Jdk8Features.User user = new JUC.com.Jdk8Features.User(23, "fks");
    // 判断user 是否为null，如果是null则new User（）不是返回 user
    JUC.com.Jdk8Features.User user1 = Optional.ofNullable(user).orElse(new JUC.com.Jdk8Features.User(232, "uyihk"));
    Optional<User> user2 = Optional.ofNullable(user);
    System.out.println(user2.get().getName());
    System.out.println(user1.getName());
  }
}
