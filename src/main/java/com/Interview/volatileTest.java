/**
 * projectName: JUC fileName: volatileTest.java packageName: Interview date: 2020-09-05 9:10
 * copyright(c) 2017-2020 xxx公司
 */
package com.Interview;

/**
 * @version: V1.0
 * @author: mikael
 * @className: volatileTest
 * @packageName: Interview
 * @description: volatile 数组 参考网址：https://blog.csdn.net/u014108122/article/details/38173201
 * @data: 2020-09-05
 */

// volatile修饰的变量如果是对象或数组之类的，其含义是对象获数组的地址具有可见性，但是数组或对象内部的成员改变不具备可见性：
public class volatileTest {
  static volatile int[] a = {1, 3};
  static volatile long b = 1L;

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      //
      new Thread(
              () -> {
                b++;
                System.out.println(Thread.currentThread().getName() + "\t" + b);
              },
              String.valueOf(i))
          .start();
    }
  }
}
