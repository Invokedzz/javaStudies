package filejava.fourth;

import java.io.*;

public class AppNThree {

    public static void main ( String[] args ) {

        String [] words = new String[] { "Hi", "Good morning", "How're you?" };

        String path = "/Users/samunoinv/Documents/GitHub/javaStudies/filejava/fourth/noradiotoomuchhead";

        try ( BufferedWriter bufferedWriter = new BufferedWriter ( new FileWriter ( path, true ) ) ) {

            for ( String word : words ) {

                bufferedWriter.write( word );

                bufferedWriter.newLine();

            }

        } catch ( IOException error ) {

            System.out.println( error.getMessage() );

        }

    }

}
