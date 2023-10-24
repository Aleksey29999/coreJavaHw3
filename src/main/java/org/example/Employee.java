package org.example;

import java.util.Comparator;

//public class Employee implements Comparable <Employee> {
public class Employee {
    private static final int CURRENT_YEAR = 2022;
    String name;
    String midName;
    String surName;
    String position;
    String phone;
    int salary;
    Integer birth;

    public Employee(String name, String midName, String surName,
                    String phone, String position, int salary, Integer birth) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;
    }

    public String getName() {

        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birth;
    }
    public int getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", midName='" + midName + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + getAge() +
                '}';
    }

    public void info() {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", midName='" + midName + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + getAge() +
                '}');
    }



    public void icereaseSalary(int amount) {
        this.salary += amount;
    }
//        public static void increaser(Employee[] emp){
//            for (int i = 0; i < emp.length ; i++) {
//                emp[i].icereaseSalary(50);
//            }
//        }
//    Comparator<Employee> compareByBirth = Comparator.comparing(Employee::getBirth);
//    @Override
//    public int compareTo(Employee o) {
//       int result;
//        result = this.birth.compareTo(o.birth);
//        return result;
//    }
}
