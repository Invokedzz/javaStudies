package review.otherFiles;

public class HotelRoomEntity {

    private String studentName;

    private String studentEmail;

    private int studentRoom;

    public HotelRoomEntity (String studentName, String studentEmail, int studentRoom) {

        this.studentName = studentName;

        this.studentEmail = studentEmail;

        this.studentRoom = studentRoom;

    }

    public String toString () {

        return studentName
                + " " + studentEmail
                + " " + studentRoom;

    }

    public String getStudentName () {
        return studentName;
    }

    public String getStudentEmail () {
        return studentEmail;
    }

    public int getStudentRoom () {
        return studentRoom;
    }

    public void setStudentEmail (String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setStudentRoom (int studentRoom) {
        this.studentRoom = studentRoom;
    }

}
