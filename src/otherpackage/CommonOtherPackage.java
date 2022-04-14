package otherpackage;


import com.company.Employee;

public class CommonOtherPackage extends Employee {
    public CommonOtherPackage(int id, double salary, String surname) {
        super(id, salary, surname);
    }

    public static void main(String[] args) {
        com.company.Employee employee = new com.company.Employee(1, 230000, "Philip");
        employee.showId();
        employee.showSalary();
        employee.showSurname();

        CommonOtherPackage commonOtherPackage = new CommonOtherPackage(1, 120000, "commonOtherPackage");
        commonOtherPackage.dataOnlyToWhetherPackageAndChilds = "secret"; // Note that we are in other package but we have access to this field because we are subb class

        employee.twoXSalary(1);
        employee.twoXSalary();

        commonOtherPackage.twoXSalary();
        commonOtherPackage.twoXSalary(1);
        commonOtherPackage.twoXSalary(1,2,3,4); // because we are sub class
    }
}
