
import java.util.Arrays;

public class Zoo {

    String name;
    String city;
    int nbrcages;
    Animal[] animals;

    public Zoo(String name, String city, int nbrcages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrcages = nbrcages;
        this.animals = new Animal[nbrcages];
    }

    public void displayZoo(){
        System.out.println("zoo name: " + name);
        System.out.println("zoo city: " + city);
        System.out.println("zoo nbrcages: " + nbrcages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrcages=" + nbrcages +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}
