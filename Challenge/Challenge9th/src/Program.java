package Challenge.Challenge9th.src;

public class Program {

    public static void main ( String[] args ) {

        String [] rooks = new String[]{"A8", "A7"};

        System.out.println(canCapture( rooks ));

    }

    public static boolean canCapture(String[] rooks) {

        return rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1);

    }

}
