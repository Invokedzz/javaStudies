package generics.fourthexercise.src.model.services;

public class EmployeeSalaryPerYear implements EmployeeDifferences {

    protected final static double NORMAL_EMPLOYEE_BONUS = 0.10;

    protected final static double VIP_EMPLOYEE_BONUS = 0.20;

    @Override
    public Double changeVipEmployeeSalary ( Double amount, int months ) {

        return VIP_EMPLOYEE_BONUS * amount * months;

    }

    @Override
    public Double changeNormalEmployeeSalary ( Double amount, int months ) {

        return NORMAL_EMPLOYEE_BONUS * amount * months;

    }


}
