package Challenge.Challenge12th.src;

public class IsNumberAPalindrome {

    public static void main ( String[] args ) {

        boolean trueOrFalse = isPalindrome(101);

        System.out.println( trueOrFalse );

    }

    private static boolean isPalindrome(int x) {

        // Given an integer x, return true if x is a
        //palindrome
        //, and false otherwise.

        String convertInteger = String.valueOf( x );

        int left = 0;

        int right = convertInteger.length() - 1;

        while ( left < right ) {

            if ( convertInteger.charAt(left) != convertInteger.charAt(right)) return false;

            left++;

            right--;

        }

        return true;

    }

}
