package com.test;


public class test001 {
    public static void main(String[] args) {
        String sss="123|TAX";
        System.out.println(sss);

        boolean contains = sss.contains("|TAX");
        System.out.println(contains);

        String[] split = sss.split("\\|");
        System.out.println(split[0]);
        if(1==1)
        System.out.println("1==1");
        System.out.println("1111");

    }

}
