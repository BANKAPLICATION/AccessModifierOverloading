package com.company;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(1, 123, "Khakimzhan");
        employee.showSurname();
        employee.showSalary();
        employee.showSurname();
        employee.dataOnlyToWhetherPackageAndChilds = "public";//we can do something like that because we are at the same package where created this class
        employee.id = 123;
        employee.surname = "test";
        employee.twoXSalary();
        employee.twoXSalary(1);
        employee.twoXSalary(1,2);
        employee.twoXSalary(1,2,3,4);
        // employee.twoXSalary(1,2,3); compile error because access modifier is private
        // Employee employee2 = new Employee(1, 123);  Compile error because access modifier is private

    }
}
