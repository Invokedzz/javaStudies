package LambdaJavaDoc.src.SmallExercise.src.model.services;

import LambdaJavaDoc.src.SmallExercise.src.model.entities.ProductAB;

import LambdaJavaDoc.src.SmallExercise.src.model.util.ABPredicate;

import java.util.List;

public class DoOperations implements DoOperationsContract {

    private ProductAB productAB;

    public DoOperations () {}

    public DoOperations ( ProductAB productAB ) {

        this.productAB = productAB;

    }

    public ProductAB getProductAB () {

        return productAB;

    }

    @Override
    public Double filterData(List<ProductAB> productList ) {

        ABPredicate abPredicate = ( product ) -> productAB.getName().charAt(0) == 'T';

        double sum = 0;

        for (ProductAB product : productList) {

            if (abPredicate.test( product )) {

                sum += product.getPrice();

            }

        }

        return sum;

    }

}
