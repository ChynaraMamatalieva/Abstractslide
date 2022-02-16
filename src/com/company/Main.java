package com.company;

public class Main {

    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("Kudryuashka", (byte) 2, 56, "F");
        Sheep sheep2 = new Sheep("Sveta", (byte) 1, 66, "M");
        Sheep sheep3 = new Sheep("Aidaho", (byte) 4, 46, "M");
        Sheep[] sheep = {sheep1, sheep2, sheep3};


        Cow cow1 = new Cow("AlaBuka", (byte) 8, 155.0,"M");
        Cow cow2 = new Cow("Natasha", (byte) 5, 100,"F");
        Cow cow3 = new Cow("AlaUy", (byte) 3, 95,"F");
        Cow cow4 = new Cow("Bomba", (byte) 7, 85,"F");
        Cow cow5 = new Cow("Gulliver", (byte) 4, 115,"M");
        Cow[] cows = {cow1, cow2, cow3, cow4, cow5};


        Horse horse1 = new Horse("BelayaGriva", (byte) 4, 150, "F", "grey");
        Horse horse2 = new Horse("Artem", (byte) 5, 160, "M", "black");
        Horse[] horses = {horse1, horse2};

        Farm farm1 = new Farm("Alay", "Kymbat", sheep, cows, horses);



        Sheep sheep4 = new Sheep("Alenka", (byte) 3, 37, "F");
        Sheep[] sheep10 = {sheep4};
        Cow cow6 = new Cow("Borzyi", (byte) 9, 145,"M");
        Cow[] cows1 = {cow6};
        Horse horse3 = new Horse("Artur", (byte) 4, 180, "M", "white");
        Horse[] horses1 = {horse3};

        Farm farm2 = new Farm("Karashoro", "Maksat", sheep10, cows1, horses1);

        System.out.println(farm1);
        System.out.println("**********************************************");
        System.out.println(farm2);
    }


}
