package interfaces.interfacesdefault.model.entities;

import interfaces.interfacesdefault.model.services.Shape;

public class Circle implements Shape {

    private static final double PI = 3.14;

    private double radius;

    public Circle () {}

    public Circle ( double radius ) {

        this.radius = radius;

    }

    public double getRadius () {

        return radius;

    }

    @Override
    public double area( double radius, double area ) {

        return radius * PI * area;

    }

}
