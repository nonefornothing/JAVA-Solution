package app.Dollars;

import java.util.Scanner;

public class Dollars {

    public static void main(String[] args) {

        int dollar,twenty,ten,five,cent;

        Scanner input = new Scanner(System.in);

        System.out.println("How many dollar do you have?");
        dollar = input.nextInt();

        cent = dollar * 100;
        twenty = cent / 20; 
        ten = cent / 10;
        five = cent /5;

        System.out.printf("%d dollar = %d (20cent) = %d (10cent) = %d (5cent) = %d (1cent)", dollar,twenty,ten,five,cent);

        input.close();
    }
}