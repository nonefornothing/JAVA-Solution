package app.SammysRentalPrice;

import java.util.Scanner;

public class SammysRentalPriceWithMethods {

    public static void main(String[] args) {
        int totalMinute;

        totalMinute = getData();
        displayCompanyMotto();
        computeData(totalMinute);
    }

    public static int getData() {
        int totalMinute;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Number of minutes  sports equipment rented");
        totalMinute = input.nextInt();
        return totalMinute;
    }


    public static void computeData(int totalMinute){
        int totalHour, timePenalty, totalPrice;
        
        totalHour = totalMinute / 60;
        timePenalty = totalMinute % 60;

        if (totalMinute < 61) {
            totalPrice = 40;
        } else {
            totalPrice = timePenalty + (40 * totalHour);
        }

        System.out.println("At least , you must rent 1 hour for rent");
        System.out.println("Hour = " + totalHour + " , Minute = " + timePenalty);
        System.out.println("Total price of rent = $" + totalPrice);

    }

    public static void displayCompanyMotto(){
        System.out.println("************************************");
        System.out.println("* Sammy’s makes it fun in the sun. *");
        System.out.println("************************************");
    }


}