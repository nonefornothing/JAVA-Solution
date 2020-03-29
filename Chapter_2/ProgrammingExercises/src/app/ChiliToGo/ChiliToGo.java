package app.ChiliToGo;

import java.util.Scanner;

public class ChiliToGo {

    public static void main(String[] args) {
        int adult, child;
        int adultMoney,childMoney,totalMoney,totalMeal;

        Scanner input = new Scanner(System.in);

        System.out.println("How many adult meal ?");
        adult = input.nextInt();
        System.out.println("How many child meal ?");
        child = input.nextInt();

        adultMoney = adult * 7;
        childMoney = child * 4;
        totalMeal = adult + child;
        totalMoney = adultMoney + childMoney;

        System.out.printf("You ordered %d adult meal with cost $ %d.\n", adult,adultMoney);
        System.out.printf("You ordered %d children meal with cost $ %d.\n", child,childMoney);
        System.out.printf("You ordered %d meal with cost $ %d.\n", totalMeal,totalMoney);

        input.close();
    }
}