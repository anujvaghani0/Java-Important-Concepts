package com.company;

interface Bicycle{
    int v=45;
    void applybrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHorn();
    void blowHorn1();
}
class atlasCycle implements Bicycle,HornBicycle{
    void blowHorn23(){
        System.out.println("Pee pee poo poo");
    }
    public void applybrake(int decrement){
        System.out.println("Applying Brake "+decrement);
    }
    public void speedUp(int increment){
        System.out.println("speedd");
    }
    public void blowHorn(){
        System.out.println("pee poo !");
    }
    public void blowHorn1(){
        System.out.println("pee poo 1!");
    }
}
public class Interfaces {
    public static void main(String[] args) {
     atlasCycle a=new atlasCycle();
     a.applybrake(5);
     System.out.println(a.v);
//   You cannot a modification a value
//   v.a=56;
     a.blowHorn1();
    }
}
