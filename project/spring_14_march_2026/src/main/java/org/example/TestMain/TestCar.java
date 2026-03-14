package org.example.TestMain;
import org.example.bean.*;
import org.example.bean.IEngine;
import org.example.bean.ITyre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean.xml");
        Scanner input = new Scanner(System.in);
        System.out.println(" give whch engine you want ( petrol / cng)");
        String engine = input.next();
        System.out.println(" give whch engine you want ( mrf / jk)");
        String tyre = input.next();

        IEngine eng = (IEngine) cxt.getBean(engine.toLowerCase());
        ITyre ty = (ITyre) cxt.getBean(tyre.toLowerCase());
        Car c =(Car) cxt.getBean("car");
        c.setEngine(eng);
        c.setTyre(ty);
        c.printCar();
    }
}
