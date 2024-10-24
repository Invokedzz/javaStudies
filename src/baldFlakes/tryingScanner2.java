package src.baldFlakes;

import java.util.Objects;
import java.util.Scanner;

public class tryingScanner2 {

    public static void main (String[] args) {

        stringsMethod(args);

    };

    public static void stringsMethod (String[] args) {

        Scanner letsGo = new Scanner(System.in);

        String firstCommand = letsGo.nextLine();

        String secondCommand = letsGo.nextLine();

        if (Objects.equals(firstCommand, secondCommand)) return;

        System.out.println("We received the following values: ");

        System.out.println(firstCommand);

        System.out.println(secondCommand);

    }

}
