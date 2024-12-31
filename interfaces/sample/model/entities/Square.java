package interfaces.sample.model.entities;

import interfaces.sample.model.services.Shape;

public class Square implements Shape {

    private Double height;

    private Double width;

    public Square () {}

    public Square ( Double height, Double width ) {

        this.height = height;

        this.width = width;

    }

    public Double getHeight () {

        return height;

    }

    public Double getWidth () {

        return width;

    }

    @Override
    public Double area () {

        return getHeight() * getWidth();

    }

}
