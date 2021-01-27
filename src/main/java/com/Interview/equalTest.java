/**
 * projectName: JUC   
 * fileName: equalTest.java  
 * packageName: Interview   
 * date: 2020-10-02
 * copyright(c) 2017-2020 xxx公司  
 */
package com.Interview;

/**
 * @version: V1.0
 * @author: mikael
 * @className: equalTest
 * @packageName: Interview
 * @description: 各种情况下的==是否相等
 * @data: 2020-10-02
 **/
public class equalTest {
    public static void main(String[] args) {
        Integer a = new Integer("129");
        Integer b = new Integer("129");
        System.out.println(a == b); // false
        Integer a1 = new Integer("123");
        Integer b1 = 123;
        System.out.println(a1 == b1); // false
        Integer a2 = new Integer("123");
        Integer b2 = 123;
        System.out.println(a2 == b2); // false
        Integer a3 = 129;
        Integer b3 = 129;
        System.out.println(a3 == b3); // 值不在 -128~127之间的都为false 其他情况为 true
        final Integer a4 = 125;
        final Integer b4 = 125;
        System.out.println(a4 == b4); // false 与上同理
    }
}

