package com.mycompany.staff;

public class Internship extends Staff {
    private int durationMonths;
    
    public Internship(String name, int id, double salary, int durationMonths){
        super(name, salary, id);
        this.durationMonths = durationMonths;
    }
    
    public void setDurationMonths(int durationMonths){
        this.durationMonths = durationMonths;
    }
    public int getDurationMonths(){
        return this.durationMonths;
    }
    
    @Override
    public double getBonus(){
        return super.getSalary() + 0.2;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nInternship Duration: " + this.durationMonths +  "months";
    }
}
