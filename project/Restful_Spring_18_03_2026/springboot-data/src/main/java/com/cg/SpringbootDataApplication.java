package com.cg;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringbootDataApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(SpringbootDataApplication.class, args);
//        IEmployeeRepo employeeRepo=context.getBean(IEmployeeRepo.class); //spring itself checks whether it is interface or class and gives the object ogf the class
//        employeeRepo.save(new Employee("Mahi", LocalDate.of(2004,10,22),56000));
//        System.out.println("Employee saved Successfully");

        //create employee
        EmployeeService es=context.getBean(EmployeeService.class);
//        System.out.println(es.createEmployee(
//                new Employee("Jammy",LocalDate.of(1998,7,18),30000.0)));


        //get all employees
        es.getAllEmployees().forEach(e->System.out.println(e.toString()));

        //delete employee by id:
        System.out.println(es.removeEmployee(452));

        //get employee
        Employee e=es.getEmployee(52);
        System.out.println(e.toString());

        //update Employee
//        Employee e2=es.getEmployee(152);
//        e2.setName("Joe");
//        e2.setDob(LocalDate.of(2002,12,15));
//        System.out.println(es.updateEmployee(e2));
        //or:
//        System.out.println(es.updateEmployee(new Employee(1,"Jack",LocalDate.of(2002,4,23),60000.0)));

        //find by name:
        es.getEmployeeByName("John").forEach(e1->System.out.println(e1.toString()));

        //FIND BY SALARY LESS THAN:
        es.getEmployeeHavingSalaryLessThan(60000).forEach(e1->System.out.println(e1.toString()));

        //AND CONDITION:
        es.getEmployeeByNameAndSalaryLessThan("Jack",60000);

        //find by month:
        es.getEmployeeByMonth(7).forEach(e1->System.out.println(e1.toString()));
        es.getEmployeeByDobBetween(LocalDate.of(1998,7,1), LocalDate.of(1998,8,1)).forEach(e1->System.out.println(e1.toString()));

    }

}
