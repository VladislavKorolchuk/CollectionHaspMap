package HomeWork1.ProductsAndRecipe;

import java.util.HashMap;

public final class ProductList {
    final private HashMap<Product, Integer> productHashSet = new HashMap<>();

    public void addProduct(Product product, Integer number) {
        if (number <= 0) {
            number = 1;
        }
        this.productHashSet.put(product, number);
    }

}
