package app.Student2;

public class Student2 {

    private int studentId;
    private int creditHour;
    private int pointEarned;
    private double gpa;

    public Student2() {
        studentId = 9999;
        pointEarned = 12;
        creditHour = 3;
    }

    public void setStudentId(int id) {
        studentId = id;
    }

    public void setCreditHour(int hour) {
        creditHour = hour;
    }

    public void setPointEarned(int point) {
        pointEarned = point;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public int getPointEarned() {
        return pointEarned;
    }

    public void computeGPA() {
        gpa = (double) pointEarned / creditHour;
    }

    public void displayStudentInformation() {
        System.out.println("Student Id = " + studentId);
        System.out.println("Credit Hour = " + creditHour);
        System.out.println("Point Earned = " + pointEarned);
        System.out.println("GPA = " + gpa);
    }

    public void process() {
        computeGPA();
        displayStudentInformation();
    }

}