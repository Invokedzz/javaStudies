package generics.wildcard.secondencounter.src.model.entities;

import generics.wildcard.secondencounter.src.model.services.Shape;

public class Circle implements Shape {

    private Double radius;

    public Circle () {}

    public Circle ( Double radius ) {

        this.radius = radius;

    }

    public Double getRadius () {

        return radius;

    }

    @Override
    public Double area () {

        return getRadius() * Math.PI;

    }


}
