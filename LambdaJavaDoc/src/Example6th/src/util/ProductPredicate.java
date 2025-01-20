package LambdaJavaDoc.src.Example6th.src.util;

import LambdaJavaDoc.src.Example6th.src.entities.Product;

import java.util.function.Predicate;

public interface ProductPredicate extends Predicate <Product> {

    // an interface can't implement another interface, but an interface can extends other interface

    boolean test ( Product product );

}
