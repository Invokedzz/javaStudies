package review.otherFiles;

import review.otherFiles.ClassEntity;

import java.util.Locale;

import java.util.Scanner;

public class ClassApp {

    public static void main (String[] args) {

        Locale.setDefault(Locale.JAPANESE);

        addInputsToApplication();

    }

    private static void addInputsToApplication () {

        Scanner init = new Scanner (System.in);

        int pkmCaptured, releasedPkm, newCaptures;

        System.out.println("Enter the measure for total of pkm captured: ");

        pkmCaptured = init.nextInt();

        System.out.println("Enter the measure for the released pkm");

        releasedPkm = init.nextInt();

        System.out.println("Enter the measure for your new captures");

        newCaptures = init.nextInt();

        projectMainFunction(pkmCaptured, releasedPkm, newCaptures);

    }

    private static void projectMainFunction (int pkmCaptured, int releasedPkm, int newCaptures) {

        ClassEntity product = new ClassEntity(pkmCaptured, releasedPkm, newCaptures);

        product.addPkToDex();

        product.removePksFromDex();

        System.out.println(product);

    }

}
