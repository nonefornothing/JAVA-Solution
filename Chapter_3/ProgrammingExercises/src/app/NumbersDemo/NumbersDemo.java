package app.NumbersDemo;

public class NumbersDemo {

    public static void main(String[] args) {

        int A = 5, B= 10;

        System.out.println("");

        displayNumberPlusFive(A);
        displayTwiceTheNumber(A);
        displayNumberSquared(A);

        System.out.println("");

        displayNumberPlusFive(B);
        displayTwiceTheNumber(B);
        displayNumberSquared(B);

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