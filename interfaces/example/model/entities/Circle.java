package interfaces.example.model.entities;

public class Circle extends AbstractShape {

    private static final Double PI = 3.14;

    private Double radius;

    public Circle () {

        super ();

    }

    public Circle ( Color color, Double radius ) {

        super ( color );

        this.radius = radius;

    }

    public Double getRadius () {

        return radius;

    }

    @Override
    public Double area () {

        return Math.pow ( radius, 2 ) * PI;

    }

}
