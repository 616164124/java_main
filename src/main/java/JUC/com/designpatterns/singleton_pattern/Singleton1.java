/**
 * projectName: JUC fileName: singleton.java packageName: singleton_pattern date: 2020-10-01
 * copyright(c) 2017-2020 xxx公司
 */
package JUC.com.designpatterns.singleton_pattern;

/**
 * @version: V1.0
 * @author: mikael
 * @className: singleton
 * @packageName: singleton_pattern
 * @description: 枚举
 * @data: 2020-10-01
 */
enum Singleton7 {
  SINGLETON_7;

  public void method() {}
}

/**
 * @version: V1.0
 * @author: mikael
 * @className: singleton
 * @packageName: singleton_pattern
 * @description: 普通单例模式
 * @data: 2020-10-01
 */
public class Singleton1 {
  private static Singleton1 singleton1 = new Singleton1();

  public Singleton1() {}

  public Singleton1 getSingleton() {
    return singleton1;
  }

  public void show() {
    System.out.println("hello Singlento1 ");
  }
}

/**
 * @version: V1.0
 * @author: mikael
 * @className: singleton
 * @packageName: singleton_pattern
 * @description: 懒汉单例模式 线程不安全
 * @data: 2020-10-01
 */
class Singleton2 {
  private static Singleton2 singleton2;

  public Singleton2() {}

  public static Singleton2 singleton2() {
    if (singleton2 == null) {
      singleton2 = new Singleton2();
    }
    return singleton2;
  }
}

/**
 * @version: V1.0
 * @author: mikael
 * @className: singleton
 * @packageName: singleton_pattern
 * @description: 懒汉单例模式 线程安全(有synchronize加锁)
 * @data: 2020-10-01
 */
class Singleton3 {
  private static Singleton3 singleton3;

  public Singleton3() {}

  public static synchronized Singleton3 singleton3() {
    if (singleton3 == null) {
      singleton3 = new Singleton3();
    }
    return singleton3;
  }
}

/**
 * @version: V1.0
 * @author: mikael
 * @className: singleton
 * @packageName: singleton_pattern
 * @description: 饿汉单例模式 线程安全 缺点都是static，程序初始化就创建了，造成垃圾过多。
 * @data: 2020-10-01
 */
class Singleton4 {
  private static Singleton4 singleton4 = new Singleton4();

  public Singleton4() {}

  public static Singleton4 singleton4() {
    return singleton4;
  }
}

/**
 * @version: V1.0
 * @author: mikael
 * @className: singleton
 * @packageName: singleton_pattern
 * @description: 双重校验锁（dcl）单例 创建的时候用 singleton5 方法创建
 * @data: 2020-10-01
 */
class Singleton5 {
  private static volatile Singleton5 singleton5;

  public Singleton5() {}

  public static Singleton5 singleton5() {
    if (singleton5 == null) {
      synchronized (Singleton5.class) {
        if (singleton5 == null) {
          singleton5 = new Singleton5();
        }
      }
    }
    return singleton5;
  }
}

/**
 * @version: V1.0
 * @author: mikael
 * @className: singleton
 * @packageName: singleton_pattern
 * @description: 登记式/静态内部类 懒加载 线程安全
 * @data: 2020-10-01
 */
class Singleton6 {
  private Singleton6() {}

  public static final Singleton6 getInstance() {
    return SingletonHolder.SINGLETON_6;
  }

  private static class SingletonHolder {
    private static final Singleton6 SINGLETON_6 = new Singleton6();
  }
}

class testSingleton1 {

  public static void main(String[] args) {

    for (; ; ) {
      Singleton1 singleton1 = new Singleton1();
      Singleton1 singleton = singleton1.getSingleton();
      System.out.println(singleton.hashCode());
    }
  }
}
