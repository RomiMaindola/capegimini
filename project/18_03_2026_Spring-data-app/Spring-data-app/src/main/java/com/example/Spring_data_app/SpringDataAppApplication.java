package com.example.Spring_data_app;

import com.example.Spring_data_app.entity.Employee;
import com.example.Spring_data_app.entity.EmployeeService;
import com.example.Spring_data_app.repo.IEmployeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataAppApplication {

	public static void main(String[] args) {
		ApplicationContext cxt =SpringApplication.run(SpringDataAppApplication.class, args);
		EmployeeService e= cxt.getBean(EmployeeService.class);
		//System.out.println(e.createEmployee(new Employee("romi",LocalDate.of(2003,04,04),4532)));
		System.out.println(e.getEmployeeById(1));
		System.out.println(e.removeEmployee(6));
		Employee ee = e.getEmployeeById(2);
		if(ee!=null){
			ee.setName("radha");
			e.updateEmployee(ee);
			System.out.println("upda");
		}
		else{
			System.out.println("not updated ");
		}
	}

}
