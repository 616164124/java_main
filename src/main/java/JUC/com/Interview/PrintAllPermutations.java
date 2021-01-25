/**
 * projectName: JUC fileName: PrintAllPermutations.java packageName: Interview date: 2020-09-06
 * copyright(c) 2017-2020 xxx公司
 */
package JUC.com.Interview;

import java.util.HashSet;

/**
 * @version: V1.0
 * @author: mikael
 * @className: PrintAllPermutations
 * @packageName: Interview
 * @description: Java 中，怎么打印出一个字符串的所有排列
 * @data: 2020-09-06
 */
public class PrintAllPermutations {
  public static void main(String[] args) {
    String str = "acc";
    char[] chars = str.toCharArray();
    //  permutation(chars, 0);
    System.out.println("++++++++++++++++++++++");
    HashSet<Object> hashSet2 = new HashSet<>();
    hashSet2.add("acc");
    hashSet2.add("acc");

    hashSet2.add("acc");
    hashSet2.add("acc");

    hashSet2.add("ac3");
    hashSet2.add("acc");
    for (Object o : hashSet2) {
      //
      System.out.println(o);
    }
  }

  /*
   * @Description:
   * @Author: mikael
   * @Date: 2020/46/06
   * @param str:
   * @return: i : i为第几个字开始调换位置 例如 str="abc"，i=1;则a的位置不变，从b开始
   **/
  public static void permutation(char[] str, int i) {
    if (i >= str.length) return;
    if (i == str.length - 1) {
      System.out.println(String.valueOf(str));
    } else {
      for (int j = i; j < str.length; j++) {
        char temp = str[j];
        str[j] = str[i];
        str[i] = temp;
        permutation(str, i + 1);
        temp = str[j];
        str[j] = str[i];
        str[i] = temp;
      }
    }
  }
}
