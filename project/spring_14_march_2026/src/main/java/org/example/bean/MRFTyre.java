package org.example.bean;

import org.springframework.stereotype.Component;

@Component("mrf")
public class MRFTyre implements ITyre{
    public void tyreType(){
        System.out.println(" mrf tyre ");
    }
}
