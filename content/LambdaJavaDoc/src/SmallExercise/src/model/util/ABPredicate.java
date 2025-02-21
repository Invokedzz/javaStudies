package content.LambdaJavaDoc.src.SmallExercise.src.model.util;

import content.LambdaJavaDoc.src.SmallExercise.src.model.entities.ProductAB;

import java.util.function.Predicate;

@FunctionalInterface
public interface ABPredicate extends Predicate <ProductAB> {

    boolean test ( ProductAB p );

}
