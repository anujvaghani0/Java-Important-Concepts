package com.company;

public class varages {
//    static int sum(int a,int b){
//        int sum=a+b;
//        return sum;
//    }

//    static int sum(int...arr){
////        available as int [] arr;
//         int result=0;
//         for(int a:arr){
//             result+=a;
//         }
//    return result;
//    }

    static  int sum(int x,int...arr){
//        available as int [] arr;
        int result=x;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
//        System.out.println("sum for given number "+sum(5,6));
//        System.out.println("sum for given number "+sum(1,2,3,4,5,6,7,8,9,10));  given argument are more time and provied a more fexiblity
//        System.out.println("sum for given number "+sum(1,2,3,4,5,6,7,8,9,10));  X aryument are compulsory given



    }
}
