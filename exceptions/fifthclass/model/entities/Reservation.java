package exceptions.fifthclass.model.entities;

import java.sql.Time;
import java.text.SimpleDateFormat;

import java.util.concurrent.TimeUnit;

import java.util.Date;

import exceptions.fifthclass.model.exceptions.DomainException;

public class Reservation {

    private Integer roomNumber;

    private Date checkIn;

    private Date checkOut;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "dd/MM/yyyy" );

    public Reservation () {}

    public Reservation ( Integer roomNumber, Date checkIn, Date checkOut ) {

        this.roomNumber = roomNumber;

        this.checkIn = checkIn;

        this.checkOut = checkOut;

    }

    public Integer getRoomNumber () {

        return roomNumber;

    }

    public Date getCheckIn () {

        return checkIn;

    }

    public Date getCheckOut () {

        return checkOut;

    }

    public long duration () {

        long differenceBetweenTheElements = checkOut.getTime() - checkIn.getTime();

        return TimeUnit.DAYS.convert( differenceBetweenTheElements, TimeUnit.MILLISECONDS );

    }

    public void updateDates ( Date checkIn, Date checkOut ) {

        this.checkIn = checkIn;

        this.checkOut = checkOut;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Reservation: Room " ).append( getRoomNumber() )
                .append( "," ).append( " check-in: " ).append( simpleDateFormat.format( getCheckIn() ) )
                .append( "," ).append( " check-out: " ).append( simpleDateFormat.format( getCheckOut() ) )
                .append( ", " ).append( duration() ).append( " nights " );

        return sb.toString();

    }

}
