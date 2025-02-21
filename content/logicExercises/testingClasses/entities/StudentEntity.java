package content.logicExercises.testingClasses.entities;

public class StudentEntity {

    public double firstGrade;

    public double secondGrade;

    public double thirdGrade;

    public double allGrades;

    public double receiveGrades () {

        allGrades = firstGrade + secondGrade + thirdGrade;

        if (allGrades >= 60.00) {

            System.out.printf("FINAL GRADE = %s\n", allGrades);

            System.out.println("PASS\n");

        }

        else if (allGrades < 60.00) {

            System.out.printf("FINAL GRADE = %s\n", allGrades);

            System.out.println("FAILED\n");

            System.out.printf("MISSING %s POINTS\n", 60 - allGrades);

        }

        return allGrades;

    }

}
