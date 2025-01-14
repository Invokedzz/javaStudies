package interfaces.nointerfaceextwo.model.entities;

import java.time.LocalDateTime;

public class CarRental {

    private LocalDateTime start;

    private LocalDateTime finish;

    private Invoice invoice;

    private Vehicle vehicle;

    public CarRental () {}

    public CarRental ( LocalDateTime start, LocalDateTime finish, Invoice invoice, Vehicle vehicle ) {

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

    public Vehicle getVehicle () {

        return vehicle;

    }

    public Invoice getInvoice () {

        return invoice;

    }

    public void setInvoice ( Invoice invoice ) {

        this.invoice = invoice;

    }

}
