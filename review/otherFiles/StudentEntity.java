package review.otherFiles;

public class StudentEntity {

    private String studentName;

    private double firstGrade;

    private double secondGrade;

    public StudentEntity (String studentName, double firstGrade, double secondGrade) {

        this.studentName = studentName;

        this.firstGrade = firstGrade;

        this.secondGrade = secondGrade;

    }

    public String toString () {

        return studentName;

    }

}
