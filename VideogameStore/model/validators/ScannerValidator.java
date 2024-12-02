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

}
