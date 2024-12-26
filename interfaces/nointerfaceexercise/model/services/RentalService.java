package interfaces.nointerfaceexercise.model.services;

import java.time.Duration;

import interfaces.nointerfaceexercise.model.entities.CarRental;

import interfaces.nointerfaceexercise.model.entities.Invoice;

public class RentalService {

    private Double pricePerHour;

    private Double pricePerDay;

    private BrazilTaxService brazilTaxService;

    public RentalService () {}

    public RentalService ( Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService ) {

        this.pricePerHour = pricePerHour;

        this.pricePerDay = pricePerDay;

        this.brazilTaxService = brazilTaxService;

    }

    public Double getPricePerHour () {

        return pricePerHour;

    }

    public Double getPricePerDay () {

        return pricePerDay;

    }

    public BrazilTaxService getBrazilTaxService () {

        return brazilTaxService;

    }

    public void processInvoice ( CarRental carRental ) {

        double minutes = Duration.between( carRental.getStart(), carRental.getFinish() ).toMinutes();

        double hours = minutes / 60.0;

        double basicPayment = 0;

        if ( hours <= 12.0 ) basicPayment = pricePerHour * Math.ceil( hours );

        if ( hours > 12.0 ) basicPayment = pricePerDay * Math.ceil( hours / 24 );

        double tax = getBrazilTaxService().tax( basicPayment );

        carRental.setInvoice( new Invoice( basicPayment, tax ) );

    }

}
