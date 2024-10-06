package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {


    private String name;
    private String city;
    private int nbrCages;
    static int nbrAnimals=0;
    private Animal[] animals;

    public Zoo(String name, String city, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = 25;
        this.animals = new Animal[nbrCages];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null ) {
            System.out.println("Le nom du zoo ne doit pas être vide");
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public static int getNbrAnimals() {
        return nbrAnimals;
    }


    public boolean addAnimal(Animal animal) {
        if(searchAnimal(animal.getName()) == -1 && !isZooFull()) {
        animals[nbrAnimals]=animal;
        nbrAnimals++;
        return true; }
        return false;
    }
    public boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal.getName());
        if(index != -1){
            for(int i=index;i<nbrAnimals-1;i++){
               animals[i]=animals[i+1];
            }
            animals[nbrAnimals-1]=null;
            nbrAnimals--;
            return true;
        }
        return false;
    }

    public boolean isZooFull(){
        if (nbrAnimals < nbrCages) {
            return false;
        }
        return true;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.nbrAnimals < z2.nbrAnimals){
            return z1;
        }
        return z2;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void displayZoo(){
        System.out.println("zoo name: " + name);
        System.out.println("zoo city: " + city);
        System.out.println("zoo nbrCages: " + nbrCages);
    }

    public int searchAnimal(String name){
        for(int i=0;i<nbrAnimals;i++){
            if(animals[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }

}
