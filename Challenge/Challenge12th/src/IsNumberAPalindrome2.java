package Challenge.Challenge12th.src;

public class IsNumberAPalindrome2 {

    public static void main ( String[] args ) {

        boolean trueOrNotTrue = isPalindrome( 201 );

        System.out.println( trueOrNotTrue );

    }

    private static boolean isPalindrome(int x) {

        String convertInteger = String.valueOf( x );

        for ( int left = 0; left < convertInteger.length(); left ++ ) {

            for ( int right = convertInteger.length() - 1; right > left; right -- ) {

                if ( convertInteger.charAt( left ) == convertInteger.charAt( right )) return true;

            }

        }

        return false;

    }

}
