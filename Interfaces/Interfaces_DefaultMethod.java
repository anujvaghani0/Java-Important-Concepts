package com.company;

interface  myCamera{
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
interface myWifi{
    String [] getNetwors();
    void connectNetwork(String network);
}
class mycellPhone{
    void calNumber(int phonenumber){
        System.out.println("call a number"+phonenumber);
    }
    void pickCall(){
        System.out.println("Connection...");
    }
}
class samrtPhone extends mycellPhone implements myCamera,myWifi{
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
public class Interfaces_DefaultMethod {
    public static void main(String[] args) {
      samrtPhone s=new samrtPhone();
      s.record4kVideo();
//      private access not direct access
//      s.greet();
      String [] ar=s.getNetwors();
      for(String item:ar){
          System.out.println(item);
      }
    }
}
