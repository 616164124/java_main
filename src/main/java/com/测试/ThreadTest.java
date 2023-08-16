package com.测试;

public class ThreadTest extends Thread {

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.run1();
        System.out.println("main");
    }

    public void run1() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run");

    }




}
