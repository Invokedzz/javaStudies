package LambdaJavaDoc.SmallExerciseReview.src.util;

import LambdaJavaDoc.SmallExerciseReview.src.model.entities.EmployeeMain;

import java.util.function.Predicate;

public interface EmployeePredicate extends Predicate < EmployeeMain > {

    boolean test ( EmployeeMain employee );

}
