package tn.esprit.gestionemployes.produits;

import java.util.ArrayList;
import java.util.List;

public class TestProduct {
    public static void main(String[] args) {

        ProductManagement pm = new ProductManagement();
        List<Product> list = new ArrayList<>();

        // Ajout de produits
        list.add(new Product(3, "Clavier", 50.0));
        list.add(new Product(1, "Souris", 20.0));
        list.add(new Product(2, "Écran", 700.0));
        list.add(new Product(4, "Imprimante", 350.0));

        System.out.println("\n--- Affichage des produits ---");
        pm.displayProducts(list, p -> System.out.println(p));

        System.out.println("\n--- Produits avec prix > 100 ---");
        pm.displayProductsByFilter(list,
                p -> p.getPrix() > 100,
                p -> System.out.println(p));

        System.out.println("\n--- Liste des noms des produits ---");
        String names = pm.returnProductsNames(list, p -> p.getNom());
        System.out.println(names);

        System.out.println("\n--- Création d'un produit via Supplier ---");
        Product newP = pm.createProduct(() -> new Product(5, "USB", 15.0));
        System.out.println(newP);

        System.out.println("\n--- Tri des produits par ID ---");
        pm.sortProductsById(list, (p1, p2) -> p1.getId() - p2.getId());
        list.forEach(System.out::println);

        System.out.println("\n--- Conversion en Stream ---");
        pm.convertToStream(list).forEach(System.out::println);
    }
}
