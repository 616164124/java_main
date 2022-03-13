package com.algorithm.algorithmtest;

import com.algorithm.sort.Selection;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        Integer[] a={1,2,5,2,77,11,32,98,7};
        Selection selection = new Selection();
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
