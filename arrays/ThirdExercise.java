package arrays;

import java.util.Scanner;

import java.util.Locale;

public class ThirdExercise {

    public static void main (String[] args) {

        Locale.setDefault(Locale.KOREA);

        receiveAllElements();

    }

    public static void receiveAllElements () {

        Scanner initSc = new Scanner (System.in);

        int receivedNumber = initSc.nextInt();

        int [] vectorA = new int[receivedNumber];

        int [] vectorB = new int[receivedNumber];

        int [] vectorC = new int [receivedNumber];

        System.out.println("Enter A value: ");

        for (int y = 0; y < receivedNumber; y ++) {
            vectorA [y] = initSc.nextInt();
        }

        System.out.println("Enter B value: ");

        for (int x = 0; x < receivedNumber; x ++) {
            vectorB [x] = initSc.nextInt();
        }

        for (int qp = 0; qp < receivedNumber; qp++) {
            vectorC[qp] = vectorA[qp] + vectorB[qp];
            System.out.println(vectorC[qp]);
        }

    }

}
