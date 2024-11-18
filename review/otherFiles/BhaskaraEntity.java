package review.otherFiles;

public class BhaskaraEntity {

    private Double valueA;

    private Double valueB;

    private Double valueC;

    private Double deltaValue;

    private Double bhaskaraTotalOne;

    private Double bhaskaraTotalTwo;

    // public BhaskaraEntity () {};

    public BhaskaraEntity (Double deltaValue, Double bhaskaraTotalOne, Double bhaskaraTotalTwo) {

        this.deltaValue = deltaValue;

        this.bhaskaraTotalOne = bhaskaraTotalOne;

        this.bhaskaraTotalTwo = bhaskaraTotalTwo;

    }

    public String toString () {

        return deltaValue
                + " " + bhaskaraTotalOne +
                " " + bhaskaraTotalTwo;

    }

    public double deltaCalculus (double valueA, double valueB, double valueC) {

        deltaValue = Math.pow(valueB, 2) - 4 * valueA * valueC;

        return deltaValue;

    }

    public double bhaskaraFirstValueCalculus (double valueA, double valueB) {

        bhaskaraTotalOne = (-valueB + Math.sqrt(deltaValue)) / valueA * 2.00;

        return bhaskaraTotalOne;

    }

    public double bhaskaraSecondValueCalculus (double valueA, double valueB) {

        bhaskaraTotalTwo = (-valueB - Math.sqrt(deltaValue)) / 2.00 * valueA;

        return bhaskaraTotalTwo;

    }

    public Double getValueA () {
        return valueA;
    }

    public Double getValueB () {
        return valueB;
    }

    public Double getValueC () {
        return valueC;
    }

}
