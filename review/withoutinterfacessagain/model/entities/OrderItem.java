package review.withoutinterfacessagain.model.entities;

public class OrderItem {

    private Integer quantity;

    private Double tax;

    private Product product;

    public OrderItem () {}

    public OrderItem ( Integer quantity, Double tax, Product product ) {

        this.quantity = quantity;

        this.tax = tax;

        this.product = product;

    }

    public Integer getQuantity () {

        return quantity;

    }

    public Double tax () {

        return tax;

    }

    public Product getProduct () {

        return product;

    }

    public double subTotal () {

        return getQuantity() * getProduct().getProductPrice();

    }

}
