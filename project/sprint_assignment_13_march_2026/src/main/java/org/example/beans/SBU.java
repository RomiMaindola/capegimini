package org.example.beans;

public class SBU {
    private  int subId;
    private String sbuName;
    private String sbuHead;

    public SBU() {
    }

    public SBU(int subId, String sbuName, String sbuHead) {
        this.subId = subId;
        this.sbuName = sbuName;
        this.sbuHead = sbuHead;
    }

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getSbuName() {
        return sbuName;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void setSbuHead(String sbuHead) {
        this.sbuHead = sbuHead;
    }
}
