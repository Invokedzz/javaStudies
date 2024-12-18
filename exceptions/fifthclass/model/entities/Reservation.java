package exceptions.fifthclass.model.entities;

import java.text.SimpleDateFormat;

import java.util.concurrent.TimeUnit;

import java.util.Date;

import exceptions.fifthclass.model.exceptions.InvalidDatePeriod;

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

    public void updateDates ( Date checkIn, Date checkOut ) throws InvalidDatePeriod {

       Date now = new Date();

       if ( checkIn.before ( now ) || checkOut.before ( now ) ) throw new InvalidDatePeriod( "Check-in/Check-out must be future dates" );

       if ( checkIn.after ( checkOut ) ) throw new InvalidDatePeriod( "Enter a valid check-in/check-out" );

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
