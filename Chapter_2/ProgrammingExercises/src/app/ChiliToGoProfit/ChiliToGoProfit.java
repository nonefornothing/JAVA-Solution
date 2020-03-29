package app.ChiliToGoProfit;

import java.util.Scanner;

public class ChiliToGoProfit {

    public static void main(String[] args) {
        int adult, child, totalMeal;
        float adultMoney, childMoney, costAdult, costChild, profitAdult, profitChild;
        float totalProfit;

        Scanner input = new Scanner(System.in);

        System.out.println("How many adult meal ?");
        adult = input.nextInt();
        System.out.println("How many child meal ?");
        child = input.nextInt();

        adultMoney = adult * 7;
        childMoney = child * 4;
        totalMeal = adult + child;
        costAdult = (float) (adult * 4.35);
        costChild = (float) (child * 3.10);
        profitAdult = (float) adultMoney - costAdult;
        profitChild = (float) childMoney - costChild;
        totalProfit = profitAdult + profitChild;

        System.out.printf("You ordered %d adult meal with profit $ %.2f .\n", adult, profitAdult);
        System.out.printf("You ordered %d children meal with profit $ %.2f .\n", child, profitChild);
        System.out.printf("You ordered %d meal with profit $ %.2f .\n", totalMeal, totalProfit);

        input.close();
    }
}