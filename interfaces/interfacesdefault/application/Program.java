package interfaces.interfacesdefault.application;

import interfaces.interfacesdefault.model.entities.*;

public class Program {

    public static void main ( String[] args ) {

        Rectangle shape = new Rectangle( 10.0, 20.0 );

        double value1 = shape.area( shape.getHeight(), shape.getWidth() );

        Circle circleShape = new Circle( 10.0 );

        double value2 = circleShape.area(circleShape.getRadius(), circleShape.getRadius() );

        System.out.printf( "%s\n%s", value1, value2 );

    }

}
