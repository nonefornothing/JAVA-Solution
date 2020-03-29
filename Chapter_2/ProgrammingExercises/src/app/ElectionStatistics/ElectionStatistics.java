package app.ElectionStatistics;

import java.util.Scanner;

public class ElectionStatistics {

    public static void main(String[] args) {

        String party1, party2, party3;
        int totalVoteParty1, totalVoteParty2, totalVoteParty3, totalvoter;
        float percentageParty1, percentageParty2, percentageParty3;

        Scanner input = new Scanner(System.in);

        System.out.println("What is name of party1 ");
        party1 = input.nextLine();
        System.out.println("How many voters party1 receive ?");
        totalVoteParty1 = input.nextInt();

        input.nextLine();

        System.out.println("What is name of party2 ");
        party2 = input.nextLine();
        System.out.println("How many voters party2 receive ?");
        totalVoteParty2 = input.nextInt();

        input.nextLine();

        System.out.println("What is name of party3 ");
        party3 = input.nextLine();
        System.out.println("How many voters party3 receive ?");
        totalVoteParty3 = input.nextInt();

        totalvoter = totalVoteParty1 + totalVoteParty2 + totalVoteParty3;
        percentageParty1 = ((float) totalVoteParty1 / totalvoter) * 100;
        percentageParty2 = ((float) totalVoteParty2 / totalvoter) * 100;
        percentageParty3 = ((float) totalVoteParty3 / totalvoter) * 100;

        System.out.printf("Total voters in %s party is %d with percentage %.2f %%\n", party1, totalVoteParty1,
                percentageParty1);
        System.out.printf("Total voters in %s party is %d with percentage %.2f %%\n", party2, totalVoteParty2,
                percentageParty2);
        System.out.printf("Total voters in %s party is %d with percentage %.2f %%\n", party3, totalVoteParty3,
                percentageParty3);
        input.close();
    }
}