/**
 * projectName: JUC fileName: StringTest.java packageName: Interview date: 2020-10-11 copyright(c)
 * 2017-2020 xxx公司
 */
package com.Interview;

/**
 * @version: V1.0
 * @author: mikael
 * @className: StringTest
 * @packageName: Interview
 * @description:
 *     String.intern()方法是一种手动将字符串加入常量池中的方法，原理如下：如果在常量池中存在与调用intern()方法的字符串等值的字符串，就直接返回常量池中相应字符串的引用，否则在常量池中复制一份该字符串
 * @date: 2020-10-11
 */
public class StringInternTest {
  public static void main(String[] args) {
    String s1 = new String("java");
    String s2 = new String("java").intern();
    String s3 = "java";
    String s4 = s3.intern();

    System.out.println(s1 == s1.intern());
    System.out.println(s1 == s3);
    System.out.println(s3 == s4);
    System.out.println(s3.intern() == s3);
    System.out.println("-------------------------");

    String a = "java";
    System.out.println(a == a.intern());
    System.out.println("-------------------------");

    String s5 = new StringBuilder("ja").append("va").toString();
    System.out.println("s5\t" + (s5 == s5.intern()));

    String s11 = new StringBuilder("sp").append("gr").toString();
    System.out.println("s11\t" + (s11 == s11.intern()));

    String s12 = new StringBuilder("re").append("dis").toString();
    System.out.println("s12\t" + (s12 == s12.intern()));

    String s13 = new StringBuilder("te").append("ee").toString();
    System.out.println("s13\t" + (s13 == s13.intern()));
    // 字符串反转
    StringBuffer abc = new StringBuffer("abc");
    String s = abc.reverse().toString();
    System.out.println(s);

    char[] chars = s.toCharArray();
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < chars.length; ++i) {
      stringBuilder.append(chars[chars.length - i - 1]);
    }
    System.out.println(stringBuilder.toString());
  }
}
