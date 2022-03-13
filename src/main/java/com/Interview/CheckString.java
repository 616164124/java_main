/**
 * projectName: JUC fileName: CheckString.java packageName: Interview date: 2020-09-06 copyright(c)
 * 2017-2020 xxx公司
 */
package com.Interview;

import java.util.regex.Pattern;

/**
 * @version: V1.0
 * @author: mikael
 * @className: CheckString
 * @packageName: Interview
 * @description: java中判断字符串是否为只包含数字
 * @date: 2020-09-06
 */
public class CheckString {
    public static void main(String[] args) {
        String str = "jsflfjsl";
        String string = "1234533512s";
        System.out.println("isNumber1\t" + isNumber1(str));
        System.out.println("isNumber2\t" + isNumber2(str));
        System.out.println("isNumber3\t" + isNumber3(str));
        System.out.println("isNumber1\t" + isNumber1(string));
        System.out.println("isNumber2\t" + isNumber2(string));
        System.out.println("isNumber3\t" + isNumber3(string));
        // 获取ascii值
        System.out.println(Integer.valueOf('9'));
        System.out.println(Integer.valueOf('a'));
        System.out.println(Integer.valueOf('z'));
        System.out.println(Integer.valueOf('A'));
        System.out.println(Integer.valueOf('B'));
    }

    // 采用正则表达式的方式
    public static boolean isNumber1(String str) {
        Pattern compile = Pattern.compile("[0-9]*");//[1-9][0-9]{4,}
        boolean matches = compile.matcher(str).matches();
        return matches;
    }

    // 采用ascii码
    public static boolean isNumber2(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > '9' || chars[i] < '0') {
                return false;
            }
        }
        return true;
    }

    // 采用char中自带的方法来判断是否为数字
    public static boolean isNumber3(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.length() <= 0 || !Character.isDigit(string.toCharArray()[i])) {
                return false;
            }
        }
        return true;
    }
}
