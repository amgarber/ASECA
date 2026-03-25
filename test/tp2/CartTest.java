package tp2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CartTest {
    @Test
    public void shouldCreateEmptyCart(){
        Cart cart = new Cart();
        assertEquals(0, cart.getItems().size());
    }
    @Test
    public void shouldAddDifferentProductsToCart() {
        Cart cart = new Cart();
        Product product = new Product("1", "Coca Cola");
        Product product2 = new Product("2", "Agua");

        cart.add(product, 1);
        cart.add(product2, 5);

        assertEquals(2, cart.getItems().size());
        assertEquals(1, cart.getItems().get(0).getQuantity());
        assertEquals(5, cart.getItems().get(1).getQuantity());
    }

    @Test
    public void shouldRemoveProductFromCart() {
        Cart cart = new Cart();
        Product product = new Product("1", "Coca Cola");

        cart.add(product, 2);
        cart.remove(product, 1);

        assertEquals(1, cart.getItems().size());
    }
}
