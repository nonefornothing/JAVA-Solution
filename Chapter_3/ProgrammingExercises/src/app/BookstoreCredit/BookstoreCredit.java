package app.BookstoreCredit;

import java.util.Scanner;

public class BookstoreCredit {

    public static void main(String[] args) {
        String studentName;
        double credit, grade;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter student name's  ");
        studentName = input.nextLine();
        System.out.println("Enter student grade's  ");
        grade = input.nextDouble();

        credit = computeTotalCredit(grade);

        System.out.println(studentName + " have " + grade + " grade point average " + "with $" + credit + " credit ");
        input.close();
    }

    public static double computeTotalCredit(double grade) {
        return grade * 10;
    }

    public static void displayName(String studentName) {
        System.out.println(studentName);
    }

}