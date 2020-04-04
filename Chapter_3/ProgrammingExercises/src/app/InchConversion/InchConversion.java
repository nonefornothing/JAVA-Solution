package app.InchConversion;

import java.util.Scanner;

public class InchConversion {

    public static void main(String[] args) {
        double inche;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter inches value's ");
        inche = input.nextDouble();

        System.out.println(inche + " = " + inchesToFeet(inche) + " Feet = " + inchesToYard(inche) + " Yard");

        input.close();

    }

    public static double inchesToFeet(double inche) {
        return inche / 12;
    }

    public static double inchesToYard(double inche) {
        return inche / 36;
    }

}