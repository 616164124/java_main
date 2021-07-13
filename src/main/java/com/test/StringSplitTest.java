package com.test;

import java.math.BigDecimal;

public class StringSplitTest {
    public static void main(String[] args) {
        String pzbh = "e01408caeadd4d14a05de9ce1cfb0be9|TAX";
        String[] split = pzbh.split("\\|");
        String s = "85162.8465";
        String s1 = new BigDecimal(s).setScale(2, BigDecimal.ROUND_HALF_UP).toString();
        double v = Double.parseDouble(s1);
        System.out.println(v);
    }
}
