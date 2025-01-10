package generics.HashCode.equals1th.src;

public class Program {

    public static void main ( String[] args ) {

        analyzingHashCode();

        System.out.println( "//////////////////////" );

        moreHashCode();

    }

    private static void analyzingHashCode () {

        String randomDude = "Mary Jane";

        String otherRandomDude = "Paul";

        System.out.println( randomDude.hashCode() ); // 1406023507

        System.out.println( otherRandomDude.hashCode() ); // 2480232

        // They're very different from each other :\

    }

    private static void moreHashCode () {

        String personOne = "Peter";

        String personTwo = "Peter";

        System.out.println( personOne.hashCode() ); // 77005292

        System.out.println( personTwo.hashCode() ); // 77005292

        // They have the same numerical value :)

    }

}
