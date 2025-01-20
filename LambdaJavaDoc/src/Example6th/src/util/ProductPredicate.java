package LambdaJavaDoc.src.Example6th.src.util;

import LambdaJavaDoc.src.Example6th.src.entities.Product;

import java.util.function.Predicate;

/*There are some predefined functional interface in Java like Predicate, consumer, supplier etc.
 The return type of Lambda function (introduced in JDK 1.8) is also functional interface.*/

@FunctionalInterface
public interface ProductPredicate extends Predicate <Product> {

    // an interface can't implement another interface, but an interface can extend other interface

    boolean test ( Product product );

}
