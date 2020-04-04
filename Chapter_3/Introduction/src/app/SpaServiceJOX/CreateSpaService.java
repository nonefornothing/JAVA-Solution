package app.SpaServiceJOX;

import java.util.Scanner;

public class CreateSpaService {

    String service;
    double price;
    public static void main(String[] args){

        SpaService customer1 = new SpaService();
        SpaService customer2 = new SpaService();
        
        customer1 = getData(customer1);
        customer2 = getData(customer2);

        System.out.println("First service details:" + customer1.getServiceDescription() + customer1.getPrice());
        System.out.println("Second service details:" + customer2.getServiceDescription() + customer2.getPrice());
    }


    public static SpaService getData(SpaService spa)
    {
        String service;
        double price;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter service >> ");
        service = input.nextLine();
        System.out.println("Enter price >> ");
        price = input.nextInt();
        spa.setPrice(price);
        spa.setServiceDescription(service);
        return spa;
    }
}