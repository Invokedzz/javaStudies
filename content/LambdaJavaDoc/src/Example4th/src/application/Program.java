package content.LambdaJavaDoc.src.Example4th.src.application;

import content.LambdaJavaDoc.src.Example4th.src.model.entities.Person;

import content.LambdaJavaDoc.src.Example4th.src.model.services.CheckPerson2;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main ( String[] args ) {

        testingLambda();

    }

    private static void testingLambda () {

        Person person = new Person( "Paul", 21, Person.SayGex.MALE );

        Person person2 = new Person( "Mr.Duck", 21, Person.SayGex.MALE );

        List < Person > personList = new ArrayList<>();

        personList.add( person );

        personList.add( person2 );

        CheckPerson2 check = ( list ) -> {

            for ( Person p : list ) {

                if ( p.getAge() >= 20 && p.getAge() <= 30 ) System.out.println( p );

            }

            return true;

        };

        check.test( personList );

    }

}
