package chronos.entities;

public class ChronosEntity {

    private long startTime;

    private long elapsedTime;

    private boolean pausedChronos;

    private boolean runningChronos;

    public ChronosEntity () {

        this.startTime = 0;

        this.elapsedTime = 0;

        this.pausedChronos = false;

        this.runningChronos = false;

    }

    // Start, Pause, Reset, Run;

    public void startChronos () {

        if (!runningChronos) {

            this.startTime = System.currentTimeMillis() - elapsedTime;

            this.pausedChronos = false;

            this.runningChronos = true;

            runChronometer();

        }

    }

    public void pauseChronos () {

        if (runningChronos && !pausedChronos) {

            elapsedTime = System.currentTimeMillis() - startTime;

            runningChronos = false;

            pausedChronos = true;

        }

    }

    public void resetChronos () {

        elapsedTime = 0;

        startTime = 0;

        runningChronos = false;

        pausedChronos = false;

        System.out.println("00-00-00");

    }

    private void runChronometer () {

        new Thread(() -> {

            long currentTime = System.currentTimeMillis();

            long timeTraveled = currentTime - startTime;

            chronosEngine(timeTraveled);

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                
                e.printStackTrace();

            }

        }).start();

    }

    private void chronosEngine (long timeTraveled) {

        long secondsTraveled = (timeTraveled / 1000) % 60;

        long minutesTraveled = (timeTraveled / (1000 * 60)) % 60;

        long hoursTraveled = (timeTraveled / (1000 * 60 * 60)) % 24;

        String timeFormatted = String.format("%02d:%02d:%02d", hoursTraveled, minutesTraveled, secondsTraveled);

        System.out.println(timeFormatted);

    }

}
