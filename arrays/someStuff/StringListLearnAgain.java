package arrays.someStuff;

import java.util.ArrayList;

import java.util.List;

public class StringListLearnAgain {

    public static void main (String[] args) {

        ourMainApplication();

    }

    private static void ourMainApplication () {

        List <String> listElements = new ArrayList<>();

        List <String> anotherListOfElements = new ArrayList<>();

        listElements.add("Paul");
        listElements.add("Tobias");
        listElements.add("Chico");
        listElements.add("Paolo");
        listElements.add("Honey");

        anotherListOfElements.add("Thom");
        anotherListOfElements.add("Tom");
        anotherListOfElements.add("Yorke");
        anotherListOfElements.add("Chester");

        String name = listElements.stream()
                .filter(value -> value.charAt(0) == 'P')
                .findFirst().orElse(null);

        String newName = anotherListOfElements.stream()
                .filter(newValue -> newValue.charAt(0) == 'T').toList().toString();

        if (name != null) {

            String valueObtained = name.toUpperCase();

            System.out.println(valueObtained);

        }

        if (newName != null) {

            String anotherValueObtained = newName.toUpperCase();
            System.out.println(anotherValueObtained);

        }

    }

}
