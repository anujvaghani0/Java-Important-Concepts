package com.company;
import java.lang.Object;
class base1 {
//    private int X;

    base1() {
        System.out.println("Hello ! Good Morning");
    }
    base1(int a){
        System.out.println("i am base class "+a);
    }
}
class Derived1 {
//    private int Y;
      Derived1(){
//        super();
        System.out.println("Where are u?");
    }
    Derived1(int a, int b){
        super();
        System.out.println("I am derived1 "+b);
    }
}
class child extends Derived1{
//    private int z;
    child(){
        System.out.println("I am child");
    }
    child(int a,int b ,int c){
        super(a,b);
        System.out.println("I am child for "+c);
    }
}
public class ConstructorsINinheritance {
    public static void main(String[] args) {
     base1 b=new base1(5);
//     b.setX(5);
//     Derived1 d=new Derived1(5,6);
//         d.setY(10);
//        System.out.println(b.getX());
//        System.out.println(d.getY());

       child c=new child(5,6,7);

    }
}
