package review.withoutinterfacess.model.entities;

import review.withoutinterfacess.model.exceptions.InvalidDatePeriodException;

import java.time.LocalDateTime;

public class MotorcycleRent {

    private LocalDateTime start;

    private LocalDateTime finish;

    private Invoice invoice;

    private Vehicle vehicle;

    public MotorcycleRent () {}

    public MotorcycleRent ( LocalDateTime start, LocalDateTime finish, Invoice invoice, Vehicle vehicle ) {

        this.start = start;

        this.finish = finish;

        this.invoice = invoice;

        this.vehicle = vehicle;

    }

    public LocalDateTime getStart () {

        return start;

    }

    public LocalDateTime getFinish () {

        return finish;

    }

    public void setFinish ( LocalDateTime finish ) {

        this.finish = finish;

    }

    public Invoice getInvoice () {

        return invoice;

    }

    public void setInvoice ( Invoice invoice ) {

        this.invoice = invoice;

    }

    public Vehicle getVehicle () {

        return vehicle;

    }

    public void validateDates () {

        if ( getStart().isAfter( getFinish() ) ) throw new InvalidDatePeriodException( "Invalid dates, try again!" );

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Start: " ).append( getStart() )
                .append( ", Finish: " ).append( getFinish() )
                .append( ", Vehicle: " ).append( getVehicle() );

        return sb.toString();

    }

}
