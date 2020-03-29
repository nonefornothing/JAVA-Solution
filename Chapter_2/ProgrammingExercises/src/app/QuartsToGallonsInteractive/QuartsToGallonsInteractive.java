package app.QuartsToGallonsInteractive;

import java.util.Scanner;

public class QuartsToGallonsInteractive {

    public static void main(String[] args) {
        int quarts, gallons, mod;

        Scanner input = new Scanner(System.in);

        System.out.println("How many quarts to you want ?");
        quarts = input.nextInt();
        gallons = quarts / 4;
        mod = 18 % 4;
        System.out.printf("A job that needs %d quarts requires %d gallons plus %d quarts.", quarts, gallons, mod);

        input.close();
    }
}