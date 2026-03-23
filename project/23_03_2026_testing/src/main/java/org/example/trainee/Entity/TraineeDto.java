package org.example.trainee.Entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class TraineeDto {
    private Integer id;
    @NotNull(message = "it will be not null")
    @NotBlank(message = "should not be blank")
    private String name;
    private String domain;
    private String location;

    public TraineeDto(Integer id, String name, String domain, String location) {
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
