package app.BloodData;

import java.util.Scanner;

public class TestBloodData {

        public static void main(String[] args) {
        
        BloodData customer = new BloodData();
        displayData(customer);
        getData(customer);
        displayData(customer);

    }

    
    public static BloodData getData(BloodData b){
        Scanner input = new Scanner(System.in);

        char bloodType;
        char rhFactor;
        System.out.println("Input your blood type ");
        bloodType = input.next().charAt(0);
        System.out.println("Input your RH Factor type");
        rhFactor = input.next().charAt(0);
        b.setBloodType(bloodType);
        b.setRhFactor(rhFactor);
        return b;
    }

    public static void displayData(BloodData b){
        System.out.println(b.getBloodType());
        System.out.println(b.getRhFactor());
    }

}