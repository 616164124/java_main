package com.test;

public class StringSplitTest {
    public static void main(String[] args) {
        String pzbh = "e01408caeadd4d14a05de9ce1cfb0be9|TAX";
        String[] split = pzbh.split("\\|");
        System.out.println(split[0]);
    }
}
