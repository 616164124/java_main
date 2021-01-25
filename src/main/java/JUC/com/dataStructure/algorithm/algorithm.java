/**
 * projectName: JUC fileName: algorithm.java packageName: dataStructure.algorithm date: 2020-09-15
 * copyright(c) 2017-2020 xxx公司
 */
package JUC.com.dataStructure.algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @version: V1.0
 * @author: mikael
 * @className: algorithm
 * @packageName: dataStructure.algorithm
 * @description: 一个数组内全部组合
 * @data: 2020-09-15
 */
public class algorithm {
  public static void main(String[] args) {
    String[] array = new String[] {"1", "2", "3"};
    List<String> strings = Arrays.asList(array);
    LinkedList linkedList = new LinkedList(strings);
    System.out.println(linkedList);
    System.out.println(strings + "\t" + linkedList);
    listAll(Arrays.asList(array), "");
  }

  public static void listAll(List canditate, String prefix) {
    System.out.println(prefix);
    for (int i = 0; i < canditate.size(); i++) {
      List temp = new LinkedList(canditate);
      listAll(temp, prefix + temp.remove(i));
    }
  }
}
