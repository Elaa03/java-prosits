package tn.esprit.gestionemployes.affectations;

import tn.esprit.gestionemployes.Employe;
import tn.esprit.gestionemployes.departements.Departement;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private Map<Employe, Departement> affectations = new HashMap<>();

    // 2. Affecter un employé à un département
    public void ajouterEmployeDepartement(Employe e, Departement d) {

        if (affectations.containsKey(e)) {
            System.out.println("⚠️ Cet employé est déjà affecté à un département !");
        } else {
            affectations.put(e, d);
            System.out.println("✔ Affectation ajoutée : " + e.getNom() + " → " + d.getNomDepartement());
        }
    }

    // 3. Afficher toutes les affectations
    public void afficherEmployesEtDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation trouvée.");
            return;
        }

        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    // 4. Supprimer un employé
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
        System.out.println("✔ Employé supprimé des affectations.");
    }

    // 5. Supprimer une affectation précise
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("✔ Affectation supprimée.");
        } else {
            System.out.println("❌ Affectation non trouvée.");
        }
    }

    // 6. Affichage liste employés
    public void afficherEmployes() {
        affectations.keySet().forEach(System.out::println);
    }

    // 7. Affichage liste départements
    public void afficherDepartements() {
        affectations.values().forEach(System.out::println);
    }

    // 8. Recherche employé
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // 9. Recherche département
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    // 10. Tri des employés par ID (TreeMap)
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>((e1, e2) -> e1.getId() - e2.getId());
    }
}
