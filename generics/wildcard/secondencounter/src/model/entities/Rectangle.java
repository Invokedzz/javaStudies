package generics.wildcard.secondencounter.src.model.entities;

import generics.wildcard.secondencounter.src.model.services.Shape;

public class Rectangle implements Shape {

    private Double width;

    private Double height;

    public Rectangle () {}

    public Rectangle ( Double width, Double height ) {

        this.width = width;

        this.height = height;

    }

    public Double getWidth () {

        return width;

    }

    public Double getHeight () {

        return height;

    }

    @Override
    public Double area () {

        return getHeight() * getWidth();

    }

}
