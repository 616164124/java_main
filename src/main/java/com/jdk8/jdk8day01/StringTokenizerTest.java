package com.jdk8.jdk8day01;

import java.util.StringTokenizer;

/**
 * 2019年12月14日
 *
 * <p>分割符为：，
 *
 * <p>Java StringTokenizer 类使用方法 1. int countTokens()：返回nextToken方法被调用的次数。 2. boolean
 * hasMoreTokens()：返回是否还有分隔符。 3. boolean hasMoreElements()：返回是否还有分隔符。 4. String
 * nextToken()：返回从当前位置到下一个分隔符的字符串。 5. Object nextElement()：返回从当前位置到下一个分隔符的字符串。 6. String
 * nextToken(String delim)：与 4 类似，以指定的分隔符返回结果。
 */
public class StringTokenizerTest {
    public static void main(String[] args) {

        String s = "jkfm,jlkfs";

        StringTokenizer stringTokenizer =
                new StringTokenizer(s, ",", true); // true时,分隔符也输出,false时不将分割符输出
        while (stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextElement());
        }
    }
}
