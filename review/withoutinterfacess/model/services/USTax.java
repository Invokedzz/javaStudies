package review.withoutinterfacess.model.services;

public class USTax {

    public double determineTax ( Double amount ) {

        double dollarConverter = amount * 6.20;

        if ( dollarConverter < 50.0 ) return dollarConverter * 0.20;

        return dollarConverter * 0.60;

    }

}
