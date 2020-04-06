package app.SammysRentalPrice;

public class Rental {

    public final static int numberMinuteInHour = 60;
    public final static int hourlyRentalRate = 40;
    private String contractNumber;
    private int hour;
    private int minute;
    private int price;

    /**
     * @param contractNumber the contractNumber to set
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    /**
     * @param hour the hour to set
     */
    public void setHourAndMinutes(int totalMinute) {
        this.hour = totalMinute / 60;
        this.minute = totalMinute % 60;
        this.price = this.minute + (40 * this.hour);
    }

    /**
     * @return the contractNumber
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

}