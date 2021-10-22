package zb.算法.位运算符的用法;

import java.util.Random;

/** @author mikael */
public class 一个正整数的二进制有几个1 {
  public static void main(String[] args) {

    int i = new Random().nextInt(60);
    int count=0;
    System.out.println(i + "\t" + Integer.toString(i, 2));
    for (int a = 0; a < 32; a++) {
      if ((i & (1 << a)) == (1 << a)) {count++;}
    }
    //证明是否为2的次方
    i=8;
    System.out.println(Integer.toString(13, 2));

    System.out.println(count);
    if((i&(i-1))==0){
      System.out.println(i);
    }

  }
}
