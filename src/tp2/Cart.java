package tp2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void add(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
    }


}
