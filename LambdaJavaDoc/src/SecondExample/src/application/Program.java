package LambdaJavaDoc.src.SecondExample.src.application;

import LambdaJavaDoc.src.SecondExample.src.model.services.CheckPersonEligibleForSelectiveService;

import LambdaJavaDoc.src.SecondExample.src.model.entities.Person;

public class Program {

    public static void main ( String[] args ) {

        checkStuff();

    }

    private static void checkStuff () {

        Person person = new Person( "Mr.Duck", 20, Person.Sex.MALE );

        Person person2 = new Person( "Mr.Pig", 28, Person.Sex.MALE );

        Person person3 = new Person( "Mr.Goose", 22, Person.Sex.MALE );

        CheckPersonEligibleForSelectiveService checkPersonEligibleForSelectiveService = new CheckPersonEligibleForSelectiveService();

        checkPersonEligibleForSelectiveService.test( person );

    }

}
