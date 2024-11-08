package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private int numberOfLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int numberOfLegs) {
        super(family, name, age, isMammal);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " is eating meat.");
        } else {
            System.out.println(getName() + " cannot eat this food type.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getName() + " is eating plants.");
        } else {
            System.out.println(getName() + " cannot eat this food type.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " is eating both plants and meat.");
        } else {
            System.out.println(getName() + " prefers both meat and plants together.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Terrestrial{" + "numberOfLegs=" + numberOfLegs + '}';
    }
}
