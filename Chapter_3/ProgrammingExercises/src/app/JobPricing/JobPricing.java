package app.JobPricing;

import java.util.Scanner;

public class JobPricing{

    public static void main(String[] args){

        String jobName;
        int costMaterial,hourWork,hourTravel;

        Scanner input = new Scanner(System.in);

        System.out.println("Service that you request ");
        jobName = input.nextLine();
        System.out.println("total cost material that you needed ");
        costMaterial = input.nextInt();
        System.out.println("total hours needed for travel ");
        hourTravel = input.nextInt();
        System.out.println("total hours needed for work");
        hourWork = input.nextInt();      
        System.out.println("You request " + jobName + " service with total cost $" + computeCost(costMaterial, hourTravel, hourWork) );
        
        input.close();

    }

    public static int computeCost(int costMaterial, int hourTravel , int hourWork){
        return costMaterial+(hourTravel*12)+(hourWork*35);
    }
}