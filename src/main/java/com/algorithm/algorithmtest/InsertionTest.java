package com.algorithm.algorithmtest;

import com.algorithm.sort.Insertion;

import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a={1,2,5,2,77,11,32,787,8};
        Insertion insertion = new Insertion();
        insertion.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
