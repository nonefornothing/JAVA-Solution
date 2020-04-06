package app.PlayingCard;

public class Card {

    // s for spades, h for hearts, d for diamonds, c for clubs
    private char cardType; 
    private int number;

    /**
     * @param cardType the cardType to set
     */
    public void setCardType(char cardType) {
        this.cardType = cardType;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the cardType
     */
    public char getCardType() {
        return cardType;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }    

}