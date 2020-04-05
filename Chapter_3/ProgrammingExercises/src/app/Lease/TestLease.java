package app.Lease;

import java.util.Scanner;

public class TestLease {

 //   public String tenantName;
    // public int apartementNumber, monthlyRent, month;
    public static void main(String[] args)
    {

        Lease customer1 = new Lease();
        Lease customer2 = new Lease();
        Lease customer3 = new Lease();
        Lease customer4 = new Lease();
        
        customer1 = getData(customer1);
        customer2 = getData(customer2);
        customer3 = getData(customer3);

        
        customer1.process();
        customer2.process();
        customer3.process();
        customer4.process();
    }


    public static Lease getData(Lease l)
    {
        String tenantName;
        int apartementNumber, monthlyRent, month;

        Scanner input = new Scanner(System.in);

        System.out.println("Name of Tenant = ");
        tenantName = input.nextLine();
        System.out.println("Number of apartement = ");
        apartementNumber = input.nextInt();
        System.out.println("Monthly Rent = ");
        monthlyRent = input.nextInt();
        System.out.println("Month = ");
        month = input.nextInt();

        l.setTenantName(tenantName);
        l.setApartementNumber(apartementNumber);
        l.setMonthlyRent(monthlyRent);
        l.setMonth(month);
        return l;
    }

}