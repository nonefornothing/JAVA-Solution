package app.MileConversionsInteractive;

import java.util.Scanner;

public class MileConversionsInteractive {

    public static void main(String[] args) {
        double mile, inches, feet, yards;

        Scanner input = new Scanner(System.in);
        System.out.print("Mile = ");
        mile = input.nextDouble();

        inches = mile * 63360;
        feet = mile * 5280;
        yards = mile * 1760;

        System.out.printf("%.2f Mile = %.2f inches = %.2f feet = %.2f yard ", mile, inches, feet, yards);

        input.close();
    }
}