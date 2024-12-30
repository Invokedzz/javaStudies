package review.withoutinterfacessagain.model.services;

import review.withoutinterfacessagain.model.entities.Order;

import java.util.ArrayList;

import java.util.List;

public class OrderList {

    List < Order > orderList = new ArrayList<>();

    public void addElement ( Order order ) {

        orderList.add( order );

    }

    public void removeElement ( Order order ) {

        orderList.remove( order );

    }

}
