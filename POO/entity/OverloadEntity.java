package POO.entity;

public class OverloadEntity {

    public static String name;

    public static double receivedValue;

    public static double totalValueObtained;

    public void constructorOverloadEntity (String name, double receivedValue, double totalValueObtained) {

        OverloadEntity.name = name;

        OverloadEntity.receivedValue = receivedValue;

        OverloadEntity.totalValueObtained = totalValueObtained;

    }

    public void overloadConstructor (String name, double totalValueObtained) {

        OverloadEntity.name = name;

        OverloadEntity.totalValueObtained = totalValueObtained;

    }

    public String toString () {

        return
                name
                + " " +  receivedValue
                + " " + totalValueObtained;

    }

    public double currentValueAccount (double totalValueObtained) {
        return totalValueObtained;
    }

    public double addedValuesTotal (double receivedValue, double totalValueObtained) {
        return receivedValue + totalValueObtained;
    }

}
