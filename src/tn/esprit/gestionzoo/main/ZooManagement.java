package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class ZooManagement {

    private int nbrCages;
    private String zooName;

    public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();
        Scanner sc = new Scanner(System.in);


        /*Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal giraffe = new Animal("Giraffidae", "Giraffe", 7, true);*/
        Animal[] animals=new Animal[zooManagement.nbrCages];

        Aquatic shark = new Aquatic("Fish", "Shark", 10, false, "Ocean");
        Terrestrial lion = new Terrestrial("Felidae", "Lion", 5, true, 4);
        Dolphin dolphin = new Dolphin("Fish", "dolphin", 4, false, "Ocean",80);
        Penguin penguin = new Penguin("Fish", "penguin", 3, false, "Ocean",50);

        shark.swim();
        dolphin.swim();
        penguin.swim();



       /* Zoo myZoo= new Zoo("my zoo","Paris",animals ) ;
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