package app.FitnessTracker2;

import java.time.*;
import java.util.Scanner;

public class TestFitnessTracker2 {

    public static void main(String[] args) {

        String fitnessActivity;
        int minuteSpent;
        LocalDate time;
        String time2;

        Scanner input = new Scanner(System.in);
        FitnessTracker2 customer = new FitnessTracker2();

        System.out.println("Enter activity: ");
        fitnessActivity = input.nextLine();
        System.out.println("Enter date in 'Year Month day' form:");
        time2 = input.nextLine();
        System.out.println("Enter time spent in minutes: ");
        minuteSpent = input.nextInt();
        customer.setFitnessActivity(fitnessActivity);
        customer.setMinuteSpent(minuteSpent);
        customer.setTime2(time2);
        time = customer.getTime();

        customer.displayData(fitnessActivity, minuteSpent, time);
        customer.displayData(fitnessActivity, minuteSpent, time2); // acces constructor that after initiliziated
        input.close();
    }

}