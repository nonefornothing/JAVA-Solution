package app.NumbersDemo2;

import java.util.Scanner;

public class NumbersDemo2 {

    public static void main(String[] args) {

        int A, B;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        A = input.nextInt();
        System.out.println("Enter number : ");
        B = input.nextInt();

        System.out.println("");

        displayNumberPlusFive(A);
        displayTwiceTheNumber(A);
        displayNumberSquared(A);

        System.out.println("");

        displayNumberPlusFive(B);
        displayTwiceTheNumber(B);
        displayNumberSquared(B);

        input.close();
    }

    public static void displayTwiceTheNumber(int num) {
        System.out.println(num * 2);
    }

    public static void displayNumberPlusFive(int num) {
        System.out.println(num + 5);
    }

    public static void displayNumberSquared(int num) {
        System.out.println(num * num);
    }
}