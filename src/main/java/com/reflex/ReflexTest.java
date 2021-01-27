package com.reflex;

import java.util.Properties;

/** 反射获取方法 */
public class ReflexTest {
  // 测试 githua
  public static void main(String[] args) throws ClassNotFoundException {

    // 方法一  会抛出 ClassNotFoundException 的异常
   // Class<?> aClass = Class.forName("com.reflex.Book"); // forname 进行了将book类初始化
    // 方法二
    Class<Book> bClass = Book.class;
    // 方法三
    Book book;
    book = new Book();
    Class<? extends Book> aClass1 = book.getClass();
    // 返回都为true
   // System.out.println(aClass == bClass);
    System.out.println(bClass == aClass1);
    // 获取jdk版本
    Properties properties = (Properties) System.getProperties();
    System.out.println(properties);
  }
}

class Book {
  private String author;

  private String name;

  public Book() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}

class xiaoshu extends Book {
  private String type;
  private int worldNumber;

  public void write() {
    System.out.println("xiaoshu void  write ");
  }
}
