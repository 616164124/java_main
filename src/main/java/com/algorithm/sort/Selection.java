package com.algorithm.sort;

/**
 * 选择排序
 */
public class Selection {
    //对数组a进行排序
    public static void sort(Comparable[] a){
        for(int i=0 ;i<a.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<a.length;j++){
                if(greater(a[minIndex],a[j])){
                    minIndex=j;
                }
            }
            exch(a, i, minIndex);
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
