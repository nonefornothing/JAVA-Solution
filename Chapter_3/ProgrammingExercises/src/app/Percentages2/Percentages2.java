package app.Percentages2;

import java.util.Scanner;

public class Percentages2 {

    public static void main(String[] args) {
        double number1, number2;

        Scanner input = new Scanner(System.in);
        number1 = input.nextDouble();
        number2 = input.nextDouble();

        computePercent1(number1, number2);
        computePercent2(number2, number1);

        input.close();
        
    }

    public static void computePercent1(double number1, double number2) {
        System.out.println((number1 / number2) * 100);
    }

    public static void computePercent2(double number2, double number1) {
        System.out.println((number2 / number1) * 100);
    }

}