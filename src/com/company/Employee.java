package com.company;

public class Employee {
    int id; // only inside of the packets
    private double salary; // only inside of the class
    public String surname; // anywhere
    protected String dataOnlyToWhetherPackageAndChilds; // only for package and for sub classes

    protected void setDataOnlyToWhetherPackageAndChilds(String dataOnlyToWhetherPackageAndChilds) {
        this.dataOnlyToWhetherPackageAndChilds = dataOnlyToWhetherPackageAndChilds;
    }

    public Employee(int id, double salary, String surname) {
        this.id = id;
        this.salary = salary;
        this.surname = surname;
    }

    Employee(int id) {
        this(id, 0.0, ""); // overloading
    }

    private Employee(int id, double salary) {
        this(id, salary, ""); // // overloading
    }

    public void showId() {
        System.out.println(id);
    }

    public void showSalary() {
        System.out.println(salary);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void twoXSalary(int percent) {

    }
    void twoXSalary(int percent, int koef) {

    }
    private void twoXSalary(int percent, int koef, int numb) {

    }
    private void twoXSalary(int percent, int koef, int numb, int last, int before) {

    }

    protected void twoXSalary(int percent, int koef, int numb, int freq) {

    }
    public void twoXSalary() {

    }

//    protected



}
