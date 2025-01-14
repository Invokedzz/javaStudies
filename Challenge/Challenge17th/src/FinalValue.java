package Challenge.Challenge17th.src;

public class FinalValue {

    /*There is a programming language with only four operations and one variable X:

            ++X and X++ increments the value of the variable X by 1.
            --X and X-- decrements the value of the variable X by 1.
    Initially, the value of X is 0.

    Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.*/

    public static void main ( String[] args ) {

        String [] operations = {"X++", "X++"};

        System.out.println(finalValueAfterOperations( operations ));

    }

    private static int finalValueAfterOperations(String[] operations) {

        int storeValues = 0;

        for ( int index = 0; index < operations.length; index++ ) {

            if (operations[index].charAt(1) == '+') storeValues += 1;

            else storeValues -= 1;

        }

        return storeValues;

    }

}
