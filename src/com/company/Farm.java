package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    private Sheep[] sheep;
    private Cow[] cows;
    private Horse[] horses;

    public Farm(){

    }

    public Farm(String address, String ownreName, Sheep[] sheep, Cow[] cows, Horse[] horses) {
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

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "\naddress='" + address + '\'' +
                ", \nownreName='" + ownerName + '\'' +
                ", \nsheep=" + Arrays.toString(sheep) +
                ", \ncows=" + Arrays.toString(cows) +
                ", \nhorses=" + Arrays.toString(horses) +
                '}';
    }
}
