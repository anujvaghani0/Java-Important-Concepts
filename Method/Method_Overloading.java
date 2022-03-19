package com.company;

public class Method_Overloading {
    static void joke(){
        System.out.println("I inversted a new word\n"+"po");
    }

    static void changes(int [] arr){
        arr[0]=98;
    }

    static void foo(int a,int b,int c){
        System.out.println("hey"+c);
    }
    public static void main(String[] args) {
      joke();
//
//        array are changed in above step
        int [] marks={10,50,30,45,56};
        changes(marks);
        System.out.println(marks[0]);
        foo(300,400,500);
    }
}
