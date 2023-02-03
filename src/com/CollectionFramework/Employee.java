package com.CollectionFramework;

public class Employee {
    private String name;
    private int salary;
    private String position;

    private int exp;

    @Override
    public String toString() {
        return "Employee[" +
                "name= " + name  +
                "| salary=" + salary +
                "| position='" + position  +
                "| exp=" + exp +
                ']';
    }

    public Employee(){
        super();
    }
    public Employee(String name, int salary, String position, int exp) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
