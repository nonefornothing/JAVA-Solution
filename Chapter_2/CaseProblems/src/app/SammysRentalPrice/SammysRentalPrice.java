package app.SammysRentalPrice;

import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {
        int totalHour, totalMinute, timePenalty, totalPrice;

        Scanner input = new Scanner(System.in);

        System.out.println("Number of minutes  sports equipment rented");
        totalMinute = input.nextInt();

        totalHour = totalMinute / 60;
        timePenalty = totalMinute % 60;

        if (totalMinute < 61) {
            totalPrice = 40;
        } else {
            totalPrice = timePenalty + (40 * totalHour);
        }

        System.out.println("************************************");
        System.out.println("* Sammy’s makes it fun in the sun. *");
        System.out.println("************************************");
        System.out.println("At least , you must rent 1 hour for rent");
        System.out.println("Hour = " + totalHour + " , Minute = " + timePenalty);
        System.out.println("Total price of rent = $" + totalPrice);

        input.close();
    }
}