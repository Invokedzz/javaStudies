package review.withoutinterfacessagain.model.services;

public class TraditionalTax implements TaxOrder {

    @Override
    public Double generateTax ( double amount, double tax ) {

        return amount * tax;

    }

}
