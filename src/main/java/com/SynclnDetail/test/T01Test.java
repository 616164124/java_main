package com.SynclnDetail.test;

public class T01Test {
    public static void main(String[] args) {
        T01Test t01Test = new T01Test();
        Thread thread = new Thread(t01Test::say,"t01say");
        thread.start();

    }

    void say(){
        System.out.println("this is say!!!");
    }

}
