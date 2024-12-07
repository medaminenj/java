package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.interfaces.IDepartement;

import java.util.HashSet;
import java.util.Set;

public class DepartementHashSet implements IDepartement {
    private Set<Departement> departements;


    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }


    @Override
    public boolean ajouterDepartement(Departement departement) {
        return departements.add(departement); // Ajout d'un département
    }

    @Override
    public boolean supprimerDepartement(Departement departement) {
        return departements.remove(departement); // Suppression d'un département
    }

    @Override
    public Departement chercherDepartementParId(int id) {
        for (Departement departement : departements) {
            if (departement.getId() == id) {
                return departement; // Recherche par ID
            }
        }
        return null;
    }

    @Override
    public Set<Departement> afficherTousLesDepartements() {
        return new HashSet<>(departements); // Renvoie tous les départements
    }
}
