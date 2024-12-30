package review.withoutinterfacess.model.services;

import review.withoutinterfacess.model.entities.Invoice;

import review.withoutinterfacess.model.entities.MotorcycleRent;

import java.time.Duration;

public class RentalService {

    private Double valuePerHour;

    private TaxService taxService;

    public RentalService () {}

    public RentalService ( Double valuePerHour, TaxService taxService) {

        this.valuePerHour = valuePerHour;

        this.taxService = taxService;

    }

    public void processInvoice ( MotorcycleRent carRental ) {

        double minutes = Duration.between( carRental.getStart(), carRental.getFinish() ).toMinutes();

        double hours = valuePerHour * minutes / 60.0;

        double payment = carRental.getInvoice().getPayment() + hours;

        double tax = taxService.determineTax( payment );

        carRental.setInvoice( new Invoice ( payment, tax ) );

    }

}
