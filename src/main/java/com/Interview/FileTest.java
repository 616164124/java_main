package com.Interview;
/** 获取file */
import com.sun.net.httpserver.Filter;
import com.sun.net.httpserver.HttpExchange;

import java.io.File;
import java.io.IOException;

//     c:\\123\output.txt
public class FileTest {
  public static void main(String[] args) {
    // 获取文件的父级文件夹名
    String fileParent = (new File("c:\\123\\output.txt")).getParent();
    System.out.println(fileParent);
    System.out.println("------------------------------");
    // 遍历该目录下的所有文件
    File file = new File("F:\\123\\");

    String[] list = file.list();
    for (String name : list) {
      System.out.println(name);
    }
    File[] files = file.listFiles();
    for (File file1 : files) {
      if (!file1.isDirectory()) {
        System.out.println("不是文件夹");
      } else {
        System.out.println("是文件夹");
      }
      String path = file1.getPath();
      System.out.println(path);
    }
    Filter filter =
        new Filter() {
          @Override
          public void doFilter(HttpExchange httpExchange, Chain chain) throws IOException {}

          @Override
          public String description() {
            return null;
          }
        };
  }
}
