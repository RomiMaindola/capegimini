package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        ICaluclator cs=(i,j)->i+j;
        CalculatorService csr = new CalculatorService(cs);
        System.out.println(csr.addService(10,5));
    }
}
