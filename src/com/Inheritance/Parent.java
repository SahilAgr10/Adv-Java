package com.Inheritance;

public class Parent {
    int exp;
    int salary;
    String name;

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getDetails(){
        setName("Sahil");
        setSalary(30000);
        setExp(10000);
        getExp();
        getName();
        getSalary();
    }
}
