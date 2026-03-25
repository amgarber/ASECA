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

    public void remove(Product product) {
        items.removeIf(item -> item.getProduct().getId().equals(product.getId()));
    }


}
