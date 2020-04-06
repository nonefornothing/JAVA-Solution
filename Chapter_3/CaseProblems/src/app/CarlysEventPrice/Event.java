package app.CarlysEventPrice;

public class Event {

    private final int priceGuest = 35;
    private final int cutOff = 50;
    private String eventNumber;
    private int totalGuest;
    private int price;

    /**
     * @param eventNumber the eventNumber to set
     */
    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    /**
     * @param totalGuest the totalGuest to set
     */
    public void setTotalGuest(int totalGuest) {
        price = totalGuest * priceGuest;
        this.totalGuest = totalGuest;
    }

    /**
     * @return the eventNumber
     */
    public String getEventNumber() {
        return eventNumber;
    }

    /**
     * @return the totalGuest
     */
    public int getTotalGuest() {
        return totalGuest;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

}