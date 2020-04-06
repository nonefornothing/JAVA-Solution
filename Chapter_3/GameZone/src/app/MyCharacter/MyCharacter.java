package app.MyCharacter;

public class MyCharacter {

    private String color;
    private int eyeNumber;
    private int livesNumber;

    public MyCharacter(){
        color = "black";
        eyeNumber = 6;
        livesNumber = 1; 
    }

    public void setColor(String monsterColor){
        color = monsterColor;
    }

    public void setEyeNumber(int eye){
        eyeNumber = eye;
    }

    public void setLivesNumber(int lives){
        livesNumber = lives;
    }

    public String getColor(){   
        return color;
    }

    public int getEyeNumber(){
        return eyeNumber;
    }

    public int getLivesNumber(){
        return livesNumber;
    }

    public void displayDetail(){
        System.out.println("Eye's Color " + eyeNumber);
        System.out.println("Eye's Number " + eyeNumber);
        System.out.println("Number of Life " + livesNumber);
    }

}