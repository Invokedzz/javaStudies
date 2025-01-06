package interfaces.test.services;

import java.io.*;

public class DataLoader implements ExecData {



    @Override
    public void load () {

        System.out.println( "The file is being loaded. Please wait!" );

        File file = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/interfaces/test/files/Shadow" );

        try ( BufferedReader bufferedReader = new BufferedReader( new FileReader( file ) ) ) {

            String line = bufferedReader.readLine();

            while ( line != null ) {

                System.out.println( line );

                line = bufferedReader.readLine();

            }

        } catch ( IOException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

    }

}
