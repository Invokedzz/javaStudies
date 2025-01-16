package lambdaandmore.secondencounter.services;

import lambdaandmore.secondencounter.entities.EmployeeX;

import java.util.List;

@FunctionalInterface
public interface RandomEmployeesInterface {

    List <EmployeeX > createListWithEmployees ();

}
