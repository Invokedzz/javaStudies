package lambdaandmore.secondencounter.application;

import lambdaandmore.secondencounter.services.Calculate;

public class Program2 {

    public static void main ( String[] args ) {

        Calculate calculate = () -> {

            double getTotal = 0;

            double [] a = { 10, 20, 30 };

            double [] b = { 40, 50, 60 };

            for ( double itemsA : a ) {

                for ( double itemsB : b ) {

                    getTotal += itemsA + itemsB;

                }

            }

            return getTotal;

        };

        Run( calculate );

    }

    private static void Run ( Calculate calculate ) {

        double getResult = calculate.calculate();

        System.out.println( getResult );

    }

}
