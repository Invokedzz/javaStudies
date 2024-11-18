package review.otherFiles;

public class BhaskaraValidator {

    protected void reviewDelta (double delta) {

        if (delta == 0.0) System.out.println("Equal zero");

        else if (delta > 0.0) System.out.println("> zero");

        else if (delta < 0.0) System.out.println("< zero");

        else System.out.println("Hell nah");

    }

}
