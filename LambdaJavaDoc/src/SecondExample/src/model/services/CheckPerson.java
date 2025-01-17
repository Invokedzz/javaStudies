package LambdaJavaDoc.src.SecondExample.src.model.services;

import LambdaJavaDoc.src.SecondExample.src.model.entities.Person;

@FunctionalInterface
public interface CheckPerson {

    boolean test ( Person p );

}
