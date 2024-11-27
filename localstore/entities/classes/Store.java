package localstore.entities.classes;

import localstore.entities.enums.StoreOrders;

import java.time.LocalDate;

public class Store {

    // name, id, time, status;

    private String productName;

    private Integer productId;

    private LocalDate time;

    private StoreOrders status;

    public Store (String productName, Integer productId, LocalDate time, StoreOrders status) {

        this.productName = productName;

        this.productId = productId;

        this.time = time;

        this.status = status;

    }

    @Override
    public String toString () {

        return "Name: " + productName
                + " Id: " + productId
                + " Time: " + time
                + " Status: " + status;

    }

}
