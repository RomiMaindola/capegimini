package com.example.Spring_data_app.entity;

import com.example.Spring_data_app.repo.IEmployeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private IEmployeRepo erepo;
    public EmployeeService(IEmployeRepo erepo) {
        this.erepo = erepo;
    }
    public String createEmployee(Employee emp){
       Employee e = erepo.saveAndFlush(emp);
        return "Created .........."+e.getEmpId();
    }
    public List<Employee> getEmployee(){
        return erepo.findAll();
    }

    public Employee getEmployeeById( int empId){
       Optional<Employee> e = erepo.findById(empId);
       if(e.isPresent())
        return e.get();
       else
           return null;
    }
    public String removeEmployee(int empId){
        if(getEmployeeById(empId)!=null){
        erepo.delete(erepo.getById(empId));
        return "employee remove........ ";}
        else{
            return "employee Id is wrong";
        }
    }
    public String updateEmployee(Employee e){
        Employee emp = erepo.saveAndFlush(e);
        return " updated ...........";
    }
}
