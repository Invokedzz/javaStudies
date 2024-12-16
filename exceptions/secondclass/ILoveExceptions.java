package exceptions.secondclass;

public class ILoveExceptions {

    public static void main ( String[] args ) {

        // Error: ArrayIndexOutOfBoundsException
        // That's what we received - this is called an Exception
        // So, how we can solve this problem?
        // Let's create a Try/Catch in order to handle this Exception!

        int [] randomNumbersInOrderToShowcase;

        try {

            randomNumbersInOrderToShowcase = new int [] { 10, 20, 30, 50};

            System.out.println( randomNumbersInOrderToShowcase [ 5 ] );

        } catch ( ArrayIndexOutOfBoundsException error ) {

            randomNumbersInOrderToShowcase = new int [] { 10, 20, 30, 50 };

            System.out.println( randomNumbersInOrderToShowcase [ 1 ] );

        }

        // There you go! The Try/Catch ended up solving the problem!

    }

}
