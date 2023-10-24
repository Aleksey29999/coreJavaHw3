package org.example;

import java.util.List;

public class Director extends Employee {

    public Director(String name, String midName, String surName, String phone, String position, int salary, int birth) {
        super(name, midName, surName, phone, position, salary, birth);
    }

    public static void increaser (List<Employee> emp) {

        for (int i = 0; i < emp.size(); i++) {
            if (emp.get(i).position.equals("director"))
                return;
            else {
//            if (emp[i].position != "director");
                emp.get(i).icereaseSalary(500);
            }
        }
    }



//    public void icereaseSalary(int amount) {
//        this.salary += amount;
//    }
//   public static void increaser (List<Employee> emp) {
//
//        for (int i = 0; i < emp.length; i++) {
//            if (emp[i].position.equals("director"))
//                return;
//            else {
////            if (emp[i].position != "director");
//                emp[i].icereaseSalary(500);
//            }
//        }
//    }
}
