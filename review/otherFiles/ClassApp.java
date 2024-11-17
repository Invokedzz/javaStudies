package review.otherFiles;

import review.otherFiles.ClassEntity;

import java.util.Locale;

import java.util.Scanner;

public class ClassApp {

    public static void main (String[] args) {

        Locale.setDefault(Locale.JAPANESE);

        Scanner init = new Scanner (System.in);

        int pkmCaptured, releasedPkm, newCaptures;

        pkmCaptured = init.nextInt();

        releasedPkm = init.nextInt();

        newCaptures = init.nextInt();

        projectMainFunction(pkmCaptured, releasedPkm, newCaptures);

    }

    private static void projectMainFunction (int pkmCaptured, int releasedPkm, int newCaptures) {

        ClassEntity product = new ClassEntity();

    }

}
