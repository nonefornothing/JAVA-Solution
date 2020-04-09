package app.FitnessTracker2;

import java.time.*;

public class FitnessTracker2 {

    private String fitnessActivity;
    private int minuteSpent;
    private LocalDate time;
    private String time2;

    LocalDate timeNow = LocalDate.now();

    public FitnessTracker2(){
        fitnessActivity = "running";
        minuteSpent = 0;
        time = LocalDate.of(timeNow.getYear(), 1, 1);
    }

    public FitnessTracker2(String fitnessActivity, int minuteSpent, LocalDate time){
        this.fitnessActivity = fitnessActivity;
        this.minuteSpent = minuteSpent;
        this.time = time;
    }

    public FitnessTracker2(String fitnessActivity, int minuteSpent, String time) {
        this.fitnessActivity = fitnessActivity;
        this.minuteSpent = minuteSpent;
        this.time2 = time;
    }

    public void setFitnessActivity(String fitnessActivity) {
        this.fitnessActivity = fitnessActivity;
    }

    public void setMinuteSpent(int minuteSpent) {
        this.minuteSpent = minuteSpent;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    /**
     * @param time2 the time2 to set
     */
    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getFitnessActivity() {
        return fitnessActivity;
    }

    public int getMinuteSpent() {
        return minuteSpent;
    }

    public LocalDate getTime() {
        return time;
    }

    /**
     * @return the time2
     */
    public String getTime2() {
        return time2;
    }

    public void displayData(String fitnessActivity, int minuteSpent, LocalDate time) {
        System.out.println("Minute spent for " + fitnessActivity + " is " + minuteSpent + " at " + time);
    }

    public void displayData(String fitnessActivity, int minuteSpent , String time2) {
        System.out.println("Minute spent for " + fitnessActivity + " is " + minuteSpent + " at " + time2);
    }

}