package localstore.entities.classes;

import localstore.entities.enums.StoreOrders;

import java.time.LocalDate;

public class Store {

    // name, id, time, status;

    private final String productName;

    private final Integer productId;

    private final LocalDate time;

    private final StoreOrders status;

    public Store (String productName, Integer productId, LocalDate time, StoreOrders status) {

        this.productName = productName;

        this.productId = productId;

        this.time = time;

        this.status = status;

    }

    public Integer getProductId () {

        return productId;

    }

    @Override
    public String toString () {

        return "Name: " + productName
                + " Id: " + productId
                + " Time: " + time
                + " Status: " + status;

    }

}
