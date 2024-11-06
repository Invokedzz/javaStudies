package POO.entity;

public class IfElseOverload {

    public static boolean validationForElements (String name, double receivedValue, double totalValueObtained) {

        if (name.length() < 3) {

            System.out.println("Invalid name");
            return false;

        }

        else if (receivedValue < 0 || totalValueObtained < 0) {

            System.out.println("Invalid");
            return false;
        }

        else System.out.println("Success");
        return true;

    }

}
