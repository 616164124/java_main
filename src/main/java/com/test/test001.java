package com.test;


import java.math.BigDecimal;
import java.util.HashMap;

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
        HashMap<String, String> hashMap = new HashMap<>();
        System.out.println(hashMap.get("AA"));

        System.out.println("==================================================");
        BigDecimal multiply = new BigDecimal("0").multiply(new BigDecimal("0.03"));
        System.out.println(multiply.toString());
        HashMap<String, BigDecimal> hashMap1 = new HashMap<>();
        hashMap1.put("ttt", new BigDecimal(12222));
        hashMap1.put("ttt", new BigDecimal(12111));
        hashMap1.put("ttt", new BigDecimal(1222));
        hashMap1.put("ttt", new BigDecimal(133));
        hashMap1.put("ttt", new BigDecimal(13));
        System.out.println(hashMap1.get("ttt"));
    }

}
