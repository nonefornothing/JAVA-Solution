package app.Student;

public class Student {

    private int studentId;
    private int creditHour;
    private int pointEarned;
    private double gpa;

    public Student()
    {
        studentId = 0;
        creditHour = 0;
        pointEarned = 0;
        gpa = 0;
    }
    
    public void setStudentId(int id){
        studentId = id;
    }

    public void setCreditHour(int credit) {
        creditHour = credit;
    }
    
    public void setPointEarned(int point) {
        pointEarned = point;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getCreditHour() {
        return creditHour;
    }
    
    public int getPointEarned() {
        return pointEarned;
    }

    public void computeGPA (int pointEarned, int creditHour){
        gpa = ((double)pointEarned/creditHour);
    } 

    public void displayStudent(){
        System.out.println("Student Id = " + studentId);
        System.out.println("Credit Hour = " + creditHour);
        System.out.println("Point Earned = " + pointEarned);
        System.out.println("GPA = " + gpa);
    }

}