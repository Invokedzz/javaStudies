package LambdaJavaDoc.src.SecondExample.src.model.services;

import LambdaJavaDoc.src.SecondExample.src.model.entities.Person;

public class CheckPersonEligibleForSelectiveService implements CheckPerson {

    @Override
    public boolean test ( Person p ) {

        return p.getAge() >= 20
                && p.getAge() <= 30
                && p.getSex() == Person.Sex.MALE;

    }

}
