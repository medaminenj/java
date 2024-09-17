import java.util.Scanner;

public class ZooManagement {
    // Variables d'instance
    private int nbrCages;
    private String zooName;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();

        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages : ");

        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide pour les cages.");
            scanner.next();

            System.out.print("Entrez le nombre de cages : ");
        }
        zoo.nbrCages = scanner.nextInt();


        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");

        scanner.close();
    }
}
