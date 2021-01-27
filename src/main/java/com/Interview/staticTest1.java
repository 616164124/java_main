package com.Interview;

public class staticTest1 {
  public static void main(String[] args) {
    //
    b b = new b();
  }
}

class a {
  public a() {
    System.out.print("A gouzhao");
  }

  private static a a = new a(); // 执行了一次new

  static {
    System.out.print("static");
  }

  {
    System.out.print("A1");
  }
}

class b extends a {
  public b() {
    System.out.println("B");
  }
}
