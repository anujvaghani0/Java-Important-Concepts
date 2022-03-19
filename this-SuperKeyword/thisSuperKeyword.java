package com.company;

class Ekclass{
    int a;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    Ekclass(int a){
//        this.a=a;
        System.out.println("hello");
    }
    public int retunA() {
        return 1;
    }
}
class twoclas extends Ekclass{

    twoclas(int c) {
        super(c);
        System.out.println("Hello ! good morning "+ c);
    }
}
public class thisSuperKeyword {
    public static void main(String[] args) {
//        Ekclass e=new Ekclass(5);
          twoclas t=new twoclas(8);
//        System.out.println(e.getA());
    }
}
