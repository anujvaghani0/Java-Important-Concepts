package com.company;

import org.w3c.dom.ls.LSOutput;

class c1{
    public int x=5;
    protected int y=45;
    int z=4335;
    private int a=70;
    public void math1(){
        System.out.println("hello world "+y);
        System.out.println("hello world "+x);
        System.out.println("hello world "+z);
        System.out.println("hello world "+a);
    }
}
//class c2{
//    public void meth2(){
//        System.out.println("hello world");
//    }
//}

public class accessModifiers {
    public static void main(String[] args) {
    c1 c=new c1();
    c.math1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c.a);   //access modifieres not do this allow
    }
}
