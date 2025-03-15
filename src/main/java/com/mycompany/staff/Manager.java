package com.mycompany.staff;

public class Manager extends Staff{
    private double percent;
    
    public Manager(){
        this.percent = 0;
    }
    public Manager(double percent){
        this.percent = percent;
    }
    public Manager(String name, double salary, int id, double percent){
        super(name, salary, id);
        this.percent = percent;
    }
    
    @Override
    public double getBonus(){
        return super.getSalary() * percent/100;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nBonus: " + percent + "%" + "\n bonus: " + this.getBonus();
    }
    
}
