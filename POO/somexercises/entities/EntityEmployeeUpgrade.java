package POO.somexercises.entities;

import java.util.List;

import java.util.ArrayList;

public class EntityEmployeeUpgrade {

    private final String name;

    private final String lastName;

    private double currentSalary;

    public EntityEmployeeUpgrade ( String name, String lastName, double currentSalary ) {

        this.name = name;

        this.lastName = lastName;

        this.currentSalary = currentSalary;

    }

    List < EntityEmployeeUpgrade > employeeUpgrades = new ArrayList<>();

    public void setCurrentSalary (double currentSalary) {

        if (currentSalary > 0) {

            this.currentSalary = currentSalary;

            return;

        }

        System.out.println("Lower than zero, shall not be configured! You shall not pass!");

    }

    public String changeCurrentSalary () {

        double salaryPerYear = currentSalary * 12;

        double newSalary = currentSalary * 0.10 + currentSalary;

        return "New Salary: " + newSalary + " Old salary per year: " + salaryPerYear;

    }

    public void addEmployees (EntityEmployeeUpgrade employeeUpgrade) {

        employeeUpgrades.add(employeeUpgrade);

    }

    public void removeEmployees (EntityEmployeeUpgrade employeeUpgrade) {

        employeeUpgrades.add(employeeUpgrade);

    }

    @Override
    public String toString () {

        StringBuilder sb;
        sb = new StringBuilder();

        if (!employeeUpgrades.isEmpty()) {

            sb.append("Employees: ")
                    .append(employeeUpgrades);

        }

        return sb.toString();

    }

}
