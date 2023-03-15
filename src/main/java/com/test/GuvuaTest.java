package com.test;

import com.google.common.base.Strings;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

public class GuvuaTest {
    public static void main(String[] args) {
        Table<String,String,Integer> hashBaseTable = HashBasedTable.create();

        String aa=null;
        if (Strings.isNullOrEmpty(aa)) {
            throw new IllegalArgumentException("不能为空");
        }
        System.out.println("============");


    }
}
