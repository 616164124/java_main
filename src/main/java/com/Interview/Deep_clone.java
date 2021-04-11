/**
 * projectName: JUC fileName: Deep_clone.java packageName: Interview date: 2020-08-29 21:18
 * copyright(c) 2017-2020 xxx公司
 */
package com.Interview;

import java.io.*;
/**
 * 参考网址： https://blog.csdn.net/servermanage/article/details/103133982 总结：深克隆/浅克隆 （都是针对类中的引用类型）
 * 深浅克隆的区别在于，能否支持引用类型（包括类、接口、数组等）的成员变量的复制。
 * 浅克隆：对象只复制了它本身和其中包含的值类型的成员变量（就是对象它自己本身的成员变量是克隆了），引用类型的成员对象并没有复制。 深克隆：对象本身以及包含的所有成员变量都会被复制。
 */

/**
 * @version: V1.0
 * @author: mikael
 * @className: Deep_clone
 * @packageName: Interview
 * @description: 深克隆/浅克隆
 * @date: 2020-08-29
 */
public class Deep_clone {
  public static void main(String[] args) throws CloneNotSupportedException {
    // 浅克隆  引用类型的类 cloneTest2中变化了，则
    CloneTest2 cloneTest2 = new CloneTest2(9);
    CloneTest cloneTest = new CloneTest(18, "jfls", cloneTest2);
    CloneTest a = (CloneTest) cloneTest.clone();
    System.out.println(a);
    System.out.println(cloneTest);
    System.out.println();
    System.out.println(a);
    System.out.println(cloneTest);
    System.out.println();
    a.setName("liu");
    System.out.println(a);
    System.out.println(cloneTest);
    System.out.println("--------------------");
    // 深克隆
    CloneTest3 shen = new CloneTest3(99, "shen", cloneTest2);
    CloneTest3 o = (CloneTest3) shen.clone1();
    cloneTest2.setId(888888);
    System.out.println(shen);
    System.out.println(o);
  }
}

/**
 * @version: V1.0
 * @author: mikael
 * @description:
 * @date: 2020/03/29
 */
class CloneTest3 implements Serializable {
  private int id;
  private String name;
  private CloneTest2 cloneTest2;

  public CloneTest3(int id, String name, CloneTest2 cloneTest2) {
    this.id = id;
    this.name = name;
    this.cloneTest2 = cloneTest2;
  }

  public CloneTest3(CloneTest2 cloneTest2) {
    this.cloneTest2 = cloneTest2;
  }

  /*
   * @Description: 深克隆方法一: 将对象序列化
   * @Author: mikael
   * @Date: 2020/8/29
   * @param null:
   * @return: null
   **/
  public Object clone1() throws CloneNotSupportedException {
    CloneTest3 cloneTest3 = null;
    try {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      ObjectOutputStream oos = new ObjectOutputStream(baos);
      oos.writeObject(this);
      // 将流序列化成对象
      ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
      ObjectInputStream ois = new ObjectInputStream(bais);
      cloneTest3 = (CloneTest3) ois.readObject();
    } catch (Exception e) {
      System.out.println(e.toString());
    }
    return cloneTest3;
  }

  /*
   * @Description: 深克隆方法二: 将引用类型进行克隆 而引用的类也需要实现Cloneable接口
   * @Author: mikael
   * @Date: 2020/14/29
   * @param null:
   * @return: null
   **/
  /* @Override
      public Object clone2() throws CloneNotSupportedException {
          CloneTest2 cloneTest2 = (CloneTest2)super.clone();
          cloneTest2.get((CloneTest2)cloneTest.clone());
          return student;
      }
  */
  @Override
  public String toString() {
    return "CloneTest{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", cloneTest2="
        + cloneTest2
        + '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

/*
 * @Description:
 * @Author: mikael
 * @Date: 2020/8/29
 * @param null:
 * @return: null
 **/
class CloneTest implements Cloneable {
  private int id;
  private String name;
  private CloneTest2 cloneTest2;

  public CloneTest(int id, String name, CloneTest2 cloneTest2) {
    this.id = id;
    this.name = name;
    this.cloneTest2 = cloneTest2;
  }

  public CloneTest(CloneTest2 cloneTest2) {
    this.cloneTest2 = cloneTest2;
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return "CloneTest{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", cloneTest2="
        + cloneTest2
        + '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

/*
 * @Description:
 * @Author: mikael
 * @Date: 2020/8/29
 * @param null:
 * @return: null
 **/
class CloneTest2 implements Serializable {
  private int id;

  public CloneTest2(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "CloneTest{" + "id=" + id + '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
