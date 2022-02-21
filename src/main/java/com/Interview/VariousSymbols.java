/**
 * projectName: JUC fileName: VariousSymbols.java packageName: Interview date: 2020-09-11
 * copyright(c) 2017-2020 xxx公司
 */
package com.Interview;

/**
 * @version: V1.0
 * @author: mikael
 * @className: VariousSymbols
 * @packageName: Interview
 * @description: 各种java符号计算 参考网址：https://blog.csdn.net/u012534326/article/details/85726431
 * @date: 2020-09-11
 */
public class VariousSymbols {
    public static void main(String[] args) {
        // >>：带符号右移。正数右移高位补0，负数右移高位补1。比如：
        // 4 >> 1，结果是2；-4 >> 1，结果是-2。-2 >> 1，结果是-1。
        // >>>：无符号右移。无论是正数还是负数，高位通通补0。
        // 对于正数而言，>>和>>>没区别。
        // 对于负数而言，-2 >>> 1，结果是2147483647（Integer.MAX_VALUE），-1 >>> 1，结果是2147483647（Integer.MAX_VALUE）。
        // 以下代码可以判断两个数的符号是否相等
        //    ((a >> 31) ^ (b >> 31)) == 0; // true 为相等，false为不相等
        int a = 32;
        int b = -3;
        if (((a >> 31) ^ (b >> 31)) == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        // 三目运算   必须有返回值   booleam？表达式1 ： 表达式2 ； 其中表达式1，2  必须有值返回；
        String s = (((a >> 31) ^ (b >> 31)) == 0) ? "a,b 都是正数" : "不是都是正数";
        System.out.println(s);
        // ~   取反  如果 a>=0 则 j 为a的绝对值+1 的负数
        //           如果 a<0  则j为a 的绝对值 -1 的正数
        int j = ~a;
        System.out.println("a的值\t" + a + " \t~之后的值 \t" + j);
        System.out.println();
        // 运算符 << 跟  >> ;
        double c = Math.pow(2, 3); // 立方的表示方法,2的立方
        int d = a << 3; // a 乘以 2的3次方
        System.out.println((c / 2) == 4);
        System.out.println(c + "\t" + d);
        System.out.println();
        // double, float类型 都不能完全精确表示出来 (2.0可以精确，2.1不能)
        // 要想完整表达用BigDecimal 来表达
        float f = 3.1f;
        double d2 = 100.1d;
        String s5 = f * 3 == 9.3 ? "true" : "false";
        String s6 = d2 * 3 == 300.3 ? "true" : "false";

        System.out.println(f * 3 + "\t" + s5 + "\t");
        System.out.println(d2 * 3 + "\t" + s6);

        int i = 3;
        int aa = 4;
        i = +1; // 相当于 i=i+1
        aa += 1; // 相当于  aa=1;
        System.out.println("i\t" + i);
        System.out.println("aa\t" + aa);
    }
}
