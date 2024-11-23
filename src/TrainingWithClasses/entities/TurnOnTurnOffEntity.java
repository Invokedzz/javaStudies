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

        }

    }

    public void turnOffOurDevice () {

        if (!turnDeviceOn) {

            turnDeviceOff = true;

        }

    }

}
