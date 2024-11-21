package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.interfaces.IGestion;

import java.util.ArrayList;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {
    private ArrayList<Employe> listeEmployes;

    // Constructeur
    public SocieteArrayList() {
        this.listeEmployes = new ArrayList<>();
    }

    // Ajouter un employé
    @Override
    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    // Rechercher un employé par nom
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : listeEmployes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    // Rechercher un employé par l'objet employé
    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }

    // Supprimer un employé
    @Override
    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    // Afficher les employés
    @Override
    public void displayEmploye() {
        for (Employe employe : listeEmployes) {
            System.out.println(employe);
        }
    }

    // Trier les employés par ID (Comparable)
    @Override
    public void trierEmployeParId() {
        listeEmployes.sort(Comparator.comparingInt(Employe::getId));
    }

    // Trier les employés par Nom, Département et Grade (Comparator)
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        listeEmployes.sort(Comparator
                .comparing(Employe::getNom)
                .thenComparing(Employe::getNomDepartement)
                .thenComparingInt(Employe::getGrade));
    }
}
