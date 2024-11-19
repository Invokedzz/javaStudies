package arrays.someStuff;

import java.util.ArrayList;

import java.util.List;

import java.util.Locale;

public class StringListLearn {

    public static void main (String[] args) {

        Locale.setDefault(Locale.JAPANESE);

        ourMainProject();

    }

    private static void ourMainProject () {

        List <String> ourList = new ArrayList<>();

        ourList.add("Honey - Pablo");

        ourList.add("Radiohead");

        ourList.add(0, "Thom Yorke");

        ourList.add(1, "No Surprises");

        ourList.remove(2);

        System.out.println(ourList);

        for (String obj: ourList) {
            System.out.println(obj);
        }

        System.out.println("--------------------------------");

        List <String> anotherList = new ArrayList<>();

        anotherList.add("Adele");
        anotherList.add("Amy Lee");
        anotherList.add("Avril Lavigne");
        anotherList.add("Eminem");
        anotherList.add("Chester Bennington");

        anotherList.removeIf(x -> x.charAt(1) == 'v');

        System.out.println(anotherList);

        System.out.println(anotherList.indexOf("Amy Lee"));

        for (String element: anotherList) {
            System.out.println(element);
        }


    }

}
