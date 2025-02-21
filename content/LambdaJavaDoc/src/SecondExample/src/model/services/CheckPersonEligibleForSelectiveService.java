package content.LambdaJavaDoc.src.SecondExample.src.model.services;

import content.LambdaJavaDoc.src.SecondExample.src.model.entities.Person;

import java.util.ArrayList;

import java.util.List;

public class CheckPersonEligibleForSelectiveService implements CheckPerson {

    @Override
    public boolean test ( Person p ) {

        List < Person > personList = new ArrayList<>();

        boolean isTrue =  p.getAge() >= 20
                && p.getAge() <= 30
                && p.getSex() == Person.Sex.MALE;

        if ( isTrue ) {

            personList.add( p );

            for ( Person randomPerson : personList ) {

                System.out.println( randomPerson );

            }


        }

        return false;

    }

}
