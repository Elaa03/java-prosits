package tn.esprit.gestionemployes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private List<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return employes.stream().anyMatch(e -> e.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }

    @Override
    public void displayEmploye() {
        employes.forEach(System.out::println);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employe::getId));
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        employes.sort(Comparator
                .comparing(Employe::getNomDepartement)
                .thenComparing(Employe::getGrade)
                .thenComparing(Employe::getNom));
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> result = new ArrayList<>();
        for (Employe e : employes) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                result.add(e);
            }
        }
        return result;
    }
}
