package VideogameStore.model.validators;

import java.util.Scanner;

public class ScannerValidator {

    public static String verifyPassword (Scanner init) {

        String password = init.next().toUpperCase();

        while (password.matches("[0-9]+")) {

            System.out.println("Enter a valid password!");

            password = init.next().toUpperCase();

        }

        return password;

    }

    private static boolean validateDoubleInput (Scanner init) {
        return init.hasNextDouble();
    }

    public static double returnDoubleValue (Scanner init) {

        while (!validateDoubleInput(init)) {

            System.out.println("Enter a valid number!");

            init.next();

        }

        return init.nextDouble();

    }

    private static boolean validateIntegerInput (Scanner init) {
        return init.hasNextInt();
    }

    public static int returnIntegerInput (Scanner init) {

        while (!validateIntegerInput(init)) {

            System.out.println("Enter a valid number!");

            init.next();

        }

        return init.nextInt();

    }

}
