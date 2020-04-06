package app.PlayingCard;

import java.util.Scanner;

public class PickTwoCards {

    public static void main(String[] args)
    {
        Card player1 = new Card();
        Card player2 = new Card();

        player1 = getData(player1);
        System.out.println("player 1 have " + player1.getCardType() + player1.getNumber() + " card");
        player2 = getData(player2);
        System.out.println("player 2 have " + player2.getCardType() + player2.getNumber() + " card");

    }

    public static Card getData(Card c){

        char cardType;
        int myValue;
        final int CARDS_IN_SUIT = 13;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter type of card ");
        cardType = input.next().charAt(0);
        myValue = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);

        System.out.println("Your car is " + cardType + myValue);
        c.setCardType(cardType);
        c.setNumber(myValue);
        return c;

    }

}