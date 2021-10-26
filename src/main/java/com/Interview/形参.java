package com.Interview;

/**
 * 形参不会改变
 */
public class 形参 {
    public static void main(String[] args) {
        int c = 9;
        int method = method(c);
        System.out.println(method+"\t"+c);
    }
    public static int method(int i){
        i=200;
        return i;
    }
}
