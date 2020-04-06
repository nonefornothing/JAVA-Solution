package app.CarlysEventPrice;

import java.util.Scanner;

public class CarlysEventPriceWithMethods {

    public static void main(String[] args) {

        
        int totalUserMeal = getData();
        displayCompanyMotto();
        computeAndDisplayResult(totalUserMeal);
    }

    public static int getData(){

        int totalMeal;

        Scanner input = new Scanner(System.in);

        System.out.println("number of guests attending an event ");
        totalMeal = input.nextInt();

        return totalMeal;
    }

    public static void displayCompanyMotto(){

        System.out.println("*************************************************");
        System.out.println("* Carly’s makes the food that makes it a party. *");
        System.out.println("*************************************************");
    }

    public static void computeAndDisplayResult(int totalUserMeal){
        
        int totalPrice, priceGuest = 35;
        boolean dif;

        totalPrice = totalUserMeal * priceGuest;

        if (totalUserMeal >= 50) {
            dif = true;
        } else {
            dif = false;
        }

        System.out.println("number of guest = " + totalUserMeal + " person");
        System.out.println("price for one guest = $" + priceGuest);
        System.out.println("Total price's event = $" + totalPrice);
        System.out.println("Is this event classified as large event ? " + dif);

    }


}