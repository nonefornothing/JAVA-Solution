package app.Sandwich;

import java.util.Scanner;

public class TestSandwich {

    public static void main(String[] args)
    {
        Sandwich customer1 = new Sandwich();
        Sandwich customer2 = new Sandwich();

        customer1 = getdata(customer1);
        customer2 = getdata(customer2);
        
        System.out.println("Customer order detail ");
        System.out.println("Sandwich with " + customer1.getMainIngredient() + " and " + customer1.getBreadType() + " for $" + customer1.getPrice());

        System.out.println("Customer order detail ");
        System.out.println("Sandwich with " + customer2.getMainIngredient() + " and " + customer2.getBreadType()
                + " for $" + customer2.getPrice());
    }

    public static Sandwich getdata(Sandwich s)
    {
        String mainIngredient;
        String breadType;
        double price;

        Scanner input = new Scanner(System.in);

        System.out.println("Main Ingredient = ");
        mainIngredient = input.nextLine();
        System.out.println("Type of bread = ");
        breadType = input.nextLine();
        System.out.println("Price = ");
        price = input.nextInt();
        s.setMainIngredient(mainIngredient);
        s.setBreadType(breadType);
        s.setPrice(price);
        return s;
        
        
    }

}