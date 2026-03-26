package tp2;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private BigDecimal price;

    public Product(String id, String name) {
        this(id, name, BigDecimal.ZERO);
    }

    public Product(String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price == null ? BigDecimal.ZERO : price;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public BigDecimal getPrice() { return price; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
