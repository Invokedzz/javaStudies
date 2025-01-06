package interfaces.example.shape.services;

import interfaces.example.shape.entities.Circle;

public class CircleArea implements Shape {

    private Circle circle;

    public CircleArea () {}

    public CircleArea ( Circle circle ) {

        this.circle = circle;

    }

    public Circle getCircle () {

        return circle;

    }

    @Override
    public double calculateArea () {

        return getCircle().getRadius() * PI;

    }


}
