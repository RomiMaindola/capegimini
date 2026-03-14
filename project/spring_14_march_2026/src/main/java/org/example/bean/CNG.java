package org.example.bean;

import org.springframework.stereotype.Component;

@Component("cng")
public class CNG implements IEngine{
    public void EngineType(){
        System.out.println(" cng engine ");
    }
}
