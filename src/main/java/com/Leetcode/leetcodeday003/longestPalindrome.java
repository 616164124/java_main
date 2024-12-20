package com.Leetcode.leetcodeday003;

/**
 * 2019年12月12日 第 5 题 题目：最长回文子串（回文是一个正读和反读都相同的字符串） 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * <p>示例 1：
 *
 * <p>输入: "babad" 输出: "bab" 注意: "aba" 也是一个有效答案。
 *
 * <p>示例 2：
 *
 * <p>输入: "cbbd" 输出: "bb"
 *
 * <p>
 */
public class longestPalindrome {
    public static void main(String[] args) {

        System.out.println(longestPalindrome("abacdc"));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
