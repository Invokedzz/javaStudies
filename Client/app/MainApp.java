package Client.app;

import Client.entities.OrderItem;

import Client.entities.Product;

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

        LocalDate localDate = LocalDate.parse(init.next());

        System.out.println("Enter order data: ");

        OrderStatus orderStatus = OrderStatus.valueOf(init.next());

        Client clientElements = new Client(name, email, localDate);

    }

}
