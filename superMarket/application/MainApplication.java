package superMarket.application;

import java.util.Scanner;

import superMarket.entities.MarketEntity;

import java.util.Locale;

import java.util.ArrayList;

import java.util.List;

public class MainApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.CHINESE);

        ourMarketPlace();

    }

    private static void ourMarketPlace () {

        Scanner initSc = new Scanner(System.in);

        List <MarketEntity> list = new ArrayList<>();

        System.out.println("Enter the products qty: ");

        int productsQty = initSc.nextInt();

        Integer [] controlLoop = new Integer[productsQty];

        for (int i = 0; i < controlLoop.length; i++) {

        }

    }

}
