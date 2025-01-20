package LambdaJavaDoc.SmallExerciseReview.src.model.services;

import LambdaJavaDoc.SmallExerciseReview.src.model.entities.EmployeeMain;

import LambdaJavaDoc.SmallExerciseReview.src.util.EmployeePredicate;

import java.util.List;

@FunctionalInterface
public interface EmployeeContract {

    Double filterSalary ( List <EmployeeMain > employeeList, EmployeePredicate predicate );

}
