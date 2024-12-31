package interfaces.sample.application;

import interfaces.sample.model.services.Shape;

import interfaces.sample.model.entities.*;

public class Program {

    public static void main ( String[] args ) {

        Square square = new Square( 10.0, 10.0 );

        Rectangle rectangle = new Rectangle( 10.0, 20.0 );

        Circle circle = new Circle( 5.0 );

        System.out.printf( "Area of a Rectangle: %s\n", rectangle.area() );

        System.out.printf( "Area of a Square: %s\n", square.area() );

        System.out.printf( "Area of a Circle: %s", circle.area() );

    }

}
