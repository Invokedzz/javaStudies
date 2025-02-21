package content.heritage.morerandomstuff.entities;

import content.heritage.morerandomstuff.entities.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape () {}

    public Shape ( Color color ) {

        this.color = color;

    }

    public Color getColor () {

        return color;

    }

    public abstract double area ();

}
