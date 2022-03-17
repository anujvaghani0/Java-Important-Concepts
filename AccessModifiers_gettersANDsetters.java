package com.company;

class myEmployee{
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class AccessModifiers_gettersANDsetters {
    public static void main(String[] args) {
      myEmployee e=new myEmployee();
//      e.id=45; direct no access bcz private method are id
//  To created getters and setters
        e.setName("hello!good morning ");
        System.out.println(e.getName());

    }
}
