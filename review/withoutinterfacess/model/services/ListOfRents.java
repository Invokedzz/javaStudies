package review.withoutinterfacess.model.services;

import review.withoutinterfacess.model.entities.MotorcycleRent;

import java.util.ArrayList;

import java.util.List;

public class ListOfRents {

    List < MotorcycleRent > motorcycleRentList = new ArrayList<>();

    public void addElement ( MotorcycleRent motorcycleRent ) {

        motorcycleRentList.add( motorcycleRent );

    }

    public void removeElement ( MotorcycleRent motorcycleRent ) {

        motorcycleRentList.remove( motorcycleRent );

    }
    
}
