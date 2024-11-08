package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;


public class ZooManagement {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        Aquatic[] aquatics = new Aquatic[10];
        Zoo zoo = new Zoo("My Zoo", "Paris", animals, aquatics);

        try {

            zoo.addAnimal(new Animal("Felidae", "Lion", 5, true));
            System.out.println("Number of animals: " + zoo.getNbrAnimals());

            zoo.addAnimal(new Animal("Felidae", "Tiger", 4, true));
            System.out.println("Number of animals: " + zoo.getNbrAnimals());

            zoo.addAnimal(new Animal("Elephantidae", "Elephant", 10, true));
            System.out.println("Number of animals: " + zoo.getNbrAnimals());

            zoo.addAnimal(new Animal("Giraffidae", "Giraffe", -7, true));
            System.out.println("Number of animals: " + zoo.getNbrAnimals());

        } catch (ZooFullException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }


        Aquatic shark = new Aquatic("Fish", "Shark", 10, false, "Ocean");
        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Arctic", 50);
        Terrestrial lion = new Terrestrial("Felidae", "Lion", 5, true, 4);


        zoo.addAquatic(shark);
        zoo.addAquatic(penguin);


        System.out.println("Aquatic Animals Swimming:");
        zoo.displaySwim();


        System.out.println("Max Penguin Swimming Depth: " + zoo.maxPenguinSwimmingDepth());


        zoo.displayNumberOfAquaticsByType();


        System.out.println("\nTesting eating methods:");


        shark.eatMeat(Food.MEAT);


        penguin.eatMeat(Food.BOTH);


        lion.eatPlantAndMeat(Food.BOTH);


        Aquatic dolphin1 = new Aquatic("Cetacea", "Dolphin", 5, true, "Ocean");
        Aquatic dolphin2 = new Aquatic("Cetacea", "Dolphin", 5, true, "Ocean");

        if (dolphin1.equals(dolphin2)) {
            System.out.println("The dolphins are identical.");
        } else {
            System.out.println("The dolphins are different.");
        }


       /* shark.swim();
        dolphin.swim();
        penguin.swim();

        Zoo myZoo= new Zoo("my zoo","Paris",animals ) ;
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(giraffe);
        myZoo.addAnimal(lion);

        int index = myZoo.searchAnimal("Tiger");
        if (index != -1) {
            System.out.println("Tiger found at index: " + index);
        } else {
            System.out.println("Tiger not found.");
        }

        myZoo.removeAnimal(tiger);


/*
        myZoo.displayZoo();

        System.out.println(myZoo.toString());



        for(int i=0;i< animals.length;i++) {
            System.out.println(animals[i].toString());
        }

        myZoo.displayAnimals();*/



    }
}