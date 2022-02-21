package com.Interview;

import java.util.LinkedHashMap;

/**
 * key不重复 LinkedHashMap提供按照访问的次序来排序的功能
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        // true表明LinkedHashMap按照访问的次序来排序
        LinkedHashMap<Object, Object> objectObjectLinkedHashMap = new LinkedHashMap<>(1, 2, true);
        // false为按照插入顺序排，默认为false。
        LinkedHashMap<Object, Object> objectObjectLinkedHashMap2 = new LinkedHashMap<>(1, 2, false);

        for (int i = 0; i < 10; ++i) {
            objectObjectLinkedHashMap2.put("jklfjskl", "jhfks");
            objectObjectLinkedHashMap2.put("key" + i, "value" + i);
            objectObjectLinkedHashMap.put("item" + i, "value" + i);
        }
        // 为true时  查询时，把最新查出来的元素放在末位
        objectObjectLinkedHashMap.get("item4");
        System.out.println(objectObjectLinkedHashMap);
        // 为false时，获取后，objectObjectLinkedHashMap2排序无变化
        objectObjectLinkedHashMap2.get("key5");
        System.out.println(objectObjectLinkedHashMap2);


    }
}
