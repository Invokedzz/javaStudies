package Challenge.thirdChallenge.src;

public class Program {

    public static void main ( String[] args ) {

        boolean isTrue = checkEnding( "convention", "tio" );

        System.out.println( isTrue );

    }

    public static boolean checkEnding(String str1, String str2) {

        return str1.endsWith(str2) || str2.endsWith(str1);

    }

}
