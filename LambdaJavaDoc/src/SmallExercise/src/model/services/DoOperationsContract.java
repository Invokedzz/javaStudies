package LambdaJavaDoc.src.SmallExercise.src.model.services;

import LambdaJavaDoc.src.SmallExercise.src.model.entities.ProductAB;

import java.util.List;

@FunctionalInterface
public interface DoOperationsContract {

    Double filterData (List < ProductAB > productList );

}
