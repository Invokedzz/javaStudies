package interfaces.sample.model.entities;

public class Circle extends Square {

    private Double radius;

    private static final Double PI = 3.14;

    public Circle () {

        super ();

    }

    public Circle ( Double radius ) {

        super ();

        this.radius = radius;

    }

    public Double getRadius () {

        return radius;

    }

    @Override
    public Double area () {

        return Math.pow ( getRadius(), 2 ) * PI;

    }

}
