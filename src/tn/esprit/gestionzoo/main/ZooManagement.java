package tn.esprit.gestionzoo.main;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import tn.esprit.gestionzoo.entities.*;


public class ZooManagement {

    public static void main(String[] args) {

                StudentManagement management = new StudentManagement();

                List<Student> students = new ArrayList<>();
                students.add(new Student(1, "Alice", 20));
                students.add(new Student(2, "Bob", 22));
                students.add(new Student(3, "Charlie", 19));


                System.out.println("All students:");
                management.displayStudents(students, System.out::println);


                System.out.println("\nStudents older than 20:");
                management.displayStudentsByFilter(students, student -> student.getAge() > 20, System.out::println);


                System.out.println("\nStudent names:");
                String names = management.returnStudentsNames(students, Student::getName);
                System.out.println(names);


                Student newStudent = management.createStudent(() -> new Student(4, "David", 21));
                students.add(newStudent);


                System.out.println("\nStudents sorted by ID:");
                management.sortStudentsById(students, Comparator.comparingInt(Student::getId));
                students.forEach(System.out::println);


                long count = management.convertToStream(students).count();
                System.out.println("\nNumber of students: " + count);
            }
        }






























        /*        AffectationHashMap gestionAffectation = new AffectationHashMap();

                Employe emp1 = new Employe(1, "Alice", "Smith", "Informatique", 2);
                Employe emp2 = new Employe(2, "Bob", "Johnson", "Ressources Humaines", 3);
                Employe emp3 = new Employe(3, "Charlie", "Brown", "Marketing", 1);

                Departement dep1 = new Departement(1, "Informatique", 10);
                Departement dep2 = new Departement(2, "Ressources Humaines", 5);

                gestionAffectation.ajouterEmployeDepartement(emp1, dep1);
                gestionAffectation.ajouterEmployeDepartement(emp2, dep2);
                gestionAffectation.ajouterEmployeDepartement(emp3, dep1);

                System.out.println("Affectations initiales :");
                gestionAffectation.afficherEmployesEtDepartements();

                gestionAffectation.ajouterEmployeDepartement(emp1, dep2);
                System.out.println("\nAprès réaffectation de Alice :");
                gestionAffectation.afficherEmployesEtDepartements();

                gestionAffectation.supprimerEmploye(emp2);
                System.out.println("\nAprès suppression de Bob :");
                gestionAffectation.afficherEmployesEtDepartements();

                gestionAffectation.supprimerEmployeEtDepartement(emp3, dep1);
                System.out.println("\nAprès suppression de Charlie du département Informatique :");
                gestionAffectation.afficherEmployesEtDepartements();

                gestionAffectation.afficherEmployes();
                gestionAffectation.afficherDepartements();

                System.out.println("\nRecherche de Alice : " + gestionAffectation.rechercherEmploye(emp1));
                System.out.println("\nRecherche du département Informatique : " + gestionAffectation.rechercherDepartement(dep1));

                System.out.println("\nAffectations triées par ID d'employé :");
                TreeMap<Employe, Departement> trie = gestionAffectation.trierMap();
                for (Map.Entry<Employe, Departement> entry : trie.entrySet()) {
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
            }
        }







          /*      DepartementHashSet gestionDepartements = new DepartementHashSet();


                Departement dep1 = new Departement(1, "Ressources Humaines", 10);
                Departement dep2 = new Departement(2, "Informatique", 20);
                Departement dep3 = new Departement(3, "Marketing", 15);


                gestionDepartements.ajouterDepartement(dep1);
                gestionDepartements.ajouterDepartement(dep2);
                gestionDepartements.ajouterDepartement(dep3);


                System.out.println("Liste des départements :");
                for (Departement dep : gestionDepartements.afficherTousLesDepartements()) {
                    System.out.println(dep);
                }


                System.out.println("Recherche du département avec ID 2 :");
                System.out.println(gestionDepartements.chercherDepartementParId(2));


                gestionDepartements.supprimerDepartement(dep2);
                System.out.println("Liste des départements après suppression :");
                for (Departement dep : gestionDepartements.afficherTousLesDepartements()) {
                    System.out.println(dep);
                }
            }
        }



















                Employe emp1 = new Employe(1, "Dupont", "Jean", "Informatique", 3);
                Employe emp2 = new Employe(2, "Martin", "Pierre", "Ressources Humaines", 2);
                Employe emp3 = new Employe(3, "Durand", "Sophie", "Informatique", 1);


                societe.ajouterEmploye(emp1);
                societe.ajouterEmploye(emp2);
                societe.ajouterEmploye(emp3);


                System.out.println("Liste des employés : ");
                societe.displayEmploye();

                System.out.println("\nEmployés triés par ID : ");
                societe.trierEmployeParId();
                societe.displayEmploye();



                System.out.println("\nEmployés triés par Nom, Département et Grade : ");
                societe.trierEmployeParNomDépartementEtGrade();
                societe.displayEmploye();
            }
        }













   /*     Animal[] animals = new Animal[3];
        Aquatic[] aquatics = new Aquatic[10];
        Zoo zoo = new Zoo("My Zoo", "Paris", animals, aquatics);

        try {

            zoo.addAnimal(new Animal("Felidae", "Lion", 5, true));
            System.out.println("Number of animals: " + zoo.getNbrAnimals());

            zoo.addAnimal(new Animal("Felidae", "Tiger", 4, true));
            System.out.println("Number of animals: " + zoo.getNbrAnimals());

            zoo.addAnimal(new Animal("Elephantidae", "Elephant", 10, true));
            System.out.println("Number of animals: " + zoo.getNbrAnimals());

            zoo.addAnimal(new Animal("Giraffidae", "Giraffe", -7, true));
            System.out.println("Number of animals: " + zoo.getNbrAnimals());

        } catch (ZooFullException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }


        Aquatic shark = new Aquatic("Fish", "Shark", 10, false, "Ocean");
        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Arctic", 50);
        Terrestrial lion = new Terrestrial("Felidae", "Lion", 5, true, 4);


        zoo.addAquatic(shark);
        zoo.addAquatic(penguin);


        System.out.println("Aquatic Animals Swimming:");
        zoo.displaySwim();


        System.out.println("Max Penguin Swimming Depth: " + zoo.maxPenguinSwimmingDepth());


        zoo.displayNumberOfAquaticsByType();


        System.out.println("\nTesting eating methods:");


        shark.eatMeat(Food.MEAT);


        penguin.eatMeat(Food.BOTH);


        lion.eatPlantAndMeat(Food.BOTH);


        Aquatic dolphin1 = new Aquatic("Cetacea", "Dolphin", 5, true, "Ocean");
        Aquatic dolphin2 = new Aquatic("Cetacea", "Dolphin", 5, true, "Ocean");

        if (dolphin1.equals(dolphin2)) {
            System.out.println("The dolphins are identical.");
        } else {
            System.out.println("The dolphins are different.");
        }


       /* shark.swim();
        dolphin.swim();
        penguin.swim();

        Zoo myZoo= new Zoo("my zoo","Paris",animals ) ;
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(giraffe);
        myZoo.addAnimal(lion);

        int index = myZoo.searchAnimal("Tiger");
        if (index != -1) {
            System.out.println("Tiger found at index: " + index);
        } else {
            System.out.println("Tiger not found.");
        }

        myZoo.removeAnimal(tiger);

        myZoo.displayZoo();

        System.out.println(myZoo.toString());



        for(int i=0;i< animals.length;i++) {
            System.out.println(animals[i].toString());
        }

        myZoo.displayAnimals();



    }
}*/

