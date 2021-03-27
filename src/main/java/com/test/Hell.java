package com.test;

import java.util.ArrayList;
import java.util.concurrent.atomic.LongAdder;

/** @author mikael */
public class Hell {
  public static void main(String[] args) {
    System.out.println("Miho");
    int i = 1234567891;

    LongAdder longAdder = new LongAdder();
    longAdder.add(1234567891011L);
    longAdder.increment();
    System.out.println(longAdder);
    int[] arr = new int[365];
    int aaa = 1;
    int sum = 300;
    while (sum < 1000000) {
      sum = (int) (sum * 1.04);
      aaa++;
      System.out.println(sum);
      arr[aaa] = sum;
    }
    System.out.println("天数：" + (aaa) + "\t");



    char a= 'a';
    int aa=1;
    switch (a){
      case 'a':
        aa++;
      case 'b':
        aa++;
      case 'c':
        aa++;
        break;
      default:
        aa--;
    }
    System.out.println("aa"+aa);

    int num=50;
    int cc=num;
    int dd=num;
    int ee=num;
    dd=+1;
    cc+=1;
    num=(num++)+1;
    ee=(++num)*2;

    System.out.println(num+"\t"+cc+"\t"+dd+"\t"+ee);

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(12);
    integers.get(12);

  }
}
