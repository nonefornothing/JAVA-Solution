package app.Insurance;

import java.util.Scanner;

public class Insurance {

    public static void main(String[] args) {
        int currentYear, birthYear;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter current year now  ");
        currentYear = input.nextInt();
        System.out.println("Enter your birth year's now  ");
        birthYear = input.nextInt();

        System.out.println("You would pay $" + computePremiunAmount(currentYear, birthYear));

        input.close();
    }

    public static int computePremiunAmount(int currentYear, int birthYear) {

        return ((currentYear - birthYear) / 10 + 15) * 20;
    }

}