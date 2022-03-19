package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }

    public void setSalary(int s) {
        this.salary = s;
    }

    public void setName(String n) {
        this.name = n;
    }
}
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return side*4;
    }
}
public class oopPs {
    public static void main(String[] args) {

//        problem-1
        Employee e=new Employee();
        e.setName("anujvaghani");
        System.out.println(e.getName());

//        Problem-2
//
        square sq=new square();
        sq.side=5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
