import java.util.Arrays;

public class Zoo {


    String name;
    String city;
    final int nbrCages;
    static int nbrAnimals=0;
    Animal[] animals;

    public Zoo(String name, String city, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = 25;
        this.animals = new Animal[nbrCages];
    }

    boolean addAnimal(Animal animal) {
        if(searchAnimal(animal.name) == -1 && nbrAnimals < nbrCages) {
        animals[nbrAnimals]=animal;
        nbrAnimals++;
        return true; }
        return false;
    }
    boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal.name);
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

    boolean isZooFull(){
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

    void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void displayZoo(){
        System.out.println("zoo name: " + name);
        System.out.println("zoo city: " + city);
        System.out.println("zoo nbrCages: " + nbrCages);
    }

    int searchAnimal(String name){
        for(int i=0;i<nbrAnimals;i++){
            if(animals[i].name.equals(name)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }

}
