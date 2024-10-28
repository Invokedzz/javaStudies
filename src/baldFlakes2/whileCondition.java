package src.baldFlakes2;

import java.util.Scanner;

public class whileCondition {

    public static void main (String[] args) {

        Scanner init = new Scanner (System.in);

        double loopCondition;

        loopCondition = init.nextDouble();

        while (loopCondition > 0) {

            double value = init.nextDouble();

            double receiveValues = 0.0;

            receiveValues = loopCondition += value;

            System.out.println(receiveValues);

        }

    }

}
