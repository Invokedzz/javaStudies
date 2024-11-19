package arrays.someStuff;

import java.util.ArrayList;

import java.util.List;

// import java.util.stream.Collectors;

public class StringListLearnAgain {

    public static void main (String[] args) {

        ourMainApplication();

    }

    private static void ourMainApplication () {

        List <String> listElements = new ArrayList<>();

        listElements.add("Paul");
        listElements.add("Tobias");
        listElements.add("Chico");
        listElements.add("Paolo");
        listElements.add("Honey");

        String name = listElements.stream()
                .filter(value -> value.charAt(0) == 'P')
                .findFirst().orElse(null);

        if (name != null) {

            String valueObtained = name.toUpperCase();

            System.out.println(valueObtained);

        }

    }

}
