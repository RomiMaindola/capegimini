package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Value("${carname}")
    private String name;

    private IEngine engine;

    private ITyre tyre;

    public Car() {
    }

    public Car(IEngine engine, ITyre tyre) {
        this.engine = engine;
        this.tyre = tyre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public ITyre getTyre() {
        return tyre;
    }

    public void setTyre(ITyre tyre) {
        this.tyre = tyre;
    }
    public void printCar(){
        System.out.println(" car details : ");
        System.out.println("car Name := "+getName());
        System.out.print("car Engine := ");
        engine.EngineType();
        System.out.print("car tyre := ");
        tyre.tyreType();
    }
}
