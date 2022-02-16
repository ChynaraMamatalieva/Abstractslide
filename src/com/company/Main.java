package com.company;

public class Main {

    public static void main(String[] args) {
        DomesticAnimal sheep1 = new Sheep("Kudryuashka", (byte) 2, 56, "F");
        DomesticAnimal sheep2 = new Sheep("Sveta", (byte) 1, 66, "M");
        DomesticAnimal sheep3 = new Sheep("Aidaho", (byte) 4, 46, "M");
        DomesticAnimal sheep4 = new Sheep("Alenka", (byte) 3, 37, "F");

        DomesticAnimal cow1 = new Cow("AlaBuka", (byte) 8, 155.0, "M");
        DomesticAnimal cow2 = new Cow("Natasha", (byte) 5, 100, "F");
        DomesticAnimal cow3 = new Cow("AlaUy", (byte) 3, 95, "F");
        DomesticAnimal cow4 = new Cow("Bomba", (byte) 7, 85, "F");
        DomesticAnimal cow5 = new Cow("Gulliver", (byte) 4, 115, "M");
        DomesticAnimal cow6 = new Cow("Borzyi", (byte) 9, 145, "M");

        DomesticAnimal horse1 = new Horse("BelayaGriva", (byte) 4, 150, "F", "grey");
        DomesticAnimal horse2 = new Horse("Artem", (byte) 5, 160, "M", "black");
        DomesticAnimal horse3 = new Horse("Artur", (byte) 4, 180, "M", "white");


//        Farm farm1 = new Farm("Alay", "Kymbat", sheep8, cow8, horse8);
//        Farm farm2 = new Farm("Karashoro", "Aziz", sheep9, cow9, horse9);

        DomesticAnimal[] domesticAnimals = {sheep1, sheep2, sheep3, cow1, cow2, cow3, cow4, cow5, horse1, horse2};
        Cow[] cows = new Cow[5];
        Sheep[] sheep = new Sheep[3];
        Horse[] horses = new Horse[2];
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (DomesticAnimal d : domesticAnimals) {
            if (d instanceof Cow) {
                cows[count] = (Cow) d;
                count++;
            }
            if (d instanceof Sheep) {
                sheep[count1] = (Sheep) d;
                count1++;
            }
            if (d instanceof Horse) {
                horses[count2] = (Horse) d;
                count2++;
            }
        }
        Farm farm1 = new Farm("Alay", "Kymbat", cows, sheep, horses);
        System.out.println(farm1);
        System.out.println("***************************************");

        DomesticAnimal[] domesticAnimals1 = {sheep4, cow6, horse3};
        Cow[] cows1 = new Cow[1];
        Sheep[] sheep5 = new Sheep[1];
        Horse[] horses1 = new Horse[1];
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        for (DomesticAnimal k : domesticAnimals1) {
            if (k instanceof Cow) {
                cows1[count7] = (Cow) k;
                count7++;
            }
            if (k instanceof Sheep) {
                sheep5[count8] = (Sheep) k;
                count8++;
            }
            if (k instanceof Horse) {
                horses1[count9] = (Horse) k;
                count9++;
            }
        }
        Farm farm2 = new Farm("Karashoro", "Azizbek", cows1, sheep5, horses1);

        System.out.println(farm2);


    }
}







