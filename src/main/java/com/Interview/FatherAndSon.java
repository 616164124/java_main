/**
 * projectName: JUC   
 * fileName: FatherAndSon.java  
 * packageName: Interview   
 * date: 2020-10-25
 * copyright(c) 2017-2020 xxx公司  
 */
package com.Interview;

/**
 * @version: V1.0
 * @author: mikael
 * @className: FatherAndSon
 * @packageName: Interview
 * @description:
 * @data: 2020-10-25
 **/
public class FatherAndSon {
  public static void main(String[] args) {
      Son son = new Son();
  }
}

class Father{
    private int age;
    public Father() {
    System.out.println("father Father()");
    }

   public Father(int age) {
    System.out.println("father Father(int age)");
        this.age = age;
    }
}

class Son extends Father{
    private int age;
    public Son() {
    System.out.println("son Son()");
    }

   public Son(int age) {
    System.out.println("Son son(int age)");
        this.age = age;
    }

    public Son(int age, int age1) {
        super(age);
        this.age = age1;
    }
}