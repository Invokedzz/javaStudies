package arrays.ArrayList.app;

import java.util.ArrayList;

import java.util.List;

import java.util.Locale;

public class LearningArrayList {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        ourMainApplication ();

    }

    private static void ourMainApplication () {

        List <String> list = new ArrayList<>();

        list.add("BMW");
        list.add("Mercedes");
        list.add("Ferrari");
        list.add("Mustang");
        list.add("Volvo");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // This method runs through our ArrayList;
        }

    }

}
