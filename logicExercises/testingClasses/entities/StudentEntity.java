package logicExercises.testingClasses.entities;

public class StudentEntity {

    public double firstGrade;

    public double secondGrade;

    public double thirdGrade;

    public double allGrades;

    public double receiveGrades () {

        allGrades = (firstGrade + secondGrade + thirdGrade) / 3.00;

        return allGrades;

    }

    public void showGradesToUser () {



    }

}
