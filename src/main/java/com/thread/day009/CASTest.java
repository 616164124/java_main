package com.thread.day009;
/** AtomicReference 使用 （类似于乐观锁） */
import JUC.com.thread.day009.User;

import java.util.concurrent.atomic.AtomicReference;

public class CASTest {

  public static void main(String[] args) {
    JUC.com.thread.day009.User user3 = new JUC.com.thread.day009.User(1, "z3");
    JUC.com.thread.day009.User user4 = new JUC.com.thread.day009.User(2, "l4");

    AtomicReference<User> userAtomicReference = new AtomicReference<>();
    userAtomicReference.set(user3);

    System.out.println(
        userAtomicReference.compareAndSet(user3, user4)
            + "\t"
            + userAtomicReference.get().getName());
  }
}
