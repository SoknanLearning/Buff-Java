package com.mycompany.staff;

public class Developer extends Staff{
    private String programmingLanguage;
    
    public Developer(){
        this.programmingLanguage = "unknow";
    }
    public Developer(String name, double salary, int id, String programmingLanguage){
        super(name, salary, id);
        this.programmingLanguage = programmingLanguage;
    }
    
    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage(){
        return this.programmingLanguage;
    }
    
    public String toString(){
        return super.toString() + "\nProgramming Langauge: " + this.programmingLanguage;
    }
}
