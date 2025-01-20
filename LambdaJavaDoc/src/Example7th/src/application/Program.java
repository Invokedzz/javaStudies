package LambdaJavaDoc.src.Example7th.src.application;

import LambdaJavaDoc.src.Example7th.src.entities.ProductA;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main ( String[] args ) {

        runThisSenpai();

    }

    private static void runThisSenpai () {

        List<ProductA> products = new ArrayList<>();

        products.add(new ProductA("Tv", 900.00));

        products.add(new ProductA("Mouse", 50.00));

        products.add(new ProductA("Tablet", 350.50));

        products.add(new ProductA("HD Case", 80.90));

        products.forEach( p -> p.setPrice( p.getPrice() * 1.1 ));

        products.forEach( System.out::println );

    }

}
