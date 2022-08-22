package com.CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * arraylist 由数组构成，
 *
 * @author mikael
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // 有序可重复
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();

        arrayList.add("14");
        System.out.println(arrayList.size() + '\t');

        arrayList.add("14");
        System.out.println(arrayList.size() + '\t');

        arrayList.add("12");
        System.out.println(arrayList.size() + '\t');
        arrayList.add("9");
        arrayList.add("98");
        arrayList.add("28");
        System.out.println(arrayList.size() + '\t');

        arrayList.add("14");
        System.out.println(arrayList.size() + '\t');

        arrayList.add("12");
        System.out.println(arrayList.size() + '\t');

        arrayList.add("9");
        System.out.println(arrayList.size() + '\t');

        arrayList.add("98");
        System.out.println(arrayList.size() + '\t');

        arrayList.add("28");
        System.out.println(arrayList.size() + '\t');

        arrayList.add("14"); // size都是在10的基础上往上叠加的
        arrayList2.addAll(arrayList); //  ArrayList2的size 直接生成ArrayList。size生成
        System.out.println(arrayList.size() + '\t');
        System.out.println(arrayList);

        System.out.println(arrayList2);
        System.out.println(arrayList2.size());
        int a = 10;
        int b = a + (a >> 1);
        System.out.println(b);

        ArrayList<Object> objects = new ArrayList<>();
        finalizeTest finalizeTest = new finalizeTest();
        List arrayList1 = arrayList;
        arrayList1.forEach((aa) -> System.out.print(aa));
        Iterator iterator = arrayList1.iterator();
        System.out.println("===============1==========");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===========2========");
        for (Object i : arrayList)
        System.out.println("===========3========");
        arrayList.forEach((cc) -> System.out.print(cc+" "));


    }
}

class finalizeTest {
    @Override
    public void finalize() {
        System.out.println("实现了finalize");
    }
}