package Stream.second.util;

import Stream.second.model.entities.EmployeeStream;

import java.util.function.Predicate;

public interface EmployeePredicate extends Predicate <EmployeeStream> {

    @Override
    boolean test ( EmployeeStream emp );

}
