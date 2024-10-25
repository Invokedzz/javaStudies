// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

package src.baldFlakes;

import java.util.Scanner;

public class fourthTest {

    public static void main (String[] args) {

        fTest(args);

    }

    public static void fTest (String[] args) {

        Scanner sc = new Scanner(System.in);

        double hours, id, salary, salaryHour;

        System.out.println("Insert the following values: (hours, id, salary, salary p/ hour)\n");

        hours = sc.nextDouble();

        id = sc.nextDouble();

        salary = sc.nextDouble();

        salaryHour = sc.nextDouble();

        System.out.printf("Okay, so this worker have: %s hours, id: %s, a salary of: R$%s and a receives R$%s p/h",
                hours, id, salary, salaryHour);

    }

}
