/**
 * projectName: JUC
 * fileName: Observer.java
 * packageName: designpatterns.observer
 * date: 2020-10-24
 * copyright(c) 2017-2020 xxx公司
 */
package com.designpatterns.observer;

public class Observer {
    public static void main(String[] args) {
        Son son = new Son();
        son.sys();

    }
}

class Father {
    public void sys() {
        System.out.println("Father say.....");
    }
}

class Son extends Father {
    public Son() {
        Father father = new Father();
        System.out.println("son say.........");
    }
}