package content.POO.entity;

public class DestroyPartTwo {

    public static final double PI = 3.14;

    public static String receiveFullName;

    public static double totalValue;

    public static double addValueTo;

    public DestroyPartTwo (String receiveFullName, double totalValue, double addValueTo) {

        DestroyPartTwo.receiveFullName = receiveFullName;

        DestroyPartTwo.totalValue = totalValue;

        DestroyPartTwo.addValueTo = addValueTo;

    }

    public String toString() {

        return receiveFullName
                + " " +
                totalValue;

    }

    public static double returnFinalValues (double totalValue, double addValueTo) {
        return totalValue * (addValueTo + PI);
    }


}
