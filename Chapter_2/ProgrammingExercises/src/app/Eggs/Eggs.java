package app.Eggs;

import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {
        int egg, mod, dozen;
        float money;

        Scanner input = new Scanner(System.in);

        egg = input.nextInt();
        mod = egg % 12;
        dozen = egg / 12;
        money = (float) ((float) dozen * 3.25 + (float) mod * 0.45);

        System.out.printf("You ordered %d eggs.\n", egg);
        System.out.printf("That’s %d dozen at $3.25 per dozen\n", dozen);
        System.out.printf("%d loose eggs at 45 cents each\n", mod);
        System.out.printf("for total of $%.2f\n", money);

        input.close();
    }
}