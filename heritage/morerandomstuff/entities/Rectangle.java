package heritage.morerandomstuff.entities;

import heritage.morerandomstuff.entities.enums.Color;

public class Rectangle extends Shape {

    private double width;

    private double height;

    public Rectangle () {

        super();

    }

    public Rectangle ( double width, double height, Color color ) {

        super ( color );

        this.width = width;

        this.height = height;

    }

    public double getWidth () {

        return width;

    }

    public double getHeight () {

        return height;

    }

    @Override
    public double area () {

        return width * height;

    }

}
