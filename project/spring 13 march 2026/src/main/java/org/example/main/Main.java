package org.example.main;
import org.example.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bin.xml");

//         by constructor
//        HelloWorld h = (HelloWorld) ctx.getBean("hello");
//        System.out.println(h.sayHello("romi"));


        // by setter  assigning value to the object
//        HelloWorld h = (HelloWorld) ctx.getBean("hello");
//        System.out.println(h.sayHello());

        // displaying language
        HelloWorld h = (HelloWorld) ctx.getBean("hello");
        System.out.println(h.getLanguage());



        ((ClassPathXmlApplicationContext)ctx).close();
    }
}
