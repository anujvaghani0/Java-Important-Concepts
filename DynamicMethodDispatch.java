package com.company;

class Phone{
    public void on(){
        System.out.println("Turning on smart phone class1...");
    }
    public void greet(){
        System.out.println("Hello ! good morning");
    }
}
class Smartphone extends Phone{
    public void on(){
        System.out.println("Turning on smart phone class2...");
    }
    public void greet1(){
        System.out.println("Turning on smart phone...");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
       Phone obj=new Smartphone();
//       Smartphone obj=new Phone();   //this object are not allowred because object are not proper mener

//        obj.greet1();
        obj.greet();
        obj.on();
    }
}
