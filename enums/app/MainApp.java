package enums.app;

import enums.entities.Order;

import enums.entities.enums.OrderStatus;

import java.time.LocalDate;

public class MainApp {

    public static void main (String[] args) {

        Order element = new Order(1937, LocalDate.now(), OrderStatus.DELIVERED);

        System.out.println(element);

        OrderStatus reviewOrderStatus = OrderStatus.DELIVERED;

        OrderStatus reviewOtherOrderStatus = OrderStatus.valueOf("DELIVERED");

        System.out.println(reviewOrderStatus);

        System.out.println(reviewOtherOrderStatus);

    }

}
