package app.CarlysEventPrice;

import java.util.Scanner;

public class CarlysEventPrice {

    public static void main(String[] args) {
        int totalMeal, totalPrice, priceGuest = 35;
        boolean dif;

        Scanner input = new Scanner(System.in);

        System.out.println("number of guests attending an event ");
        totalMeal = input.nextInt();

        totalPrice = totalMeal * priceGuest;

        if (totalMeal >= 50) {
            dif = true;
        } else {
            dif = false;
        }

        System.out.println("*************************************************");
        System.out.println("* Carly’s makes the food that makes it a party. *");
        System.out.println("*************************************************");
        System.out.println("number of guest = " + totalMeal + " person");
        System.out.println("price for one guest = $" + priceGuest);
        System.out.println("Total price's event = $" + totalPrice);
        System.out.println("Is this event classified as large event ? " + dif);

        input.close();
    }
}