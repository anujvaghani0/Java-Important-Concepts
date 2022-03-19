package com.company;


//  Cylider class
    class cylider{
    private int radius;
    private int height;

//  Used a constuctors
    public cylider(int radius,int height){
        this.radius=radius;
        this.height=height;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
//    Print surfaceArea
    public double surfaceArea(){
        return (2*Math.PI*radius*radius) + (2*Math.PI*radius*height);
    }
//    Print a volume
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

//Rectagle class

class reactagle{
    private int length;
    private int breadth;

    public reactagle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}

public class AccessModifiersandConstructors {
    public static void main(String[] args) {

//      Cylider
        cylider c=new cylider(5,6);  //pass constructors argument
//      c.setHeight(12);
//      c.setRadius(9);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());

//      Reactagle
        reactagle r=new reactagle(50,60);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }
}