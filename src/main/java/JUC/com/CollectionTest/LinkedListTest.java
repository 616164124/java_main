/**
 * projectName: JUC fileName: LinkedListTest.java packageName: CollectionTest date: 2020-09-06
 * copyright(c) 2017-2020 xxx公司
 */
package JUC.com.CollectionTest;

import java.util.LinkedList;

/**
 * @version: V1.0
 * @author: mikael
 * @className: LinkedListTest
 * @packageName: CollectionTest
 * @description: LinkedList的测试
 * @data: 2020-09-06
 */
public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
    strings.add("123");
    strings.add("ttttt");
    strings.add("ssss");
    strings.add("3");
    System.out.println(strings);
    System.out.println(strings.get(0));
  }
}
