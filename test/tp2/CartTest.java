package tp2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CartTest {
    @Test
    public void shouldCreateEmptyCart(){
        Cart cart = new Cart();
        assertEquals(0, cart.getProducts().size());
    }
    @Test
    public void shouldAddProductToCart() {
        Cart cart = new Cart();
        Product product = new Product("1", "Coca Cola", 1);

        cart.add(product);

        assertEquals(1, cart.getProducts().size());
    }
}
