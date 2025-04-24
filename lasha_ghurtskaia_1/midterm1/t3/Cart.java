package lasha_ghurtskaia_1.midterm1.t3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();

    public void addToCart(Product product) {
        items.add(product);
    }
    public void removeFromCart(Product product) {
        items.remove(product);
    }
    public double getTotalPrice() {
        double total = 0;
        for (Product p : items){
            total += p.getPrice();
        }
        return total;
    }
    public void printCart() {
        for (Product p : items) {
            System.out.println(p.getName() + " - $" + p.getPrice());
        }
    }
}
