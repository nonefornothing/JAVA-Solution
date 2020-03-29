package app.MileConversions;

public class MileConversions {

    public static void main(String[] args) {
        double mile = 18.23, inches, feet, yards;

        inches = mile * 63360;
        feet = mile * 5280;
        yards = mile * 1760;

        System.out.printf("%.2f Mile = %.2f inches = %.2f feet = %.2f yard ", mile, inches, feet, yards);
    }
}