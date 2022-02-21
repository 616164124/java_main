package com.jdk8.jdk8day003;

enum Type implements Print {
    A {
        @Override
        public String Print() {
            return "a";
        }
    },
    B {
        @Override
        public String Print() {
            return "B";
        }
    },
    C {
        @Override
        public String Print() {
            return "C";
        }
    },

    D {
        @Override
        public String Print() {
            return "C";
        }
    },
}

interface Print {

    String Print();
}

/**
 * 使用enum；来代替实现if/else的功能
 */
public class TestEnum {
    public static void main(String[] args) {

        System.out.println(Type.valueOf("A").Print());
    }
}
