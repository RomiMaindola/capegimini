package Department_Employee;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Department {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int deptId;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employees;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }

    public Department(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
