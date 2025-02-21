package content.POO.somexercises.app;

import content.POO.somexercises.entities.DateEntity;

public class MainDate {

    public static void main ( String[] args ) {

        DateEntity date = new DateEntity(10, 8, 2020);

        String getDate = date.displayDate();

        System.out.println(getDate);

    }

}
