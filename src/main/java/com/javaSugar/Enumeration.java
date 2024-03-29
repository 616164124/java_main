package com.javaSugar;

// 从左到右分别为0-3；
// () 括号中的值从0开始
enum IntegarTest {
    one(1) {
        @Override
        void Tell() {
            System.out.println("IntegarTest  one");
        }
    },
    two(2) {
        @Override
        void Tell() {
            System.out.println("IntegarTest  two");
        }
    };
    private final int i;

    IntegarTest(int i) {
        this.i = i;
    }
    // 抽象方法
    abstract void Tell();
    public  void teach(){
        System.out.println("IntegarTest....teach....");
    }
}

// 字符串相匹配
enum Week {
    one {
        @Override
        void Tell() {
            System.out.println("week  one");
        }
    },
    two {
        @Override
        void Tell() {
            System.out.println("week two");
        }
    },
    three {
        @Override
        void Tell() {
            System.out.println("week  three");
        }
    },
    four {
        @Override
        void Tell() {
            System.out.println("week  four");
        }
    },
    five {
        @Override
        void Tell() {
            System.out.println("week  five");
        }
    },
    six {
        @Override
        void Tell() {
            System.out.println("week  six");
        }
    },
    seven {
        @Override
        void Tell() {
            System.out.println("week  seven");
        }
    };

    // 抽象方法
    abstract void Tell();
}

/**
 * 枚举 枚举的概述： 枚举是在一定范围内取值,并且这个值必须是枚举类型中的任意一个,并且只能有一个 特点: 1.必须在规定范围内取值 2.这个值只能取一个 3.这个值可以是规定范围内的任意一个
 *
 * <p>参考网址
 * ：https://blog.csdn.net/qq_31655965/article/details/55049192?depth_1-utm_source=distribute.pc_relevant.none-task&utm_source=distribute.pc_relevant.none-task
 */
public class Enumeration {
    public static void main(String[] args) {
        String a = "one";
        String b = "klfjls";
        int i = 1;
        // 遍历出integarTest中的值,取相应方法中
        for (IntegarTest integarTest : IntegarTest.values()) {
            System.out.println("integarTest.ordinal()=======" + integarTest.ordinal());
            if (integarTest.ordinal() == i) {
                System.out.println("+++++++if+++++++++++++");
                System.out.println("integarTest.name()++++++" + integarTest.name());
                integarTest.Tell();
                System.out.println("++++++++++++++++++++");
            }
        }
        // 采用枚举来判断执行哪个方法
        Week.valueOf(a).Tell();
        try {
            Week.valueOf(b).Tell();
        } catch (IllegalArgumentException e) {
            System.out.println("b值有问题");
        }

        System.out.println(" -----------Week.valueOf(a).Tell();--------------");
        Week.five.Tell();
        System.out.println("------------------------------------------");
        Week.values()[1].Tell();



    }
}
