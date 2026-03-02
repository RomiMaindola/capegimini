package org.example.beans;

public class author {
   private int authId=1;
   private String first_name;
   private String last_name;
   private String middle_name;
   private int phone;
    {
        authId++;
    }
        public author(){};
    public author(int authId, String first_name, String last_name, String middle_name, int phone) {
        this.authId = authId;
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.phone = phone;
    }

    public int getAuthId() {
        return authId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public int getPhone() {
        return phone;
    }

    public void setAuthId(int authId) {
        this.authId = authId;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "author{" +
                "authId=" + authId +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
