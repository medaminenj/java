package tn.esprit.gestionzoo.entities;

public class Animal {
     protected String family;
     protected String name;
     protected  int age;
     protected   boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void setFamily(String family) {
        this.family = family;
    }
    public String getFamily() {
        return family;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException();
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }
    public boolean isMammal() {
        return isMammal;
    }

    public void displayAnimal() {
        System.out.println(name + ", " + age + " ans, Famille : " + family + ", Mammifère : " + (isMammal ? "Oui" : "Non"));
    }
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

}