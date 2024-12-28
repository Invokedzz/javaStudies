package review.withoutinterfacess.model.services;

import review.withoutinterfacess.model.entities.MotorcycleRent;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class ListOfRents {

    Scanner sc = new Scanner ( System.in );

    List < MotorcycleRent > motorcycleRentList = new ArrayList<>();

    public void addElement ( MotorcycleRent motorcycleRent, String id ) {

        while ( findId ( motorcycleRentList, id ) ) {

            System.out.println( "This id already exists, try again!" );

            id = sc.next();

        }

        motorcycleRentList.add( motorcycleRent );

        System.out.println( motorcycleRentList );

    }

    public void removeElement ( MotorcycleRent motorcycleRent ) {

        motorcycleRentList.remove( motorcycleRent );

    }

    private boolean findId ( List < MotorcycleRent > motorcycleRentList, String id ) {

       MotorcycleRent rent = motorcycleRentList.stream()
               .filter( elements -> elements.getVehicle().getId().equals( id ) )
                .findFirst().orElse( null );

       return rent != null;

    }

}
