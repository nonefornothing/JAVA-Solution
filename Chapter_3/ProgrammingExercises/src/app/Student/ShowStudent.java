package app.Student;

import java.util.Scanner;

public class ShowStudent {

    public static void main(String[] args)
    {
        int studentId;
        int creditHour;
        int pointEarned;

        Scanner input = new Scanner(System.in);

        Student kid1 = new Student();
        
        System.out.println("Student Id = ");
        studentId = input.nextInt();
        System.out.println("Credit Hour = ");
        creditHour = input.nextInt();
        System.out.println("Point Earned = ");
        pointEarned = input.nextInt();
        
        kid1.setStudentId(studentId);
        kid1.setCreditHour(creditHour);
        kid1.setPointEarned(pointEarned);

        kid1.computeGPA(pointEarned, creditHour);
        kid1.displayStudent();

        input.close();
    }
}