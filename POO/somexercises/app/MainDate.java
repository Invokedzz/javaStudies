package POO.somexercises.app;

import POO.somexercises.entities.DateEntity;

public class MainDate {

    public static void main ( String[] args ) {

        DateEntity date = new DateEntity(10, 8, 2020);

        String getDate = date.displayDate();

        System.out.println(getDate);

    }

}
