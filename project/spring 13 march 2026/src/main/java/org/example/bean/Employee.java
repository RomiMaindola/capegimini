package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    private String name;
    private int empId;
    @Autowired
    @Qualifier("add")
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(String name, int empId, Address address) {
        this.name = name;
        this.empId = empId;
        this.address = address;
    }
    public void printEmployeeDetails(){
        System.out.println("name  :"+name);
        System.out.println("empId  :"+empId);
        System.out.println("........address .......");
        System.out.println(" city is :" +address.getCity());
        System.out.println(" country is :" +address.getCountry());


    }
}
