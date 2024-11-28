package localstore.validators;

import java.util.Scanner;

public class ScannerValidator {

    private static boolean verifyIntExistence (Scanner init) {

        return init.hasNextInt();

    }

    private static int loopUntilReturnInt (Scanner init) {

        while (!verifyIntExistence(init)) {

            System.out.println("Enter a valid number! ");

            init.next();

        }

        return init.nextInt();

    }

    public static int intValidation (Scanner init) {

        return loopUntilReturnInt(init);

    }

}
