package src.baldFlakes2;

import java.util.Scanner;

public class switchcase {

    public static void main (String[] args) {

        switchCase(args);

    }

    public static void switchCase (String[] args) {

        Scanner initScanner = new Scanner (System.in);

        int receivedValueByUser;

        String sendInfo;

        System.out.println("Choose a random game: (1), (2), (3), (4), (5)");

        receivedValueByUser = initScanner.nextInt();

        sendInfo = switch (receivedValueByUser) {
            case 1 -> "The Legend of Zelda";
            case 2 -> "Castlevania";
            case 3 -> "Super Mario Brothers";
            case 4 -> "Sonic the Hedgehog";
            case 5 -> "Mega Man";
            default -> "Insert a valid value";
        };

        System.out.printf("So you choose: %s", sendInfo);



    }

}
