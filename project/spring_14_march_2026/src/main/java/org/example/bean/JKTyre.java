package org.example.bean;

import org.springframework.stereotype.Component;

@Component("jk")
public class JKTyre  implements ITyre{
    public void tyreType(){
        System.out.println("jkTyre ");
    }
}
