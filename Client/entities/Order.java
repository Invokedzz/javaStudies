package Client.entities;

import Client.entities.enums.OrderStatus;

import Client.entities.OrderItem;

import Client.entities.Client;

import java.time.LocalDate;

import java.util.ArrayList;

import java.util.List;

public class Order {

    // status (OrderStatus) & moment (LocalDate) & client (Client); ArrayList (OrderItem)
    // Functions: addItem (OrderItem item), removeItem (OrderItem item), total (double).

    private OrderStatus status;

    private LocalDate moment;

    private Client client;

    List <OrderItem> orderItemList = new ArrayList<>();

    public Order (OrderStatus status, LocalDate moment, Client client) {

        this.status = status;

        this.moment = moment;

        this.client = client;

    }

    public void addItem (OrderItem item) {

        orderItemList.add(item);

    }

    public void removeItem (OrderItem item) {

        orderItemList.remove(item);

    }

    public double total () {

        double sum = 0.0;

        for (OrderItem c: orderItemList) {

            sum += c.subTotal();

        }

        return sum;

    }

    @Override
    public String toString () {

        return status +
                " " + moment
                + " " + client;

    }

}
