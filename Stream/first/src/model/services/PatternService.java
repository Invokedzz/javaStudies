package Stream.first.src.model.services;

import Stream.first.src.model.entities.ProductStream;

import java.util.List;

import java.io.*;

public class PatternService implements PatternContract {

    @Override
    public void scanFile(List <ProductStream> list) {

        File file = new File("/Users/samunoinv/Documents/GitHub/javaStudies/Stream/first/src/model/files/ProductListAndPrices");

        try (BufferedReader bufferedReader = new BufferedReader( new FileReader( file ))) {

            String line = bufferedReader.readLine();

            while (line != null) {

                String [] fields = line.split(",");

                list.add( new ProductStream( fields[0], Double.parseDouble(fields[1]) ));

                line = bufferedReader.readLine();

            }


            reOrderElements( list );

        } catch ( IOException exp ) {

            System.out.println( exp.getMessage() );

        }

    }

    private void reOrderElements (List<ProductStream> list) {

        double average = list.stream()
                .map( ProductStream::getPrice )
                .reduce( 0.0, (x, y) -> (x + y) / list.size() );

        List <String> names = list.stream()
                .filter( x -> x.getPrice() > average )
                .map( ProductStream::getName )
                .toList();

        names.forEach( System.out::println );

    }

}
