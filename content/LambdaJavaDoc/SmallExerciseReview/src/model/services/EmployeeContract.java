package content.LambdaJavaDoc.SmallExerciseReview.src.model.services;

import content.LambdaJavaDoc.SmallExerciseReview.src.model.entities.EmployeeMain;

import content.LambdaJavaDoc.SmallExerciseReview.src.util.EmployeePredicate;

import java.util.List;

@FunctionalInterface
public interface EmployeeContract {

    Double filterSalary ( List <EmployeeMain > employeeList, EmployeePredicate predicate );

}
