package com.Interview;

public class ClassPatterns {
    public static void main(String[] args) {
        father father = new father();
        son son = new son();
        father.father01();
        son.son01();
    }
}

class father {

    public void father01() {
        System.out.println("来自father");
    }

    public void say() {
        System.out.println("father say");
    }
}

class son extends father {
    public void son01() {
        System.out.println("来自son");
    }

    @Override
    public void say() {
        System.out.println("son say");
    }
}
