package practice.model.entities;

public final class EliteAbstractEmployee extends AbstractEmployee {

    private Double bonus;

    public EliteAbstractEmployee () {

        super ();

    }

    public EliteAbstractEmployee ( String name, String id, Double salary, Double bonus ) {

        super ( name, id, salary );

        this.bonus = bonus;

    }

    public Double getBonus () {

        return bonus;

    }

    @Override
    public Double taxOverSalary () {

        double taxAmount = getSalary() * 0.30;

        return getSalary() - taxAmount;

    }

    @Override
    public Double actualSalary() {

        return taxOverSalary() + getBonus();

    }

}
