package content.LambdaJavaDoc.src.SmallExercise.src.model.services;

import content.LambdaJavaDoc.src.SmallExercise.src.model.entities.ProductAB;

import content.LambdaJavaDoc.src.SmallExercise.src.model.util.ABPredicate;

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

        double sum = 0;

        ABPredicate predicate = ( product ) -> product.getName().charAt(0) == 'T';

        for (int i = 0; i < productList.size(); i++) {

            if (predicate.test(productList.get(i) )) sum += productList.get(i).getPrice();
            else sum += 0;

        }

        return sum;

    }

}
