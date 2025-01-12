package Challenge.Challenge13th.src;

public class ASCIIValues {

    public static void main ( String[] args ) {

        int value = scoreOfString( "hello" ); // must return 13;

        String hi = "hello";

        System.out.println( hi.length() );

        System.out.println( value );

    }

    public static int scoreOfString(String s) {

        int asciiValues = 0;

        for ( int index = 0; index < s.length() - 1; index ++ ) {

            asciiValues += Math.abs( s.charAt(index) - s.charAt( index + 1));

        } 

        return asciiValues;

    }

}
