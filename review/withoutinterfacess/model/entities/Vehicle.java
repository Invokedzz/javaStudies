package review.withoutinterfacess.model.entities;

import review.withoutinterfacess.model.enums.*;

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

}
