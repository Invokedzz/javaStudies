package LambdaJavaDoc.src.SmallExercise.src.model.services;

import LambdaJavaDoc.src.SmallExercise.src.model.entities.ProductAB;

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
    public void filterData( List<ProductAB> productList ) {

    }

}
