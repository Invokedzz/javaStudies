package exceptions.fifthclass.model.entities;

import java.text.SimpleDateFormat;

import java.util.concurrent.TimeUnit;

import java.time.LocalDate;

import exceptions.fifthclass.model.exceptions.DomainException;

public class Reservation {

    private Integer roomNumber;

    private LocalDate checkIn;

    private LocalDate checkOut;

    public Reservation () {}

    public Reservation ( Integer roomNumber, LocalDate checkIn, LocalDate checkOut ) {

        this.roomNumber = roomNumber;

        this.checkIn = checkIn;

        this.checkOut = checkOut;

    }

    public Integer getRoomNumber () {

        return roomNumber;

    }

    public LocalDate getCheckIn () {

        return checkIn;

    }

    public LocalDate getCheckOut () {

        return checkOut;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Reservation: Room " ).append( getRoomNumber() )
                .append( "," ).append( " check-in: " ).append( getCheckIn() )
                .append( "," ).append( " check-out: " ).append( getCheckOut() );

        return sb.toString();

    }

}
