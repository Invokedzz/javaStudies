package content.POO.somexercises.entities;

public class EntityInvoice {

    // number (String), description (String), qty (int) and itemPrice (double)

    private final String number;

    private final String description;

    private int qty;

    private double itemPrice;

    public EntityInvoice ( String number, String description, int qty, double itemPrice ) {

        this.number = number;

        this.description = description;

        this.qty = qty;

        this.itemPrice = itemPrice;

    }

    // if qty < 0, this.qty = 0 and if itemPrice < 0, this.itemPrice = 0

    public void setQty ( int qty ) {

        if ( qty < 0 ) {

            this.qty = 0;

            return;

        }

        this.qty = qty;

    }

    public void setItemPrice ( double itemPrice ) {

        if ( itemPrice < 0 ) {

            this.itemPrice = 0;

            return;

        }

        this.itemPrice = itemPrice;

    }

    public double getInvoiceAmount () {

        return itemPrice * qty;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append("Number: ").append(number)
                .append(" Description: ").append(description)
                .append(" Quantity: ").append(qty)
                .append(" Price: ").append(itemPrice);

        return sb.toString();

    }

}
