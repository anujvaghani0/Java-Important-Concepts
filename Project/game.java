package com.company;

import java.util.Random;
import java.util.Scanner;
//rock,paper Scissor game
public class game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 0 for rock,1 for Paper,2 for Scissor:");
        int userinpute=sc.nextInt();

        Random rd=new Random();
        int computerInput=rd.nextInt(3);
        System.out.println("computer are entered: "+computerInput);
        if(userinpute==computerInput) {
           System.out.println("draw");
       }
         else if (userinpute==0 && computerInput==2 || userinpute==1 && computerInput==0 || userinpute==2 && computerInput==1){
           System.out.println("you win");
       }
         else{
           System.out.println("computer win");
       }
    }
}
