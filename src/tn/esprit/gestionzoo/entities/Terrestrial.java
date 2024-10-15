package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Animal;

public class Terrestrial extends Animal {
    protected int nbrLegs;
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs ) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
public int getNbrLegs() {
        return nbrLegs;
}
public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
}

    @Override
    public String toString() {
        return super.toString() + "\nNbr Legs: " + nbrLegs;
    }
}
