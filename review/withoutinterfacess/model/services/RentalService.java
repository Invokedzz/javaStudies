package review.withoutinterfacess.model.services;

import review.withoutinterfacess.model.entities.Invoice;

import review.withoutinterfacess.model.entities.MotorcycleRent;

import java.time.Duration;

public class RentalService {

    private Double valuePerHour;

    private USTax usTax;

    public RentalService () {}

    public RentalService ( Double valuePerHour, USTax usTax ) {

        this.valuePerHour = valuePerHour;

        this.usTax = usTax;

    }

    public void processInvoice ( MotorcycleRent carRental ) {

        double minutes = Duration.between( carRental.getStart(), carRental.getFinish() ).toMinutes();

        double hours = valuePerHour * minutes / 60.0;

        double payment = carRental.getInvoice().getPayment() + hours;

        double tax = usTax.determineTax( payment );

        carRental.setInvoice( new Invoice ( payment, tax ) );

    }

}
