package com.company;

public class Horse extends DomesticAnimal {
    private String color;


    public Horse(String nickName, byte age, double weight, String gender, String color) {
        super(nickName, age, weight, gender);
        this.color = color;
    }

    public Horse(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
