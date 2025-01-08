package generics.fourthexercise.src.model.services;

public interface EmployeeDifferences {

    double NORMAL_EMPLOYEE_BONUS = 0.10;

    double VIP_EMPLOYEE_BONUS = 0.20;

    Double changeVipEmployeeSalary ( Double amount, int months );

    Double changeNormalEmployeeSalary ( Double amount, int months );

}
