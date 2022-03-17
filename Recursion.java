package com.company;

public class Recursion {
    static int factroial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n*factroial(n-1);
        }
    }
    static int factroial_ineractive(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
         int producet=1;
         for (int i=1;i<=n;i++){
             producet*=i;
         }
            return producet;
        }
    }

    public static void main(String[] args) {
//        System.out.println("factroial are "+factroial(6));
//        System.out.println("factroial are "+factroial_ineractive(5));
    }
}
