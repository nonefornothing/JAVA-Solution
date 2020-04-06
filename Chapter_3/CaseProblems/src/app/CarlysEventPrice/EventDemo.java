package app.CarlysEventPrice;

import java.util.Scanner;

public class EventDemo {

    public static void main(String[] args) {

        Event party1 = new Event();
        Event party2 = new Event();

        party1 = getData(party1);
        CarlysEventPriceWithMethods.displayCompanyMotto();
        computeAndDisplayResult(party1);

        party2 = getData(party2);
        CarlysEventPriceWithMethods.displayCompanyMotto();
        computeAndDisplayResult(party2);
    }

    public static Event getData(Event e) {

        int totalGuest;
        String eventNumber;

        Scanner input = new Scanner(System.in);

        System.out.println("Code of event ");
        eventNumber = input.nextLine();
        System.out.println("number of guests attending an event ");
        totalGuest = input.nextInt();

        e.setEventNumber(eventNumber);
        e.setTotalGuest(totalGuest);
        return e;
    }

    public static void computeAndDisplayResult(Event e) {

        int totalPrice, totalGuest, priceGuest = 35;
        boolean dif;
        String numberEvent;

        numberEvent = e.getEventNumber();
        totalGuest = e.getTotalGuest();

        totalPrice = totalGuest * priceGuest;

        if (totalGuest >= 50) {
            dif = true;
        } else {
            dif = false;
        }

        System.out.println("Code of Event = " + numberEvent);
        System.out.println("number of guest = " + totalGuest + " person");
        System.out.println("price for one guest = $" + priceGuest);
        System.out.println("Total price's event = $" + totalPrice);
        System.out.println("Is this event classified as large event ? " + dif);

    }

}