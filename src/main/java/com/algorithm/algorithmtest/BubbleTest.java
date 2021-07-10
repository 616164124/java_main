package com.algorithm.algorithmtest;

import com.algorithm.sort.Bubble;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] a={1,2,5,2,77,11,32,87876,9};
        Bubble bubble = new Bubble();
            bubble.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
