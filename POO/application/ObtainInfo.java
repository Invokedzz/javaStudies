package POO.application;

import POO.entity.InfoEntity;

import java.util.Scanner;

import java.util.Locale;

public class ObtainInfo {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        insertProperValues();

    }

    public static void insertProperValues () {

        Scanner initSc = new Scanner (System.in);

        String Name = initSc.next();

        double Age = initSc.nextDouble();

        String FavChar = initSc.next();

        InfoEntity product = new InfoEntity(Name, Age, FavChar);

        System.out.printf("Product data: %s", product);

        System.out.println(InfoEntity.returnInfo(Name, Age, FavChar));

        initSc.close();

    }

}
