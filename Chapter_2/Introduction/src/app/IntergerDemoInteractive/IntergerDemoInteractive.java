package app.IntergerDemoInteractive;

import java.util.Scanner;

public class IntergerDemoInteractive {

    public static void main(String[] args) {
        int anInt;
        byte anByte;
        short anShort;
        long anLong;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an interger >> ");
        anInt = input.nextInt();
        System.out.print("Please enter a byte interger >> ");
        anByte = input.nextByte();
        System.out.print("Please enter a short interger >> ");
        anShort = input.nextShort();
        System.out.print("Please enter a long interger >> ");
        anLong = input.nextLong();

        System.out.println("The int is   " + anInt);
        System.out.println("The byte is  " + anByte);
        System.out.println("The short is " + anShort);
        System.out.println("The long is  " + anLong);

        input.close();
    }
}