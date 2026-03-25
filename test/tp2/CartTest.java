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
    public void shouldAddProductToCart() {
        Cart cart = new Cart();
        Product product = new Product("1", "Coca Cola");

        cart.add(product, 1);

        assertEquals(1, cart.getItems().size());
        assertEquals(1, cart.getItems().get(0).getQuantity());
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
