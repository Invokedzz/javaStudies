package src.baldFlakes2.tests;

import java.util.Scanner;

public class passwordTest {

    public static void main (String[] args) {

        // A senha correta deve ser 2002. Caso contrario, continua o loop

        Scanner initSc = new Scanner (System.in);

        int passwordValue;

        passwordValue = initSc.nextInt();

        if (passwordValue != 2002) {

            while (passwordValue != 2002) {

                System.out.println("Insert the correct password!");

                passwordValue = initSc.nextInt();

                if (passwordValue == 2002) System.out.println("Yeah");

            }

        }


    }

}
