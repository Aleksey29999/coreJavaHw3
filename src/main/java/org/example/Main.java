package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import static org.example.Director.increaser;


public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "Igorevich", "Ovchinnicov", "8(495)000-11-22", "developer", 50000, 1985);
        Employee andrey = new Employee("Andrey", "Victorovich", "Bezrukov", "8(495)111-22-33", "fitter", 52000, 1973);
        Employee evgeniy = new Employee("Evgeniy", "Victorovich", "Delfinov", "8(495)222-33-44", "project manager", 40000, 1963);
        Employee natalia = new Employee("Natalia", "Pavlovna", "Keks", "8(495)333-44-55", "senior developer", 90000, 1990);
        Employee tatiana = new Employee("Tatiana", "Sergeevna", "Krasotkina", "8(495)444-55-66", "accountant", 50000, 1983);
        Director stepan = new Director("Stepan", "Sergeevich", "Ivanov", "8(495)555-66-77", "director", 350000, 1980);
        List<Employee> company = new ArrayList<>();
        company.add(ivan);
        company.add(andrey);
        company.add(evgeniy);
        company.add(natalia);
        company.add(tatiana);
        company.add(stepan);


//        company[0] = ivan;
//        company[1] = andrey;
//        company[2] = evgeniy;
//        company[3] = natalia;
//        company[4] = tatiana;
//        company[5] = stepan;


        for (Employee compan : company) {
            System.out.println(compan);
        }
        System.out.println(" ");

        Comparator<Employee> compareByBirth = Comparator.comparing(Employee::getBirth);
        increaser(company);
        company.sort(compareByBirth);
        for (Employee compan : company) {

            System.out.println(compan);
        }

    }

}