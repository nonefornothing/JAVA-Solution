package app.Percentages;

public class Percentages {

    public static void main(String[] args) {
        double number1 = 2.0, number2 = 5.0;

        computePercent1(number1, number2);
        computePercent2(number2, number1);
    }

    public static void computePercent1(double number1, double number2) {
        System.out.println((number1 / number2) * 100);
    }

    public static void computePercent2(double number2, double number1) {
        System.out.println((number2 / number1) * 100);
    }

}