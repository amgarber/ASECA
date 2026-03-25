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
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(product.getId())) {
                item.increaseQuantity(quantity);
                return;
            }
        }

        items.add(new CartItem(product, quantity));
    }

    public void remove(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(product.getId())) {
                if (item.getQuantity() > quantity) {
                    item.decreaseQuantity(quantity);
                } else {
                    items.remove(item);
                }
                return;
            }
        }
    }
}



