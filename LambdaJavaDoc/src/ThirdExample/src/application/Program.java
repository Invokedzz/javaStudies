package LambdaJavaDoc.src.ThirdExample.src.application;

import LambdaJavaDoc.src.ThirdExample.src.services.PrintSomeStuff;

public class Program {

    public static void main ( String[] args ) {

        run();

    }

    private static void run () {

        String randomName = "Jean";

        PrintSomeStuff printSomeStuff = (name) -> System.out.println("Hello World, " + name + "!");

        printSomeStuff.printMessage(randomName);

    }

}
