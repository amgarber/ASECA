package tp2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductsTest {
    @Test
    public void testProducts(){
        Product product = new Product("1", "Coca Cola");
        assertEquals("1", product.getId());
        assertEquals("Coca Cola", product.getName());
    }
    
}
