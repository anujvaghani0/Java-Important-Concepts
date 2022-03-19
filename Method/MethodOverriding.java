package com.company;

class A{
        public int anuj(){
            return 4;
        }
        public void meth2(){
            System.out.println("I am method 2 of class A");
    }
}
class B extends A{
       @Override   //Use same method use in base class but only diffrent are same method name and fuctionlity are chages
       public void meth2(){
        System.out.println("I am method 2 of class B");
    }
       public void meth3(){
           System.out.println("I am method 3 of class B");
       }
}
public class MethodOverriding  {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
