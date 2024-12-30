package review.withoutinterfacessagain.model.entities;

import java.util.ArrayList;

import java.util.List;

import java.time.LocalDateTime;

public class Order {

    private LocalDateTime moment;

    private OrderStatus status;

    private OrderItem orderItem;

    private Client client;

    public Order () {}

    public Order ( LocalDateTime moment, OrderStatus status, OrderItem orderItem, Client client ) {

        this.moment = moment;

        this.status = status;

        this.orderItem = orderItem;

        this.client = client;

    }

    public LocalDateTime getMoment () {

        return moment;

    }

    public OrderStatus getStatus () {

        return status;

    }

    public OrderItem getOrderItem () {

        return orderItem;

    }

    public Client getClient () {

        return client;

    }


}
