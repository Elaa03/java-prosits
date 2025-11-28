package tn.esprit.gestionemployes.produits;

import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class ProductManagement implements Management {

    @Override
    public void displayProducts(List<Product> products, Consumer<Product> con) {
        products.forEach(con);
    }

    @Override
    public void displayProductsByFilter(List<Product> products,
                                        Predicate<Product> pre,
                                        Consumer<Product> con) {
        products.stream()
                .filter(pre)
                .forEach(con);
    }

    @Override
    public String returnProductsNames(List<Product> products, Function<Product, String> fun) {
        StringBuilder sb = new StringBuilder();
        for (Product p : products) {
            sb.append(fun.apply(p)).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public Product createProduct(Supplier<Product> sup) {
        return sup.get();
    }

    @Override
    public List<Product> sortProductsById(List<Product> products, Comparator<Product> com) {
        products.sort(com);
        return products;
    }

    @Override
    public Stream<Product> convertToStream(List<Product> products) {
        return products.stream();
    }
}
