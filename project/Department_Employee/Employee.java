package Department_Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int Empid;
    private String Emp_name;
    private String designation;

   // private String departId;

    public Employee() {
    }

    public Employee( String emp_name, String designation) {
        Emp_name = emp_name;
        this.designation = designation;
//        this.departId = departId;
    }

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

//    public String getDepartId() {
//        return departId;
//    }
//
//    public void setDepartId(String departId) {
//        this.departId = departId;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "Empid=" + Empid +
                ", Emp_name='" + Emp_name + '\'' +
                ", designation='" + designation + '\'' +
//                ", departId='" + departId + '\'' +
                '}';
    }
}
