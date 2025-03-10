package content.POO.exerciseAccount.entities;

public class OutsourcedEmployee extends Employee {

    // additionalCharge: double

    private Double additionalCharge;

    public OutsourcedEmployee () {

        super();

    }

    public OutsourcedEmployee ( String name, Integer hours, Double valuePerHour, Double additionalCharge ) {

        super ( name, hours, valuePerHour);

        this.additionalCharge = additionalCharge;

    }

    @Override
    public double payment () {

        return ( super.payment() + additionalCharge ) * 1.1;

    }

}
