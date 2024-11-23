package chronos.entities;

public class ChronosEntity {

    public void chronosEngine (long initialTime) {

        long timeTraveled = System.currentTimeMillis() - initialTime;

        long secondsTraveled = (timeTraveled / 1000) % 60;

        long minutesTraveled = (timeTraveled / (1000 * 60)) % 60;

        long hoursTraveled = (timeTraveled / (1000 * 60 * 60)) % 24;

        String timeFormatted = String.format("%02d:%02d:%02d", hoursTraveled, minutesTraveled, secondsTraveled);

        System.out.println(timeFormatted);

    }

}
