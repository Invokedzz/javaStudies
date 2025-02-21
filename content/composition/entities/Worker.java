package content.composition.entities;

import java.time.LocalDate;

import java.util.List;

import java.util.ArrayList;

import content.composition.entities.enums.WorkerLevel;

public class Worker {

    private String name;

    private WorkerLevel level;

    private Double baseSalary;

    private Department department;

    public Worker (String name, WorkerLevel level, Double baseSalary, Department department) {

        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;

    }

    public String getName () {
        return name;
    }

    public WorkerLevel getLevel () {
        return level;
    }

    public Double getBaseSalary () {
        return baseSalary;
    }

    public Department getDepartment () {
        return department;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setLevel (WorkerLevel level) {
        this.level = level;
    }

    public void setBaseSalary (Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDepartment (Department department) {
        this.department = department;
    }

    List <HourContract> contracts = new ArrayList<>();

    public void addContract (HourContract contract) {

        System.out.println(contracts.add(contract));

    }

    public void removeContract (HourContract contract) {

        contracts.remove(contract);

    }

    public double income (int month, int year) {

        double sum = baseSalary;

        for (HourContract contract: contracts) {

            int contractYear = LocalDate.now().getYear();

            int contractMonth = LocalDate.now().getMonthValue();

            if (year == contractYear && month == contractMonth) sum += contract.getValuePerHour();

        }

        return sum;

    }

    @Override
    public String toString () {

        return name +
                " " + level + " "
                + baseSalary + " "
                + department;

    }

}
