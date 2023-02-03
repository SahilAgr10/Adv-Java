package com.CollectionFramework;

import java.util.ArrayList;

public class AccessEmployee {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setName("Sahil");
        emp1.setExp(5);
        emp1.setPosition("Cloud Engineer");
        emp1.setSalary(50000);
    //    System.out.println(employee.toString());

        Employee emp2 = new Employee();
        emp2.setName("bras");
        emp2.setExp(3);
        emp2.setPosition("Cloud Developer");
        emp2.setSalary(40000);
    //    System.out.println(emp2.toString());

        list.add(emp1);
        list.add(emp2);
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        for(Employee e :list){
            System.out.println(e);
        }
    }
}
