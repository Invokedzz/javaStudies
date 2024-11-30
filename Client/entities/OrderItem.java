package Client.entities;

public class OrderItem {

    private int quantity;

    private double price;

    private Product product;

    public OrderItem (int quantity, double price, Product product) {

        this.quantity = quantity;

        this.price = price;

        this.product = product;

    }

    public double subTotal () {

        return quantity * price;

    }

    @Override
    public String toString () {

        return product.getProductName() + " $ "
                + String.format( "%s ", price) +
                "Quantity: " + quantity +
                " Subtotal: $" + subTotal();

    }

}
