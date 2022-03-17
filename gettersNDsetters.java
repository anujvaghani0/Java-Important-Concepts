package com.company;
//
class employee123{
    private int id;
    private String name;

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
public class gettersNDsetters {
    public static void main(String[] args) {
    employee123 e=new employee123();
    e.setName("anujvaghani");
    e.setId(25);
        System.out.println(e.getName());
        System.out.println(e.getId());

    }
}
