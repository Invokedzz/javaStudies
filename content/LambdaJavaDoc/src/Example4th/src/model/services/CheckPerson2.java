package content.LambdaJavaDoc.src.Example4th.src.model.services;

import content.LambdaJavaDoc.src.Example4th.src.model.entities.Person;

import java.util.List;

@FunctionalInterface
public interface CheckPerson2 {

    boolean test ( List < Person > p );

}
