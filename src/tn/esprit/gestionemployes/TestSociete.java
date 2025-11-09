package tn.esprit.gestionemployes;

import java.util.List;

public class TestSociete {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Ben Ali", "Sami", "Informatique", 3);
        Employe e2 = new Employe(2, "Trabelsi", "Mouna", "RH", 2);
        Employe e3 = new Employe(3, "Zitoun", "Rami", "Informatique", 1);
        Employe e4 = new Employe(4, "Ayari", "Lina", "Comptabilité", 2);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("Liste des employés :");
        societe.displayEmploye();

        System.out.println("\n--- Tri par ID ---");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n--- Tri par Département, Grade et Nom ---");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n--- Recherche département Informatique ---");
        List<Employe> result = societe.rechercherParDepartement("Informatique");
        result.forEach(System.out::println);
    }
}
