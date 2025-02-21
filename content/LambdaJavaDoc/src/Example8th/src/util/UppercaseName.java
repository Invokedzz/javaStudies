package content.LambdaJavaDoc.src.Example8th.src.util;

import content.LambdaJavaDoc.src.Example8th.src.entities.ProductB;

import java.util.function.Function;

public class UppercaseName implements Function <ProductB, String> {

    @Override
    public String apply ( ProductB productB ) {

        return productB.getName().toUpperCase();

    }

}
