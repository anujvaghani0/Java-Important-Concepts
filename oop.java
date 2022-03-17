package com.company;

class Employe{
    int id;
    String name;
     int salary;
     String details="Hello i hv studing in BE tech";

    public void Person(){
        System.out.println("my id is "+id);
        System.out.println("my name is "+name);
    }

    public int getSalary(){
        return salary;
    }

    public String getdetails(){
        System.out.println("about us"+details);
        return null;
    }

}
public class oop {
    public static void main(String[] args) {
         Employe e=new Employe(); //Instantiating a new object
         Employe e1=new Employe(); //Instantiating a new object as employee

//        setting attribute Employee e
        e.id=21;
        e.name="anuj";
        e.salary=256;

//        setting attribute Employee e1
        e1.id=22;
        e1.name="yash";

//         setting attribute
//         System.out.println(e.id);
//         System.out.println(e.name);

//            e.Person();
//            e1.Person();

//            int salary=e.getSalary();
//        System.out.println(salary);
//        String details=e1.getdetails();
//        System.out.println(details);

//
    }
}
