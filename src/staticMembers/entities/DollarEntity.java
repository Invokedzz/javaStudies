package src.staticMembers.entities;

public class DollarEntity {

    public static double dollarCurrentValue;

    public static double productBoughtByUser;

    public static double receiveBothValues;

    public static void returnValues (double dollarCurrentValue, double productBoughtByUser) {
        receiveBothValues = dollarCurrentValue * productBoughtByUser;
    }

    public static double taxesUponTheValue () {
        receiveBothValues += receiveBothValues * 0.06;
        return receiveBothValues;
    }

}
