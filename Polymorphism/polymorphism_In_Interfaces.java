package com.company;
interface  myCamera11{
        void takeSnap();
        void recordVideo();
//    default use not a implement a interface any ither class
private void greet(){
        System.out.println("good morning");
        }
default void record4kVideo(){
        greet();
        System.out.println("recording in 4k....");
        }
}
interface myWifi1{
    String [] getNetwors();
    void connectNetwork(String network);
}
class mycellPhone1{
    void calNumber(double phonenumber){
        System.out.println("call a number "+phonenumber);
    }
    void pickCall(){
        System.out.println("Connection...");
    }
}
class samrtPhone1 extends mycellPhone implements myCamera11,myWifi1{
    public void takeSnap(){
        System.out.println("Taking a snap ...");
    }
    public void recordVideo(){
        System.out.println("record a video");
    }
    public String[] getNetwors(){
        System.out.println("Getting a list of network");
        String [] networklist={"anuj","vaghani","wifi5G"};
        return networklist;
    }
    public void connectNetwork( String network){
        System.out.println("Connection to"+network);
    }
}
public class polymorphism_In_Interfaces {
    public static void main(String[] args) {
       myCamera11 mc=new samrtPhone1(); //this is a smartphone but , use it a camera!
//       mc.getNetworks(); //error becuse java is not allowed
        mc.record4kVideo();
        samrtPhone1 s1=new samrtPhone1();
        s1.getNetwors();
        s1.calNumber(932802335);
    }
}
