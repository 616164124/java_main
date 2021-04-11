/**
 * projectName: JUC fileName: LetterCombinationOfPhoneNumber.java packageName:
 * Leetcode.lettercombinationofphonenumber date: 2020-09-07 copyright(c) 2017-2020 xxx公司
 */
package com.Leetcode.lettercombinationofphonenumber;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: V1.0
 * @author: mikael
 * @className: LetterCombinationOfPhoneNumber
 * @packageName: Leetcode.lettercombinationofphonenumber
 * @description: 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * @date: 2020-09-07
 */
public class LetterCombinationOfPhoneNumber {
  private List<String> res = new ArrayList<>();
  private String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

  public static void main(String[] args) {
    String into = "23";
  }

  public static List<String> dfs(String string, String[] map) {

    return new ArrayList<>();
  }
}
