package content.LambdaJavaDoc.src.Example7th.src.application;

import content.LambdaJavaDoc.src.Example7th.src.entities.ProductA;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program2 {

    public static void main ( String[] args ) {

        runThisSenpai2();

    }

    private static void runThisSenpai2 () {

        List<ProductA> products = new ArrayList<>();

        products.add(new ProductA("Tv", 900.00));

        products.add(new ProductA("Mouse", 50.00));

        products.add(new ProductA("Tablet", 350.50));

        products.add(new ProductA("HD Case", 80.90));

        Consumer <ProductA> consumer = (p) -> p.setPrice(p.getPrice() * 1.1);

        products.forEach(consumer);

        products.forEach(System.out::println);

    }

}
