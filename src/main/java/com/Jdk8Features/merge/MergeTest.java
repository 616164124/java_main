package com.Jdk8Features.merge;

import com.dao.User;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Java 8 中 Map 骚操作之 merge() 的用法
 *
 * @author mikael
 */
public class MergeTest {
  public static void main(String[] args) {

    ArrayList<User> users = new ArrayList<>();
    User user1 = new User(1, "hua12", 12);
    User user2 = new User(1, "hua12", 11);
    User user3 = new User(1, "hua1", 37);
    User user4 = new User(1, "hua1", 33);
    users.add(user4);
    users.add(user3);
    users.add(user2);
    users.add(user1);
    HashMap<String, Integer> hashMap = new HashMap<>();
    // max 可以换成其他的形式
    //将计算的值存入hashmap中
    users.forEach(user -> hashMap.merge(user.getName(), user.getAge(), Integer::sum));
    System.out.println(hashMap.toString());
  }
}
