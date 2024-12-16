package heritage.ahhmorestuff.entities;

public abstract class TaxPayer {

    private String name;

    private Double income;

    public TaxPayer () {}

    public TaxPayer ( String name, Double income ) {

        this.name = name;

        this.income = income;

    }

    public Double getIncome () {

        return income;

    }

    public abstract Double tax ();

}
