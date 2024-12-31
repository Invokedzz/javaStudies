package interfaces.example.model.entities;

import interfaces.example.model.services.Shape;

public abstract class AbstractShape implements Shape {

    private Color color;

    public AbstractShape () {}

    public AbstractShape ( Color color ) {

        this.color = color;

    }

    public Color getColor () {

        return color;

    }

}
