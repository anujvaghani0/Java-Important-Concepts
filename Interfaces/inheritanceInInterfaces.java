package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth4();
    void meth5();
}
class MysampleClass implements sampleInterface{
    public void meth4() {
        System.out.println("hello4");
    }
    public void meth5() {
        System.out.println("hello5");
    }
    public void meth1() {
        System.out.println("hello1");
    }
    public void meth2() {
        System.out.println("hello2");
    }
}

public class inheritanceInInterfaces {
    public static void main(String[] args) {
    MysampleClass m=new MysampleClass();
    m.meth1();
    }
}
