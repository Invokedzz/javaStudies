package Stream.second.model.services;

import Stream.second.model.entities.EmployeeStream;

import Stream.second.util.EmployeePredicate;

import java.util.List;

public interface EmployeeContract {

    void filter ( List <EmployeeStream> emp, EmployeePredicate employeePredicate );

}
