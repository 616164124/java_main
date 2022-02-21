package com.Interview;

/**
 * java 值的传递
 */
public class TransferOfValue {
    int c = 4;

    public static void main(String[] args) {
        A o = new A();
        int b = 4;
        int cc = new TransferOfValue().c;
        test(o, b, cc);
        System.out.println(o == o);
        System.out.println(o == null);
        System.out.println("-------------");
        System.out.println(b);
        System.out.println(o.a);
        System.out.println(cc);
        System.out.println("----------------------------");
        Integer i = 100;
        int ii = 100;
        Integer ai = 200;
        int aii = 200;
        System.out.println("---------integer 当integer的 值大于127时会new integer--------");
        Integer integeri = 128;
        Integer integera = 128;
        System.out.println(i == ii); // true
        System.out.println(ai == aii); // true
        System.out.println(integera == integeri); // false
        System.out.println("----------short += ---------------------------------");
        short short1 = 1;
        // short1 =  short1+1; //编译错误
        short1 += 1; // +=是 java 语言规定的运算符，java 编译器会对它 进行特殊处理，因此可以正确编译
    }

    static void test(A o, int b, int c) {
        o.a = 400; // 传入的是一个对象时，改变了值则在主程序中也发生改变
        b = 300;
        c = 500;
        System.out.println("o==null\t" + (o == null));
        System.out.println("b =" + b);
    }
}

class A {
    int a = 1;
}
