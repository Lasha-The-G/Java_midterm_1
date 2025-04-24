package lasha_ghurtskaia_1.midterm1.t3;

import java.util.ArrayList;
import java.util.List;

public class SMS {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public boolean removeBook(Product book){
        boolean removed = false;
        for (int i = 0; i< products.size(); i++){
            Product p = products.get(i);
            // Not adding conparison by price. Unnecesary complication.
            if (p.getName().equals(p.getName())){
                products.remove(i);
                removed = true;
            }
        }
        System.out.println("The book was removed");
        return removed;
    }
    public void printProducts(){
        if(products.isEmpty()){
            System.out.printf("No products in the database");
        }else {
            for (Product p : products){
                System.out.println(" " + p.getName() + " ");
                System.out.println();
            }
        }
    }
}
