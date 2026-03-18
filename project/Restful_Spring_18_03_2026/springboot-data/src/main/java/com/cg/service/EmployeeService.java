package com.cg.service;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepo erepo;
    public String createEmployee(Employee employee){
        erepo.saveAndFlush(employee);
        return "Employee created !!!! Your empid is "+employee.getEmpid();
    }

    public List<Employee> getAllEmployees(){
        return erepo.findAll();
    }

    public Employee getEmployee(int empid){
        Optional<Employee> e = erepo.findById(empid);
        if(e.isPresent()){
            return e.get();
        }
        else{
            return null;
        }
    }

    public String removeEmployee(int empid){
        if(getEmployee(empid) != null){
            erepo.deleteById(empid);
            return "Employee deleted !!!!";
        }
        else
            return "Employee not found !!!!";
    }

    public String updateEmployee(Employee employee){
        if(getEmployee(employee.getEmpid()) != null){
            erepo.saveAndFlush(employee);
            return "Employee updated !!!!";
        }
        else
            return "Employee not found !!!!";
    }

    public List<Employee> getEmployeeByName(String name){
        //create a custom method in JPA repository
        return erepo.findByName(name);
    }

    public List<Employee> getEmployeeHavingSalaryLessThan(double salary){
        return erepo.findBySalaryLessThan(salary);
    }

    public List<Employee> getEmployeeByNameAndSalaryLessThan(String name, double salary){
        return erepo.findByNameAndSalaryLessThan(name,salary);
    }

    public List<Employee> getEmployeeByMonth(int month){
        return erepo.findByMonth(month);
    }

    public List<Employee> getEmployeeByDobBetween(LocalDate start, LocalDate end){
        return erepo.findByDobBetween(start, end);
    }
}
