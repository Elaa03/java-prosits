package tn.esprit.gestionemployes.affectations;

import tn.esprit.gestionemployes.Employe;
import tn.esprit.gestionemployes.departements.Departement;

public class TestAffectation {
    public static void main(String[] args) {

        AffectationHashMap map = new AffectationHashMap();

        Employe e1 = new Employe(1, "Sami", "Ben Ali", "Informatique", 3);
        Employe e2 = new Employe(2, "Mouna", "Trabelsi", "RH", 2);

        Departement d1 = new Departement(1, "Informatique", 20);
        Departement d2 = new Departement(2, "RH", 8);

        // Test affectations
        map.ajouterEmployeDepartement(e1, d1);
        map.ajouterEmployeDepartement(e2, d2);

        System.out.println("\n--- Affichage des affectations ---");
        map.afficherEmployesEtDepartements();

        // Test: même employé, autre département
        System.out.println("\n--- Test double affectation ---");
        map.ajouterEmployeDepartement(e1, d2);

        // Test suppression affectation
        System.out.println("\n--- Suppression affectation e1 ---");
        map.supprimerEmploye(e1);

        map.afficherEmployesEtDepartements();
    }
}
