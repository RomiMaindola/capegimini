package org.example.Main;
import org.example.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean.xml");
        Employee empl = (Employee) cxt.getBean("emp");
        SBU sb = (SBU) cxt.getBean("sbu");
        Scanner input = new Scanner(System.in);
        System.out.print("give Employee Id  : ");
        int empId = input.nextInt();
        for(Employee emp : sb.getEmp()){
            if(emp.getEmpId()==empId){
                System.out.println("Employee Info: ");
                System.out.println("Employee ID  : "+emp.getEmpId());
                System.out.println("Employee Name : "+emp.getName());
                System.out.println("Employee Salary : "+emp.getSalary());
            }
        }

    }
}
