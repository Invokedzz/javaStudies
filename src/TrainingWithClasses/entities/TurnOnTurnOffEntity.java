package src.TrainingWithClasses.entities;

public class TurnOnTurnOffEntity {

    private boolean turnDeviceOn;

    private boolean turnDeviceOff;

    public TurnOnTurnOffEntity () {

        this.turnDeviceOn = false;

        this.turnDeviceOff = false;

    }

    public void turnOnOurDevice () {

        if (!turnDeviceOff) {

            turnDeviceOn = true;

            turnOn();

        }

    }

    public void turnOffOurDevice () {

        if (!turnDeviceOn) {

            turnDeviceOff = true;

            turnOff();

        }

    }

    private void turnOn() {

        new Thread(() -> {

            if (turnDeviceOn) {

            try {


                Thread.sleep(3000);

                System.out.println("Your device was turned on successfully!");

            } catch (InterruptedException error) {

                error.printStackTrace();

            }

        }

        }).start();

    }

    private void turnOff () {

        new Thread (() -> {

            try {

                Thread.sleep(6000);

                System.out.println("The device was turned off");

            } catch (InterruptedException error) {

                error.printStackTrace();

            }

        }).start();

    }

}
