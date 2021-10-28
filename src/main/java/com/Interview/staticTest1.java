package com.Interview;

public class staticTest1 {
  public static void main(String[] args) {
    //
    BB b = new BB();
  }
}

class AA {
  public AA() {
    System.out.print("A gouzhao");
  }

  private static AA a = new AA(); // 执行了一次new

  static {
    System.out.print("static");
  }

  {
    System.out.print("A1");
  }
}

class BB extends AA {
  public BB() {
    System.out.println("B");
  }
}
