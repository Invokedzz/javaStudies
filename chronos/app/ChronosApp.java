package chronos.app;

import chronos.entities.ChronosEntity;

// import java.util.Scanner;

import java.util.Locale;

public class ChronosApp {

    public static void main (String[] args) throws  InterruptedException {

        Locale.setDefault(Locale.ITALIAN);

        startChronosEngine();

    }

    private static void startChronosEngine () throws InterruptedException {

        ChronosEntity chronos = new ChronosEntity();
        
        chronos.startChronos();

        Thread.sleep(10000);


        chronos.pauseChronos();
        System.out.println("\nChronometer paused after 10 seconds.");

        Thread.sleep(5000);
        chronos.resetChronos();

    }

}
