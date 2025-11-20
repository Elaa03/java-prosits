package tn.esprit.gestionemployes.departements;

import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {

    private Set<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        return departements.stream()
                .anyMatch(d -> d.getNomDepartement().equalsIgnoreCase(nomDepartement));
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    @Override
    public void afficherDepartements() {
        departements.forEach(System.out::println);
    }

    @Override
    public void trierDepartementsParId() {
        List<Departement> list = new ArrayList<>(departements);
        list.sort(Comparator.comparingInt(Departement::getId));
        list.forEach(System.out::println);
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> list = new ArrayList<>(departements);
        list.sort(Comparator
                .comparing(Departement::getNomDepartement)
                .thenComparing(Departement::getNombreEmployes)
        );
        list.forEach(System.out::println);
    }
}
