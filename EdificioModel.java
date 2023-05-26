package com.example.application.models;

public class EdificioModel {
    //Attributtes
    private String name;
    private String address;

    //Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EdificioModel{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
