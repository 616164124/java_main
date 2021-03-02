package com.designpatterns.template;

/**
 * @author mikael
 */

public class TemplateTest{
  public static void main(String[] args) {
      Dog dog = new Dog();
      dog.sys();
      dog.move();
      //
  }
}


abstract  class Animal {
    void sys(){}
    void move(){
    System.out.println("animal run");
    }
}
class Dog extends Animal{
    @Override
    void sys() {
    System.out.println("dog wangwang!!!");
    }

}
class Cat extends Dog{

    @Override
    void sys() {
    System.out.println("miaomiao!!!");
  }
}



