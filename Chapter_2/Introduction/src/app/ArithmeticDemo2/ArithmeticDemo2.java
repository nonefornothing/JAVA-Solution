package app.ArithmeticDemo2;

import java.util.Scanner;

public class ArithmeticDemo2 {

    public static void main(String[] args) {
        double firstNumber, secondNumber;
        double sum, diferent, average;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a double >> ");
        firstNumber = input.nextDouble();
        System.out.print("Please enter another double >> ");
        secondNumber = input.nextDouble();
        sum = firstNumber + secondNumber;
        diferent = firstNumber - secondNumber;
        average = sum / 2;

        System.out.printf("%.2f + %.2f is %.2f\n", firstNumber, secondNumber, sum);
        System.out.printf("%.2f - %.2f is %.2f\n", firstNumber, secondNumber, diferent);
        System.out.printf("The average of %.2f and %1.2f is %.2f\n", firstNumber, secondNumber, average);

        /*
         * System.out.println(firstNumber + " + " + secondNumber + " is " + sum));
         * System.out.println(firstNumber + " - " + secondNumber + " is " + diferent);
         * System.out.println("The average of " + firstNumber + " and " + secondNumber +
         * " is " + average);
         */
        input.close();
    }
}