package com.example.__march_2026_springBoot.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SBU {
private String sbuId;
private String sbuName;
private String cbuHead;
@Autowired
private List<Employee> empList;

    public SBU(String sbuId) {
        this.sbuId=sbuId;
    }

    public SBU() {
    }

    public SBU(String sbuId, String sbuName, String cbuHead) {
        this.sbuId = sbuId;
        this.sbuName = sbuName;
        this.cbuHead = cbuHead;
    }

    public String getSbuId() {
        return sbuId;
    }

    public void setSbuId(String sbuId) {
        this.sbuId = sbuId;
    }

    public String getSbuName() {
        return sbuName;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public String getCbuHead() {
        return cbuHead;
    }

    public void setCbuHead(String cbuHead) {
        this.cbuHead = cbuHead;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public void getSBU(){
        System.out.println(" sbuId :- "+ getSbuId());
        System.out.println(" sbuName :- "+ getSbuName());
        System.out.println(" sbuId :- "+ getCbuHead());
    }

    public void getEmployeeList(){
             getSBU();
        System.out.println(" employe list ........");
        for( Employee e : getEmpList()){
           e.getDetail();
        }
    }
}
