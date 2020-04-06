package app.SammysRentalPrice;

import java.util.Scanner;

public class RentalDemo {

    public static void main(String[] args) {
        String contractNumber;
        int totalMinute;

        Rental customer1 = new Rental();

        contractNumber = getContractNumber();
        totalMinute = getTotalMinute();
        customer1.setContractNumber(contractNumber);
        customer1.setHourAndMinutes(totalMinute);
        SammysRentalPriceWithMethods.displayCompanyMotto();
        computeData(totalMinute, contractNumber);
    }

    public static String getContractNumber() {
        String contractNumber;

        Scanner input = new Scanner(System.in);
        System.out.println("Contract Number of customer ");
        contractNumber = input.nextLine();
        return contractNumber;
    }

    public static int getTotalMinute() {
        int totalMinute;

        Scanner input = new Scanner(System.in);
        System.out.println("Number of minutes  sports equipment rented");
        totalMinute = input.nextInt();
        return totalMinute;
    }

    public static void computeData(int totalMinute, String contractNumber) {
        int totalHour, timePenalty, totalPrice;

        totalHour = totalMinute / 60;
        timePenalty = totalMinute % 60;

        if (totalMinute < 61) {
            totalPrice = 40;
        } else {
            totalPrice = timePenalty + (40 * totalHour);
        }

        System.out.println("At least , you must rent 1 hour for rent");
        System.out.println("Customer rent something with Contract Number" + contractNumber);
        System.out.println("Hour = " + totalHour + " , Minute = " + timePenalty);
        System.out.println("Total price of rent = $" + totalPrice);
    }

}

// public static Rental getData(Rental r) {
// int totalMinute;
// String contractNumber;

// Scanner input = new Scanner(System.in);

// System.out.println("Contract Number of customer ");
// contractNumber = input.nextLine();
// System.out.println("Number of minutes sports equipment rented");
// totalMinute = input.nextInt();
// r.setContractNumber(contractNumber);
// r.setMinute(totalMinute);
// return r;
// }
