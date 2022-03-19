package com.company;

public class Method {
  public static int logic(int x,int y){
    int c;
    if (x>y){
     c=x+y;
    }
    else{
     c=x+2;
    }
    return c;
  }
 public static void main(String[] args){

//    int a=5;
//    int b=7;
//    int c;
//    if (a>b){
//     c=a+b;
//    }
//    else{
//     c=a+2;
//    }
//    System.out.println(c);
//    int a1=2;
//    int b1=7;
//    int c1;
//    if (a1>b1){
//     c1=a1+b1;
//     }
//     else{
//      c1=a1+2;
//     }
//     System.out.println(c1);

//
//  method are access
   int a=5;
   int b=6;
   int c;
   c=logic(a,b);
   System.out.println(c);


  }
}
