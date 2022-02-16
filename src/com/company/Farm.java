package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    private DomesticAnimal[] sheep;
    private DomesticAnimal[] cows;
    private DomesticAnimal[] horses;

    public Farm(){

    }

    public Farm(String address, String ownreName, DomesticAnimal[] sheep, DomesticAnimal[] cows, DomesticAnimal[] horses) {
        this.address = address;
        this.ownerName = ownreName;
        this.sheep = sheep;
        this.cows = cows;
        this.horses = horses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnreName() {
        return ownerName;
    }

    public void setOwnreName(String ownreName) {
        this.ownerName = ownreName;
    }

    public DomesticAnimal[] getSheep() {
        return sheep;
    }

    public void setSheep(DomesticAnimal[] sheep) {
        this.sheep = sheep;
    }

    public DomesticAnimal[] getCows() {
        return cows;
    }

    public void setCows(DomesticAnimal[] cows) {
        this.cows = cows;
    }

    public DomesticAnimal[] getHorses() {
        return horses;
    }

    public void setHorses(DomesticAnimal[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "\nFarm's address:" + address + '\'' +
                ", \nOwner's name:" + ownerName + '\'' +
                ", \nSheep:" + Arrays.toString(sheep) +
                ", \nCows:" + Arrays.toString(cows) +
                ", \nHorses:" + Arrays.toString(horses) +
                '}';
    }
}
