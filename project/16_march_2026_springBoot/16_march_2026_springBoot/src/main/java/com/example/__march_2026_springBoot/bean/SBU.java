package com.example.__march_2026_springBoot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
@ComponentScan("")
public class SBU {
private String sbuId;
private String sbuName;
private String cbuHead;


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


    public void getSBU(){
        System.out.println(" sbuId :- "+ getSbuId());
        System.out.println(" sbuName :- "+ getSbuName());
        System.out.println(" sbuId :- "+ getCbuHead());
    }


}
