package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int empId;
    private String name;
    private double salary;
    @Autowired
    private SBU Bu;
    private int age;

    public Employee() {
    }

    public Employee(int empId, String name, double salary, SBU bu, int age) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        Bu = bu;
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public SBU getBu() {
        return Bu;
    }

    public void setBu(SBU bu) {
        Bu = bu;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getSbuDetails(){
        System.out.print("\nSBU details  := { ");
        System.out.print("sbuCode = "+ Bu.getSubId());
        System.out.print(",  sbuHead = "+ Bu.getSbuHead());
        System.out.print(",  sbuName  = "+ Bu.getSbuName());
        System.out.println(" } \n");
    }

    public void EmployeeDetails(){
        System.out.print(" Employee details \n......................................................\n");
        System.out.println("Employee Id  = "+ getEmpId());
        System.out.println("Employee Name  = "+ getName());
        System.out.println("Employee Salary = "+ getSalary());
        System.out.println("Employee BU  = "+ getBu().getSubId());
        System.out.println("Employee Age  = "+ getAge());

    }
}
