package org.example.bean_constructor;

import org.example.bean_setter.Librarian;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean_constructor.xml");
        Librarian li =(Librarian) cxt.getBean("lib");
        li.issueBook();

    }
}
