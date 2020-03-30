package app.RandomGuessMatch;

import java.util.Scanner;

public class RandomGuessMatch {

    public static void main(String[] args) {
        int min = 1, max = 5;
        int random, user;
        boolean dif;

        Scanner input = new Scanner(System.in);

        user = input.nextInt();

        random = min + (int) (Math.random() * max);

        if (random == user) {
            dif = true;
        } else {
            dif = false;
        }

        System.out.println("Random number = " + random);
        System.out.println("User number = " + user);
        System.out.println("Random and User number is equal = " + dif);

        input.close();
    }
}