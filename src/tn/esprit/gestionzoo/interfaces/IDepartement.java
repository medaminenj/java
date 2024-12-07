package tn.esprit.gestionzoo.interfaces;
import tn.esprit.gestionzoo.entities.Departement;

import java.util.Set;

public interface IDepartement {
    boolean ajouterDepartement(Departement departement);
    boolean supprimerDepartement(Departement departement);
    Departement chercherDepartementParId(int id);
    Set<Departement> afficherTousLesDepartements();
}
