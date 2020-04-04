package app.PaintCalculator;

import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args) {
        int length, width, height;
        int area;
        double gallon, price;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the room: ");
        length = input.nextInt();
        System.out.println("Enter the width of the room: ");
        width = input.nextInt();
        System.out.println("Enter the height of the room: ");
        height = input.nextInt();

        area = length * height * width;

        gallon = computeArea(area);
        System.out.println(gallon);
        price = computePrice(gallon);
        System.out.println(price);

        System.out.printf("The cost to paint a %d-by-%d-foot room with %d-foot ceilings is $ %f", length, width, height,
                price);

        input.close();

    }

    public static double computeArea(int area) {
        return (double) area / 350;
    }

    public static double computePrice(Double gallon) {
        return gallon * 32;
    }

}