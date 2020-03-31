package app.ParadiseInfo2;

import java.util.Scanner;

public class ParadiseInfo2 {

    public static void main(String[] args) {
        double price;
        double discount;
        double savings;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cutoff price for discount >> ");
        price = input.nextDouble();
        System.out.println("Enter discount rate as a whole number >> ");
        discount = input.nextDouble();

        savings = computeDiscountInfo(price, discount);

        displayInfo();
        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That's a savings of at least $" + savings);

        input.close();
    }

    public static double computeDiscountInfo(double price, double discountRate) {
        double savings;
        savings = price * discountRate / 100;
        return savings;
    }

    public static void displayInfo() {
        System.out.println("Paradise Day Spa wants to pamper you. ");
        System.out.println("We will make you look good .");
    }

}