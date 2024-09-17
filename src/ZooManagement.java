import java.util.Scanner;

public class ZooManagement {
    private int nbrCages;
    private String zooName;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ZooManagement zooManagement = new ZooManagement();

        System.out.print("Entrez le nom du zoo : ");
        zooManagement.zooName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide pour les cages.");
            scanner.next();
            System.out.print("Entrez le nombre de cages : ");
        }
        zooManagement.nbrCages = scanner.nextInt();
        scanner.nextLine();

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal giraffe = new Animal("Giraffidae", "Giraffe", 7, true);

        Animal[] animals = new Animal[25];
        animals[0] = lion;
        animals[1] = tiger;
        animals[2] = giraffe;

        Zoo myZoo = new Zoo(animals, zooManagement.zooName, "Paris", zooManagement.nbrCages);

        myZoo.displayZoo();

        System.out.println("Les animaux présents sont :");
        for (Animal animal : myZoo.getAnimals()) {
            if (animal != null) {
                animal.displayAnimal();
            }
        }

        scanner.close();
    }
}
