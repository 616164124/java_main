package com.SynclnDetail;

import java.util.concurrent.TimeUnit;

/** threadLocal 只跟当前线程有关 */
public class T03_ThreadLocal<userThreadLocal> {

  static ThreadLocal<User> userThreadLocal = new ThreadLocal<User>();
  static ThreadLocal<Integer> userThreadLocal1 = new ThreadLocal<Integer>();

  public static void main(String[] args) {

    new Thread(
            () -> {
              System.out.println(
                  userThreadLocal
                      .get()); // 将userThreadLocal 作为一个key塞入threalocalmap中，而这个key作为弱引用指向 ThreadLocal
            })
        .start();

    new Thread(
            () -> {
              userThreadLocal.set(new User("hua", 12));
            })
        .start();

    new Thread(
            () -> {
              userThreadLocal1.set(1);
              try {
                TimeUnit.SECONDS.sleep(5);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            },
            "integer set 1 ")
        .start();

    new Thread(
            () -> {
              System.out.println(userThreadLocal1.get());
            },
            "integer set 1 ")
        .start();
  }
}

class User {
  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  private String name;
  private int age;
}
