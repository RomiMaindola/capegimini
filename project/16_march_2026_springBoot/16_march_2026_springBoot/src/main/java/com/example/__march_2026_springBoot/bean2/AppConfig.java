package com.example.__march_2026_springBoot.bean2;

import com.example.__march_2026_springBoot.bean.Employee;
import com.example.__march_2026_springBoot.bean.SBU;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public SBU getSbu(){
        SBU s = new SBU("PES-BU");
        s.setCbuHead("Dinesh");
        s.setSbuName("Product Engineering Service");

        return s;
    }
    @Bean
    public Employee getBean1(){
        Employee em = new Employee(101,"ROMI",2345.0,getSbu());
        return em;
    }
    @Bean
    public Employee getBean2(){
        Employee em = new Employee(102,"Ram",2645.0,getSbu());
        return em;
    }
    @Bean
    public Employee getBean3(){
        Employee em = new Employee(103,"ROhit",7345.0,getSbu());
        return em;
    }

}