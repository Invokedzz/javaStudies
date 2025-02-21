package content.enums.entities;

import content.enums.entities.enums.OrderStatus;

import java.time.LocalDate;

public class Order {

    private Integer id;

    private LocalDate moment;

    private final OrderStatus status;

    public Order (Integer id, LocalDate moment, OrderStatus status) {

        this.id = id;
        this.moment = moment;
        this.status = status;

    }

    public Integer getId () {
        return id;
    }

    public LocalDate getMoment () {
        return moment;
    }

    public OrderStatus getStatus () {
        return status;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public void setMoment (LocalDate moment) {
        this.moment = moment;
    }

    @Override
    public String toString () {

        return "id: " + id
                + " moment: " + moment
                + " status: " + status;

    }

}
