package src.baldFlakes3;

import java.util.Scanner;

public class Values {
    
    public static void main (String[] args) {

        receiveInfo(args);

    };

    public static void receiveInfo (String[] args) {

        Scanner initSc = new Scanner(System.in);

        int dayInfo;

        String day;

        System.out.println("Insert the day of the week");

        dayInfo = initSc.nextInt();

        day = switch (dayInfo) {
            case 1 -> "Dom";
            case 2 -> "Seg";
            case 3 -> "Ter";
            case 4 -> "Qua";
            case 5 -> "Qui";
            case 6 -> "Sex";
            case 7 -> "Sab";
            default -> "Invalid";
        };

        System.out.println(day);

    };

}
