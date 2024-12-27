package review.withoutinterfacess.application;

import review.withoutinterfacess.model.services.*;

import review.withoutinterfacess.model.entities.*;

import review.withoutinterfacess.model.enums.*;

import review.withoutinterfacess.model.exceptions.*;

import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        runProgram ( sc );

    }

    private static void runProgram ( Scanner sc ) {

        List < MotorcycleRent > motorcycleRents = new ArrayList<>();

        LocalDateTime start = startOfTheRent( sc );

        LocalDateTime finish = endOfTheRent( sc );

        Vehicle vehicle = new Vehicle( VehicleModel.KAWASAKI, VehicleColor.BLACK, 123 );

        MotorcycleRent motorcycleRent = new MotorcycleRent( start, finish, new Invoice(), vehicle );

    }

    private static LocalDateTime startOfTheRent ( Scanner sc ) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "dd/MM/yyy HH:mm" );

        return LocalDateTime.parse( sc.nextLine(), dateTimeFormatter );

    }

    private static LocalDateTime endOfTheRent ( Scanner sc ) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "dd/MM/yyy HH:mm" );

        return LocalDateTime.parse( sc.nextLine(), dateTimeFormatter );

    }

}
