package com.mycompany.staff;

public class Staff {
    private String name;
    private double salary;
    private int id;
    
    public Staff(){
        this.name = "Unknow";
        this.salary = 0;
        this.id = 0;
    }
    public Staff(String name, double salary, int id){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getId(){
        return this.id;
    }
    
    public double getBonus(){
        return salary * 0.5;
    }
    
    @Override
    public String toString(){
        return "Staff Name: " + this.name + "\nId: " + this.id + "\nSalary: $" + this.salary + "\nBonus: " + this.getBonus();
    }
}
