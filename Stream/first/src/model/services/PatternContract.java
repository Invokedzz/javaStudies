package Stream.first.src.model.services;

import Stream.first.src.model.entities.ProductStream;

import java.util.List;

@FunctionalInterface
public interface PatternContract {

    void scanFile (List <ProductStream> list);

}
