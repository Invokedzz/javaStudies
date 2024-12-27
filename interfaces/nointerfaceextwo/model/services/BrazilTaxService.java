package interfaces.nointerfaceextwo.model.services;

public class BrazilTaxService {

    public Double taxValue ( Double amount ) {

        if ( amount <= 100.0 ) return amount * 0.20;

        return amount * 0.15;

    }

}
