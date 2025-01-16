package lambdaandmore.secondencounter.application;

import lambdaandmore.secondencounter.services.RandomInterface;

public class Program {

    public static void main ( String[] args ) {

        RandomInterface randomInterface = () -> System.out.println("Hello!");

        System.out.println( randomInterface ); // lambdaandmore.secondencounter.application.Program$$Lambda/0x00000006010033e8@452b3a41

        doYourThing( randomInterface ); // "Hello!"

    }

    private static void doYourThing ( RandomInterface randomInterface ) {

        randomInterface.print();

    }

}
