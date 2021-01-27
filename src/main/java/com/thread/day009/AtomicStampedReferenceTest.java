package com.thread.day009;

import JUC.com.thread.day009.User;

import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReferenceTest {

  public static void main(String[] args) {

    JUC.com.thread.day009.User z3 = new JUC.com.thread.day009.User(1, "z3");

    JUC.com.thread.day009.User l4 = new JUC.com.thread.day009.User(2, "l4");

    AtomicStampedReference<JUC.com.thread.day009.User> userAtomicStampedReference =
        new AtomicStampedReference<User>(z3, 1);

    userAtomicStampedReference.compareAndSet(z3, l4, 1, 2);
    System.out.println(userAtomicStampedReference.getReference().toString());
  }
}
