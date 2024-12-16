package heritage.morerandomstuff.entities;

import heritage.morerandomstuff.entities.enums.Color;

public class Circle extends Shape {

    private double radius;

    public Circle () {

        super();

    }

    public Circle ( double radius, Color color ) {

        super ( color );

        this.radius = radius;

    }

    @Override
    public double area () {

        return Math.PI * Math.pow( radius, 2 );

    }

}
