package tp2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CartTest {
    @Test
    public void shouldCreateEmptyCart(){
        Cart cart = new Cart();
        assertEquals(0, cart.getProducts().size());
    }
}
