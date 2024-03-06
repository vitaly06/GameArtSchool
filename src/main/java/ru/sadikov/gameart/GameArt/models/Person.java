package ru.sadikov.gameart.GameArt.models;

import jakarta.validation.constraints.NotEmpty;

public class Person {
    @NotEmpty
    private String name;
    @NotEmpty
    private String number;
    private String status;
    public Person(){

    }
    public Person(String name, String number, String status){
        this.name = name;
        this.number = number;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
