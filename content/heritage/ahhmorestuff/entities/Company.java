package content.heritage.ahhmorestuff.entities;

public class Company extends TaxPayer {

    private int numberOfEmployees;

    public Company () {

        super();

    }

    public Company ( String name, Double income, int numberOfEmployees ) {

        super ( name, income );

        this.numberOfEmployees = numberOfEmployees;

    }

    public int getNumberOfEmployees () {

        return numberOfEmployees;

    }

    @Override
    public Double tax () {

        if ( numberOfEmployees > 10 ) return getIncome() * 0.14;

        return getIncome() * 0.16;

    }

}
