package app.FitnessTracker;

import java.time.*;

public class FitnessTracker {

    private String fitnessActivity;
    private int minuteSpent;
    public int year;
    private LocalDate time;

    LocalDate timeNow = LocalDate.now();


    public FitnessTracker(){
        fitnessActivity = "running";
        minuteSpent = 0;
        time = LocalDate.of(timeNow.getYear(), 1 ,1);
    }

    public void setFitnessActivity(String fitnessActivity){
        this.fitnessActivity = fitnessActivity;
    }

    public void setMinuteSpent(int minuteSpent){
        this.minuteSpent = minuteSpent;
    }

    public void setTime(LocalDate time ){
        this.time = time;
    }

    public String getFitnessActivity(){
        return fitnessActivity;
    }

    public int getMinuteSpent(){
        return minuteSpent;
    }

    public LocalDate getTime(){
        return time;
    }

    public void displayData(){
        System.out.println("Minute spent for "+ fitnessActivity + " is " + minuteSpent + " at " + time);
    }

}