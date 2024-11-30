package Client.app;

import Client.entities.OrderItem;

import Client.entities.Product;

import Client.entities.Order;

import Client.entities.Client;

import Client.entities.enums.OrderStatus;

import java.time.LocalDate;

import java.util.Scanner;

public class MainApp {

    public static void main (String[] args) {

        Scanner init = new Scanner(System.in);

        projectFunction(init);

    }

    private static void projectFunction (Scanner init) {

        System.out.println("Enter client data: ");

        System.out.println("Name: ");

        String name = init.next();

        System.out.println("Email: ");

        String email = init.next();

        System.out.println("Birth date: ");

        LocalDate date = LocalDate.now();

        System.out.println("Enter order data: ");

        OrderStatus orderStatus = OrderStatus.valueOf(init.next());

        Client clientElements = new Client(name, email, date);

        Order order = new Order(orderStatus, LocalDate.now(), clientElements);

        System.out.println("How many items to this order? ");

        int numberOfItems = init.nextInt();

        for (int i = 0; i < numberOfItems; i++) {

            System.out.printf("Enter %s item data: ", i + 1);

            System.out.println("Product name: ");

            String productName = init.next();

            System.out.println("Product price: ");

            double productPrice = init.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.println("Quantity: ");

            int productQuantity = init.nextInt();

            OrderItem item = new OrderItem(productQuantity, productPrice, product);

            order.addItem(item);

        }

        System.out.println(order);

    }

}
