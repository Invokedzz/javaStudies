package review.otherFiles;

public class ClassEntity {

    private int numberOfPkCaptured;

    private final int releasePks;

    private final int newCapturedPks;

    public String toString () {

        return numberOfPkCaptured
                + " " + newCapturedPks
                + " " + releasePks;

    }

    public ClassEntity (int numberOfPkCaptured, int releasePks, int newCapturedPks) {

        this.numberOfPkCaptured = numberOfPkCaptured;

        this.releasePks = releasePks;

        this.newCapturedPks = newCapturedPks;

    }

    public void addPkToDex () {

        numberOfPkCaptured += newCapturedPks;

    }

    public void removePksFromDex () {

        numberOfPkCaptured -= releasePks;

    }

    public int getNumberOfPkCaptured () {
        return numberOfPkCaptured;
    }

    public int getReleasePks () {
        return releasePks;
    }

    public int getNewCapturedPks () {
        return newCapturedPks;
    }

}
