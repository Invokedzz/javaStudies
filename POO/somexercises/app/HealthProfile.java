package POO.somexercises.app;

import POO.somexercises.entities.HealthProfileEntity;

import POO.somexercises.entities.HealthProfileEntityTwo;

import java.time.LocalDate;

public class HealthProfile {

    public static void main ( String[] args ) {

        HealthProfileEntityTwo healthProfileEntityTwo = new HealthProfileEntityTwo("Male", LocalDate.now());

        HealthProfileEntity element = new HealthProfileEntity( "Inv", "ked", 1.8, 65,
                healthProfileEntityTwo );

        double getImcValue = element.imcCalculus();

        System.out.println(element);

        System.out.println(getImcValue);

    }

}
