package Challenge.Challenge13th.src;

public class ThinkingAboutTheExercise {

    public static void main ( String[] args ) {

        // expects 13 as a return;

        System.out.println( scoreOfString( "hello" ) );

    }

    public static int scoreOfString ( String s ) {

        int values = 0;

        /*for ( int index = 0; index < s.length(); index ++ ) {

            System.out.println( s.charAt(index) );

        } prints "hello" */

        /*for ( int index = 0; index < s.length(); index ++ ) {

            values += Math.abs( s.charAt( index ) - s.charAt( index + 1 ));

        } throws an exception (StringIndexOutOfBoundsException) */

        for ( int index = 0; index < s.length() - 1; index ++ ) {

            values += Math.abs( s.charAt( index ) - s.charAt( index + 1 ));

        } // returns 13

        /*for ( int index = 0; index < s.length() - 1; index ++ ) {

            values += s.charAt( index ) - s.charAt( index + 1 );

        }  returns - 7. Math.abs() considers positive results only */

        return values;

    }

}
