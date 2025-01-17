package LambdaJavaDoc.src.SecondExample.src.application;

import LambdaJavaDoc.src.SecondExample.src.model.services.CheckPersonEligibleForSelectiveService;

import LambdaJavaDoc.src.SecondExample.src.model.entities.Person;

public class Program {

    public static void main ( String[] args ) {

        checkStuff();

    }

    private static void checkStuff () {

        Person person = new Person( "Mr.Duck", 20, Person.Sex.MALE );

        CheckPersonEligibleForSelectiveService checkPersonEligibleForSelectiveService = new CheckPersonEligibleForSelectiveService();

        System.out.println( checkPersonEligibleForSelectiveService.test( person ) );

    }

}
