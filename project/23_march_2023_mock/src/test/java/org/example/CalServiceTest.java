package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CalServiceTest {
    CalculatorService service;

  @BeforeEach
    public void init(){
        ICaluclator cal= Mockito.mock(ICaluclator.class);
      service = new CalculatorService(cal);
        when(cal.calculator(20,5)).thenReturn(25);

    }
    @Test
    void addServiceTest(){
      assertEquals(15,service.addService(10,5));
    }
}
