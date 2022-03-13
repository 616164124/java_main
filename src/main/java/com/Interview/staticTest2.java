package com.Interview;

public class staticTest2 {
}

class A1 {

    public A1() {
        System.out.print(" A gouzhao");
    }

    static {
        System.out.print("static");
        System.out.print("  static 2");
    }

    {
        System.out.print(" A1");
    }
}

class B extends A1 {
    public B() {
        System.out.println(" B");
    }

    public static void main(String[] args) {
        //
        System.out.println(" ---------");
        B b = new B();
    }
}
