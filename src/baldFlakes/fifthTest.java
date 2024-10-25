// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

package src.baldFlakes;

import java.util.Scanner;

import java.util.Locale;

public class fifthTest {

    public static void main (String[] args) {

        fTestFinal(args);

    }

    public static void fTestFinal (String[] args) {

        Scanner friendlyScanner = new Scanner (System.in);

        Locale.setDefault(Locale.CHINESE);

        double p1Code, p1Number, p1Value, receiveValues;

        double p2Code, p2Number, p2Value;

        System.out.println("Insert the values for p1: (code, number, value)\n");

        p1Code = friendlyScanner.nextDouble();

        p1Number = friendlyScanner.nextDouble();

        p1Value = friendlyScanner.nextDouble();

        System.out.printf("Okay. We received %s for code, %s for number and $%s for value\n",
                p1Code, p1Number, p1Value);

        System.out.println("Now, insert the values for p2: (code, number, value)\n");

        p2Code = friendlyScanner.nextDouble();

        p2Number = friendlyScanner.nextDouble();

        p2Value = friendlyScanner.nextDouble();

        System.out.printf("Okay. We received %s for code, %s for number and $%s for value\n",
                p2Code, p2Number, p2Value);

        receiveValues = p1Value + p2Value;

        System.out.printf("That's the total: $%s", receiveValues);

        friendlyScanner.close();

    }

}
