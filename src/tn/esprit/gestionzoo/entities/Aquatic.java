package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Carnivore;
import java.util.Objects;

public class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming");
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aquatic aquatic)) return false;

        return this.getAge() == aquatic.getAge() &&
                this.getName().equals(aquatic.getName()) &&
                Objects.equals(this.habitat, aquatic.habitat);
    }

    @Override
    public String toString() {
        return super.toString() + "Aquatic{" + "habitat=" + habitat + '}';
    }
}
