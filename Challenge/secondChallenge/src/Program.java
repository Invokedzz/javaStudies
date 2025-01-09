package Challenge.secondChallenge.src;

public class Program {

    public static void main ( String[] args ) {

        String[] elements = new String[]{"A8", "A7"};

        boolean hasCaptured = canCapture( elements );

        System.out.println( hasCaptured );

    }

    private static boolean canCapture ( String[] rooks ) {

        return rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1);

    }

}
