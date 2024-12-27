package review.withoutinterfacess.model.entities;

import review.withoutinterfacess.model.enums.*;

public class Vehicle {

    private VehicleModel model;

    private VehicleColor color;

    private Integer id;

    public Vehicle () {}

    public Vehicle ( VehicleModel model, VehicleColor color, Integer id ) {

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

    public Integer getId () {

        return id;

    }

}
