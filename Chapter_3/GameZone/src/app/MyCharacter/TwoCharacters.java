package app.MyCharacter;

import java.util.Scanner;

public class TwoCharacters {

    public static void main(String[] args){

        MyCharacter Monster1 = new MyCharacter();
        MyCharacter Monster2 = new MyCharacter();

        System.out.println("Please enter information of Monter1");
        Monster1 = getData(Monster1);
        System.out.println("Monter1 with detail ");
        Monster1.displayDetail();

        System.out.println("");

        System.out.println("Please enter information of Monter2");
        Monster2 = getData(Monster2);
        System.out.println("Monter2 with detail ");
        Monster2.displayDetail();

    }

    public static MyCharacter getData(MyCharacter c){

        String monsterColor;
        int eye,lives;

        Scanner input = new Scanner(System.in);

        System.out.println("What eye color monster do you want creaete ");
        monsterColor = input.nextLine();
        System.out.println("How many eye monster do you want create ");
        eye = input.nextInt();
        System.out.println("How many lives monster do you want create ");
        lives = input.nextInt();

        c.setColor(monsterColor);
        c.setEyeNumber(eye);
        c.setLivesNumber(lives);
        return c;
    }

}