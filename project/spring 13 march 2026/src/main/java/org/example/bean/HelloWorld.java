package org.example.bean;

import java.util.List;

public class HelloWorld {
    private String Name;
private List<String> language;
    public HelloWorld(String name) {
        Name = name;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public HelloWorld() {
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public String sayHello() {
        return "hello "+getName();
    }
}
