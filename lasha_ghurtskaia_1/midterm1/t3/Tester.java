package lasha_ghurtskaia_1.midterm1.t3;

public class Tester {
    public static void main(String[] args){
        Product p1 = new Product();
        p1.setName("Carrot");
        p1.setPrice(31.3);

        Product p2 = new Product();
        p2.setName("Banana");
        p2.setPrice(4.3);

        SMS sms = new SMS();
        sms.addProduct(p1);
        sms.addProduct(p1);
        sms.addProduct(p2);
        sms.removeBook(p1);
        sms.printProducts();

        // new functionality: shopping cart
        System.out.println("new functionality");
        Cart cart = new Cart();
        cart.addToCart(p1);
        cart.addToCart(p2);
        cart.printCart();

        System.out.println("\nremoval");
        cart.removeFromCart(p1);
        cart.printCart();
    }
}
