package com.company;
class myMainEmployee{
    private int id;
    private String name;

//   Normal constuctors are pass
//   public myMainEmployee(){
//       id=45;
//       name="Hello ! Rohit sharma";
//   }

//    Constructor pass in argument
   public myMainEmployee(String name,int id){
       this.id=id;
       this.name=name;
   }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
public class Constructors {
    public static void main(String[] args) {
    myMainEmployee e=new myMainEmployee("Hello ! RohitSharma",45);    //to pass argument name and id
//     e.setName("Hello! RohitSharma45");
//      e.setId(45);
        System.out.println(e.getId());
        System.out.println(e.getName());

    }
}
