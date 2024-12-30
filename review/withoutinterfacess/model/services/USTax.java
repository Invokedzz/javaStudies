package review.withoutinterfacess.model.services;

public class USTax implements TaxService {

    @Override
    public double determineTax ( double amount ) {

        double dollarConverter = amount * 6.20;

        if ( dollarConverter < 50.0 ) return dollarConverter * 0.20;

        return dollarConverter * 0.60;

    }

}
