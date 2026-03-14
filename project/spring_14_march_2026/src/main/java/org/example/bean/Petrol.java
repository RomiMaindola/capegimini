package org.example.bean;

import org.springframework.stereotype.Component;

@Component("petrol")
public class Petrol implements IEngine{
    public void EngineType(){
        System.out.println("petrol ");
    }
}
