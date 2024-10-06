package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;

public class ZooManagement {

    private int nbrCages;
    private String zooName;

    public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();
        Scanner sc = new Scanner(System.in);

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal giraffe = new Animal("Giraffidae", "Giraffe", 7, true);
        Animal[] animals=new Animal[zooManagement.nbrCages];

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
        }*/

        myZoo.displayAnimals();



    }
}