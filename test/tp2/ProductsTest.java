package tp2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductsTest {
    @Test
    public void shouldCreateProductId(){
        Product product = new Product("1", "Coca Cola");
        assertEquals("1", product.getId());

    }
    @Test
    public void shouldCreateProductName() {
        Product product = new Product("1", "Coca Cola");
        assertEquals("Coca Cola", product.getName());
    }


}
