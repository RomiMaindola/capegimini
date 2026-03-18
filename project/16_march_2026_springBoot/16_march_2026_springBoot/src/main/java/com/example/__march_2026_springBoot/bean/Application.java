package com.example.__march_2026_springBoot.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.__march_2026_springBoot.bean")
public class Application {

	public static void main(String[] args) {

		ApplicationContext cxt =  SpringApplication.run(Application.class, args);
		Employee emp = (Employee) cxt.getBean("getBean1");
		emp.getDetail();
		System.out.println("\n\n");
		emp.getDetails();
//emp.getBusinessLogic().getEmpList();



	}

}
