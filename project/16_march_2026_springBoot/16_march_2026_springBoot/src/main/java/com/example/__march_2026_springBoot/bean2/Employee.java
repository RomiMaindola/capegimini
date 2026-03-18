package com.example.__march_2026_springBoot.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Employee {
    private int empId;
    private String empName;
    private double salary;


    public Employee() {
    }

    public Employee(int empId, String empName, double salary, SBU businessLogic) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void getDetail(){
        System.out.println("employee Id :- "+getEmpId());
        System.out.println("employee Name :- "+getEmpName());
        System.out.println("employee Salary :- "+getSalary());


    }

}
