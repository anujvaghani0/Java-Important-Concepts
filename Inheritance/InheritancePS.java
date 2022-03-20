package com.company;

class Cirule{
    public int radius;
    Cirule(int r){
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylider1 extends Cirule{
    cylider1(int r ,int h){
   super(r);
   this.height=h;
    }
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.height;
    }
}

public class InheritancePS {
    public static void main(String[] args) {
     cylider1 c=new cylider1(3,5);
        System.out.println(c.volume());
    }
}
