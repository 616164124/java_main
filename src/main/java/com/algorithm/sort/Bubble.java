package com.algorithm.sort;

/**
 * 冒泡排序
 */
public class Bubble {
    //对数组a进行排序
    public static void sort(Comparable a[]){
        for(int i=a.length-1 ;i>0;i--){
            for(int j=0;j<i;j++){
                if(greater(a[j+1],a[j])){
                    exch(a, j,j+1 );
                }
            }
        }
    }
    //比较元素大小
    public static boolean greater(Comparable x,Comparable y){
        return x.compareTo(y)>0;
    }
    //数组交换位置
    public static void exch(Comparable[] a,int i ,int j){
            Comparable temp;
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
    }
}
