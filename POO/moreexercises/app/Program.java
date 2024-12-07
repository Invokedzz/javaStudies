package POO.moreexercises.app;

import POO.moreexercises.entities.HeartRatesBirth;

import POO.moreexercises.entities.HeartRates;

public class Program {

    public static void main ( String[] args ) {

        mainOperation ();

    }

    private static void mainOperation () {

        HeartRatesBirth ratesBirth = new HeartRatesBirth( 2002, 10, 15 );

        HeartRates heartRates = new HeartRates( "John", "Oz", ratesBirth );

        int age = ratesBirth.getUserAge();

        int fc = ratesBirth.fcMaxCalculus();

        System.out.printf( "%s, %s and %s", age, fc, heartRates );

    }

}
