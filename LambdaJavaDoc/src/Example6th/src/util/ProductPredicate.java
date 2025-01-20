package LambdaJavaDoc.src.Example6th.src.util;

import LambdaJavaDoc.src.Example6th.src.entities.Product;

import java.util.function.Predicate;

public interface ProductPredicate extends Predicate <Product> {

    boolean test ( Product product );

}
