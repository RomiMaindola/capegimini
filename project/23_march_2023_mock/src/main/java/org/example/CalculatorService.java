package org.example;

public class CalculatorService {
    private ICaluclator cal;

    public CalculatorService() {
    }

    public CalculatorService(ICaluclator cal) {
        this.cal = cal;
    }
    public int addService( int x, int y){
        return cal.calculator(x,y);
    }
}
