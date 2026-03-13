package org.example.Main;
import org.example.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {
        ApplicationContext cnt =new ClassPathXmlApplicationContext("bean.xml");
        Employee emp = (Employee) cnt.getBean("emp");
        emp.EmployeeDetails();
        emp.getSbuDetails();

    }
}
