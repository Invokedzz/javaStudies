package interfaces.interfacesdefault.model.entities;

import interfaces.interfacesdefault.model.services.Shape;

public class Rectangle implements Shape {

    private double height;

    private double width;

    public Rectangle () {}

    public Rectangle ( double height, double width ) {

        this.height = height;

        this.width = width;

    }

    public double getHeight () {

        return height;

    }

    public double getWidth () {

        return width;

    }

}
