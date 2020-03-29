package app.InchesToFeetInteractive;

import java.util.Scanner;

public class InchesToFeetInteractive {

    public static void main(String[] args) {
        int inches, feet, mod;

        Scanner input = new Scanner(System.in);
        inches = input.nextInt();

        mod = inches % 12;
        feet = inches / 12;
        System.out.printf("%d inches becomes %d feet and %d inches", inches, feet, mod);

        input.close();
    }
}