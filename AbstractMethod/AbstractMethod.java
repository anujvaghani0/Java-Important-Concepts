package com.company;

abstract class Parent2{
  public Parent2(){
      System.out.println("Mai base 2 ka constructor");
  }
  public void sayHello(){
      System.out.println("Hello");
  }
   abstract public void greet();
}
class child2 extends Parent2{
    @Override
    public void greet() {
        System.out.println("Hello ! good morning");
    }
}
abstract class child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
//        not a object created by abstract class
//    Parent2 p=new Parent2();
      child2 c=new child2();
      c.greet();
    }
}
