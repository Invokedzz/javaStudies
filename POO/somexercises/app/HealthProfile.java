package POO.somexercises.app;

import POO.somexercises.entities.HealthProfileEntity;

import POO.somexercises.entities.HealthProfileEntityTwo;

import java.time.LocalDate;

public class HealthProfile {

    public static void main ( String[] args ) {

        mainOperation();

    }

    private static void mainOperation () {

        HealthProfileEntityTwo healthProfileEntityTwo = new HealthProfileEntityTwo("Male", LocalDate.now());

        HealthProfileEntity element = new HealthProfileEntity( "Inv", "ked", 1.8, 65,
                healthProfileEntityTwo );

        double getImcValue = element.imcCalculus();

        System.out.println(element);

        verifyResultAndImc(getImcValue);

    }

    private static void verifyResultAndImc ( double getResult ) {

        if ( getResult < 18.50 ) System.out.println( "- Underweight" );

        if ( getResult >= 18.50 && getResult < 24.90 ) System.out.println( "- Normal" );

        if ( getResult >= 25 && getResult < 29.90 ) System.out.println( "- Overweight" );

        if ( getResult >= 30.0 ) System.out.println( "- Obese" );

    }

}
