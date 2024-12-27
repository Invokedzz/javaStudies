package review.withoutinterfacess.model.entities;

public class Invoice {

    private Double payment;

    private Double tax;

    public Invoice () {}

    public Invoice ( Double payment, Double tax ) {

        this.payment = payment;

        this.tax = tax;

    }

    public Double getPayment () {

        return payment;

    }

    public void setPayment ( Double payment ) {

        this.payment = payment;

    }

    public Double getTax () {

        return tax;

    }

    public void setTax ( Double tax ) {

        this.tax = tax;

    }

    public double totalPayment () {

        return getPayment() + getTax();

    }

}
