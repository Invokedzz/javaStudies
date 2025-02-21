package content.heritage.ahhmorestuff.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual () {

        super ();

    }

    public Individual ( String name, Double income, Double healthExpenditures ) {

        super ( name, income );

        this.healthExpenditures = healthExpenditures;

    }

    public Double getHealthExpenditures () {

        return healthExpenditures;

    }

    @Override
    public Double tax () {

        if ( getIncome() < 20.000) return getIncome() * 0.15 - getHealthExpenditures() * 0.50;

        return getIncome() * 0.25 - getHealthExpenditures() * 0.50;

    }



}
