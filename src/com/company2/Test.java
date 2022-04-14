package com.company2;

import com.company.Employee;

public class Test {
    public static void main(String[] args) {
        // Employee employee = new Employee(1); Compile error because the access modifier of this constructor is default(only whether one package)
        // Employee employee1 = new Employee(2); Compile error because the access modifier of this constructor is private(only whether class)

        Employee employee = new Employee(1, 500, "Khakimzhan"); // Correct
        employee.twoXSalary(1);
        employee.twoXSalary();
       // employee.twoXSalary(1,2,3,4); Compile error because of protected
        // System.out.println(employee.dataOnlyToWhetherPackageAndChilds); Compile error because the access modifier is protected
    }
}
