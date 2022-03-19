package com.company;


class base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void printme(){
        System.out.println("hello ! good morning ");
    }
}

    // base class are entends this conspet inheritance
class Derivied extends base{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void pritme1(){
        System.out.println("hello ! where are you!");
    }
 }

public class Inheritance {
    public static void main(String[] args) {

//   Creating object are Base
     base b=new base();
     b.setX(5);
     System.out.println(b.getX());

//   Creating object are Derivied
     Derivied d=new Derivied();
     d.setX(45);
     d.setY(3);
     System.out.println(d.getX());
     System.out.println(d.getY());
    }
}
