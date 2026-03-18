package com.example.__march_2026_springBoot;


import com.example.__march_2026_springBoot.bean.Employee;
import com.example.__march_2026_springBoot.bean.SBU;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class app {
    public static void main(String[] args) {

        ApplicationContext cxt =  SpringApplication.run(Application.class, args);
        SBU sb =  cxt.getBean(SBU.class);
        Scanner input = new Scanner(System.in);
        System.out.print("give Employee Id  : ");
//        int empId = input.nextInt();
//        for(Employee emp2 : sb.getEmpList()){
//            if(emp2.getEmpId()==empId){
//                System.out.println("Employee Info: ");
//                System.out.println("Employee ID  : "+emp2.getEmpId());
//                System.out.println("Employee Name : "+emp2.getEmpName());
//                System.out.println("Employee Salary : "+emp2.getSalary());
//            }
//        }
}}
