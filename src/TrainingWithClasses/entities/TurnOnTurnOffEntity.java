package src.TrainingWithClasses.entities;

public class TurnOnTurnOffEntity {

    private boolean turnDeviceOn;

    private boolean turnDeviceOff;

    public TurnOnTurnOffEntity () {

        this.turnDeviceOn = false;

        this.turnDeviceOff = false;

    }

    public void turnOnOurDevice () {

        if (!turnDeviceOff && !turnDeviceOn) {

            turnDeviceOn = true;

            turnOn();

        }

    }

    public void turnOffOurDevice () {

        if (turnDeviceOn && !turnDeviceOff) {

            turnDeviceOff = true;

            turnOff();

        }

    }

    private void turnOn() {

        new Thread(() -> {

            try {


                Thread.sleep(3000);

                System.out.println("Your device was turned on successfully!");

                turnDeviceOff = false;

            } catch (InterruptedException error) {

                Thread.currentThread().interrupt();
                System.out.println(error.getMessage());

            }

        }).start();

    }

    private void turnOff () {

        new Thread (() -> {

            try {

                Thread.sleep(6000);

                System.out.println("The device was turned off successfully!");

                turnDeviceOn = false;

            } catch (InterruptedException error) {

                Thread.currentThread().interrupt();
                System.out.println(error.getMessage());

            }

        }).start();

    }

}
