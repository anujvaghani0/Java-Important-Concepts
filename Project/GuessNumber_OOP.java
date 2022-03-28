package com.company;


import java.util.Random;
import java.util.Scanner;

class Game1{
    public int number;
    private int NumberOfGuesses;
    public int userInput;

    public int getNumberOfGuesses() {
        return NumberOfGuesses;
    }

    public void setNumberOfGuesses(int noOfGuesses) {
        this.NumberOfGuesses = noOfGuesses;
    }
//    constructors
     Game1() {
        Random rd=new Random();
        this.number=rd.nextInt(100);
        System.out.println("radome numuber are: "+number);
         NumberOfGuesses = 0;
     }
    void takeUserInput(){
        System.out.println("enter the number: ");
        Scanner sc=new Scanner(System.in);
        this.userInput=sc.nextInt();
    }
    Boolean isCorrectNumber(){
         NumberOfGuesses++;
        if (number==userInput){
            return true;
        }
        else if(userInput>number){
            System.out.println("to high...");
        }
        else if (number>userInput){
            System.out.println("To low...");
        }
        return false;
    }


}
public class GuessNumber_OOP {
    public static void main(String[] args) {
    Game1 g=new Game1();
    boolean b=false;
    while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
