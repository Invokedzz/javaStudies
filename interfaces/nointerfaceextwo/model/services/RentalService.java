package interfaces.nointerfaceextwo.model.services;

import interfaces.nointerfaceexercise.model.services.BrazilTaxService;

import interfaces.nointerfaceextwo.model.entities.CarRental;

import interfaces.nointerfaceextwo.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;

    private Double pricePerHour;

    private BrazilTaxService brazilTaxService;

    public RentalService () {}

    public RentalService ( Double pricePerDay, Double pricePerHour, BrazilTaxService brazilTaxService ) {

        this.pricePerDay = pricePerDay;

        this.pricePerHour = pricePerHour;

        this.brazilTaxService = brazilTaxService;

    }

    public Double getPricePerDay () {

        return pricePerDay;

    }

    public Double getPricePerHour () {

        return pricePerHour;

    }

    public BrazilTaxService getBrazilTaxService () {

        return brazilTaxService;

    }

    public void processInvoice ( CarRental carRental ) {

        double minutes = Duration.between( carRental.getStart(), carRental.getFinish() ).toMinutes();

        double hours = minutes / 60.0;

        double basicPayment = 0.0;

        if ( hours <= 12.0 ) basicPayment = pricePerHour * Math.ceil( hours );

        if ( hours > 12.0 ) basicPayment = pricePerDay * Math.ceil( hours / 24.0 );

        double tax = getBrazilTaxService().tax( basicPayment );

        carRental.setInvoice( new Invoice ( basicPayment, tax ));

    }

}
