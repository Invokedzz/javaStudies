package review.withoutinterfacess.model.entities;

import review.withoutinterfacess.model.enums.*;

import review.withoutinterfacess.model.exceptions.InvalidVehicleModelException;

import review.withoutinterfacess.model.exceptions.InvalidVehicleColorException;

public class Vehicle {

    private VehicleModel model;

    private VehicleColor color;

    private String id;

    public Vehicle () {}

    public Vehicle ( VehicleModel model, VehicleColor color, String id ) {

        this.model = model;

        this.color = color;

        this.id = id;

    }

    public VehicleModel getModel () {

        return model;

    }

    public VehicleColor getColor () {

        return color;

    }

    public String getId () {

        return id;

    }

    public void validateVehicleModel ( VehicleModel vehicleModel ) {

        if ( !getModel().equals( vehicleModel ) ) throw new InvalidVehicleModelException( "Invalid vehicle model. Try again!" );

    }

    public void validateVehicleColor ( VehicleColor vehicleColor ) {

        if ( !getColor().equals( vehicleColor ) ) throw new InvalidVehicleColorException( "Invalid color for vehicle. Try again!" );

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Model: " ).append( getModel() )
                .append( ", Color: " ).append( getColor() )
                .append( ", Id: " ).append( getId() );

        return sb.toString();

    }

}
