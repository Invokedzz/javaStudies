package practice.model.entities;

public final class BasicAbstractEmployee extends AbstractEmployee {

    public BasicAbstractEmployee () {

        super ();

    }

    public BasicAbstractEmployee ( String name, String id, Double salary ) {

        super ( name, id, salary );

    }

    @Override
    public Double taxOverSalary () {

        double taxAmount = getSalary() * 0.40;

        return getSalary() - taxAmount;

    }

    @Override
    public Double actualSalary () {

        return taxOverSalary();

    }

}
