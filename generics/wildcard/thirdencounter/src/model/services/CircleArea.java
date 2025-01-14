package generics.wildcard.thirdencounter.src.model.services;

import generics.wildcard.thirdencounter.src.model.entities.Circle;

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
    public Double area () {

        return circle.getRadius() * Math.PI;

    }

    @Override
    public void createListForFigure () {

        list.add( CircleArea.this );

        for ( Shape item : list ) {

            System.out.println( item );

        }

    }

    @Override
    public String toString () {

        StringBuilder stringBuilder;

        stringBuilder = new StringBuilder();

        stringBuilder.append( "Area: " ).append( area() );

        return stringBuilder.toString();

    }

}
