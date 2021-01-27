package com.thread.forkjoin;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @version: V1.0
 * @author: mikael
 * @className: ForkjoinTest
 * @packageName: thread.forkjoin
 * @description:
 * @data: 2021-01-17
 */
public class ForkjoinTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] i = {1, 2, 312, 23};
        System.out.println(Arrays.toString(i));
        // 生成随机数组
        int[] a = gennerateArray(5, 34);
        // System.out.println("单线程执行结果: " + ArrayUtils.sum(a));
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        SumTask task = new SumTask(a, 0, a.length - 1);
        // 提交任务
        ForkJoinTask<Integer> result = forkJoinPool.submit(task);
        System.out.println("fork.join执行结果: " + result.get());
    }

    //生成随机的数组
    public static int[] gennerateArray(int len, int max) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * max);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

class SumTask extends RecursiveTask<Integer> {

    private int THREHOLD = 10;
    private int[] src;
    private Integer left;
    private Integer right;

    public SumTask(int[] src, Integer left, Integer right) {
        this.src = src;
        this.left = left;
        this.right = right;
    }

    @Override
    protected Integer compute() {

        if ((right - left) < THREHOLD) {
            Integer sum = 0;
            System.out.println(left + " to " + right);
            for (int i = left; i <= right; i++) sum += src[i];
            return sum;
        }
        // 拆分数组
        Integer mid = (left + right) >> 1;
        SumTask leftTask = new SumTask(src, left, mid);
        SumTask rightTask = new SumTask(src, mid + 1, right);
        invokeAll(leftTask, rightTask);
        return leftTask.join() + rightTask.join();
    }
}