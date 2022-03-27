package com.company;


abstract class pen{
    public void parent2(){
        System.out.println("hello! world");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class fountainPen extends pen{
   public void greet(){
        System.out.println("Write");
    }
    public void greet2(){
        System.out.println("Refills");
    }
    public void chnagesNib(){
        System.out.println("change");
    }
}
class monkey{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Biting..");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicAnimal{
    public void speak(){
        System.out.println("help! me ");
    }
    @Override
    public void eat() {
        System.out.println("eating..");
    }
    @Override
    public void sleep() {
        System.out.println("sleep..");
    }
}

public class abstractMethodPs {
    public static void main(String[] args) {
//  Problam-->1 & 2
    fountainPen p=new fountainPen();
    p.greet2();
    p.parent2();
    p.chnagesNib();

//  Problam-->3
    human h=new human();
    h.eat();
    h.jump();
    h.bite();

//  Problam->4
    monkey m=new human();
    m.bite();

    }
}
