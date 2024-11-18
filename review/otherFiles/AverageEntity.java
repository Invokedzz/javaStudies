package review.otherFiles;

public class AverageEntity {

    private double [] height;

    private char [] gender;

    public AverageEntity (double [] height, char [] gender) {

        this.height = height;

        this.gender = gender;

    }

    public String toString () {

        return height + " " + gender;

    }

}
