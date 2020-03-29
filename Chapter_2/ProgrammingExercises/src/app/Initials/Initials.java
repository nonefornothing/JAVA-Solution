package app.Initials;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {
        char alias1, alias2, alias3;

        Scanner input = new Scanner(System.in);
        alias1 = input.next().charAt(0);
        alias2 = input.next().charAt(0);
        alias3 = input.next().charAt(0);
        ;

        System.out.printf("%c.%c.%c", alias1, alias2, alias3);
        input.close();
    }
}