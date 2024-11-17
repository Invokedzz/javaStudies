package review.otherFiles;

public class ClassEntity {

    private static int numberOfPkCaptured;

    private static int releasePks;

    private static int newCapturedPks;

    public String toString () {

        return numberOfPkCaptured
                + " " + newCapturedPks
                + " " + releasePks;

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
