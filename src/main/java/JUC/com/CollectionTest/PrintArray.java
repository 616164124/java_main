/**
 * projectName: JUC fileName: PrintArray.java packageName: CollectionTest date: 2020-09-06
 * copyright(c) 2017-2020 xxx公司
 */
package JUC.com.CollectionTest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @version: V1.0
 * @author: mikael
 * @className: PrintArray
 * @packageName: CollectionTest
 * @description: JAVA 打印数组
 * @data: 2020-09-06
 */
public class PrintArray {
  public static void main(String[] args) {
    int[] a = {1, 3, 4, 66, 353, 666};
    // 打印数组方式一
    Arrays.stream(a).forEach(System.out::println);
    System.out.println();
    // 打印数组方式二
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
    // 打印数组方式三
    System.out.println(Arrays.toString(a));
    System.out.println();
    // 打印数组方式四 增强for循环
    for (int c : a) {
      System.out.println(c);
    }
    System.out.println();
    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(6);
    integers.add(4);
    System.out.println(integers);
  }
}
