/**
 * projectName: JUC fileName: HashMapTest.java packageName: Interview date: 2020-09-11 copyright(c)
 * 2017-2020 xxx公司
 */
package com.Interview;




import com.dao.User;

import java.util.HashMap;

/**
 * @version: V1.0
 * @author: mikael
 * @className: HashMapTest
 * @packageName: Interview
 * @description: HashMap测试
 * @data: 2020-09-11
 */
public class HashMapTest {
  public static void main(String[] args) {
    HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
    User user1 = new User(1, "hua", 1);
    User user2 = new User(1, "hua", 1);
    System.out.println(user1.hashCode() + "\t" + user2.hashCode());
    objectObjectHashMap.put(user1, "fhsjk");
    objectObjectHashMap.put(user1, "fhsjk");
    String s1 = "Ma", s2 = "Ma";
    System.out.println(s1.hashCode() + "\t" + s2.hashCode());
    objectObjectHashMap.put(s1, "fjks");
    objectObjectHashMap.put(s2, "fjks");
    // hashmap 中的key值计算 是 hash（key.hashcode） 解释是对key进行了2次的hash计算
    // 源码jdk8： (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);

    System.out.println(objectObjectHashMap);
  }
}
