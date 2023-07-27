package com.example.meteostat.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class SensorDTO {
    @NotEmpty(message = "Name cannot be empty!")
    @Size(min = 3, max = 30, message = "Name must be from 3 to 30 symbols!")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
