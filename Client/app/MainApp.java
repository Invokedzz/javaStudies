package Client.app;

import Client.entities.OrderItem;
import Client.entities.Product;

public class MainApp {

    public static void main (String[] args) {

        projectFunction();

    }

    private static void projectFunction () {

        Product value = new Product("Ball", 20);

        OrderItem item = new OrderItem(10, 20.0, value);

        System.out.println(item);

    }

}
