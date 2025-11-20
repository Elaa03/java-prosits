package tn.esprit.gestionemployes.departements;

public class TestDepartement {
    public static void main(String[] args) {

        DepartementHashSet depSet = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 20);
        Departement d2 = new Departement(2, "RH", 8);
        Departement d3 = new Departement(3, "Comptabilité", 12);
        Departement d4 = new Departement(4, "Informatique", 25);

        depSet.ajouterDepartement(d1);
        depSet.ajouterDepartement(d2);
        depSet.ajouterDepartement(d3);
        depSet.ajouterDepartement(d4);

        System.out.println("\n--- Affichage des départements ---");
        depSet.afficherDepartements();

        System.out.println("\n--- Recherche 'Informatique' ---");
        System.out.println(depSet.rechercherDepartement("Informatique"));

        System.out.println("\n--- Tri par ID ---");
        depSet.trierDepartementsParId();

        System.out.println("\n--- Tri par Nom puis Nombre Employés ---");
        depSet.trierDepartementsParNomEtNombreEmployes();
    }
}
