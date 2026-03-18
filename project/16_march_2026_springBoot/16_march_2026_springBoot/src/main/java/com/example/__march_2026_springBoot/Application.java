package com.example.__march_2026_springBoot;

import com.example.__march_2026_springBoot.bean.Employee;
import com.example.__march_2026_springBoot.bean.SBU;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext cxt =  SpringApplication.run(Application.class, args);
		Employee emp = (Employee) cxt.getBean("getBean1");
//		emp.getDetail();
//		emp.getDetails();
//emp.getBusinessLogic().getEmpList();



	}

}
