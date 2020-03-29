package app.MinutesConversion;

import java.util.Scanner;

public class MinutesConversion {

    public static void main(String[] args) {

        int minute;
        float hour, day;

        Scanner input = new Scanner(System.in);

        System.out.println("How many minute do you want convert?");
        minute = input.nextInt();

        hour = (float) minute / 60;
        day = hour / 24;

        System.out.printf("%d minutes equals %.2f hours and equals %.3f days", minute, hour, day);

        input.close();
    }
}