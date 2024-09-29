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
        AZoo myzoo= new Zoo("my zoo","Paris",3,animals ) ;
        Zoo myZoo = new Zoo("my zoo", "Paris", 20, animals);

        System.out.println("Nom de zoo: ");
        zooManagement.zooName = sc.nextLine();
        System.out.println("Nombre de cages: ");

        while (!sc.hasNextInt()) {
            System.out.println("Veuillez entrer un entier");
            sc.next();
            System.out.println("Nombre de cages: ");
        }
        zooManagement.nbrCages = sc.nextInt();
        System.out.println(zooManagement.zooName + " comporte " + zooManagement.nbrCages + " cages");
        sc.close();

        myZoo.displayZoo();

        System.out.println(myZoo.toString());
        for(int i=0;i<animals.length;i++) {
            System.out.println(animals[i].toString());
        }
    }
}
