package com.cg.service;

import com.cg.dao.IEmployeeRepo;
import com.cg.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private IEmployeeRepo repo;
    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return repo.saveAndFlush(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Optional<Employee> employee = repo.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }else{
            return null;
        }
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        if(getEmployee(employee.getEmpid())!=null){
            return repo.saveAndFlush(employee);
        }else
            return null;

    }

    @Override
    public String removeEmployee(int id) {
        Employee employee=getEmployee(id);
        if(employee!=null){
            repo.deleteById(employee.getEmpid());
            return "Employee deleted!!!!!!!!!!!!";
        }else{
            return "Employee not found!!!!!!!!!!!!";
        }
    }

    @Override
    public List<Employee> getEmployeeByName(String empname) {
        return repo.findByempname(empname);
    }
}
