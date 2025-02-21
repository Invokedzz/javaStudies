package content.LambdaJavaDoc.src.Example8th.src.application;

import content.LambdaJavaDoc.src.Example8th.src.entities.ProductB;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Program {

    public static void main ( String[] args ) {

        runThisSenpai();

    }

    private static void runThisSenpai () {

        List<ProductB> products = new ArrayList<>();

        products.add(new ProductB("Tv", 900.00));

        products.add(new ProductB("Mouse", 50.00));

        products.add(new ProductB("Tablet", 350.50));

        products.add(new ProductB("HD Case", 80.90));

        Function <ProductB, String> f = (productB -> productB.getName().toUpperCase());

        List <String> names = products.stream().map(f).toList();

        names.forEach(System.out::println);

    }

}
