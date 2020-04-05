package app.Lease;

public class Lease {

    private String tenantName;
    private int apartementNumber, monthlyRent, month;

    public Lease(){
        tenantName = "XXX";
        apartementNumber = 0;
        monthlyRent = 1000;
        month = 12;
    }

    public void setTenantName(String name){
        tenantName = name;
    }

    public void setApartementNumber(int number) {
        apartementNumber = number;
    }

    public void setMonthlyRent(int rent) {
        monthlyRent = rent;
    }

    public void setMonth(int monthly){
        month = monthly;
    }

    public String getTenantName(){
        return tenantName;
    }

    public int getMonth() {
        return month;
    }

    public int getApartementNumber() {
        return apartementNumber;
    }

    public int getMonthlyRent() {
        return monthlyRent;
    }

    public void addPetFee(){
        monthlyRent = monthlyRent + 10;
    }

    public void explainPetPolicy() {
        System.out.println("Addition cost for pet is 10");
        System.out.println("Montly Free with pet " + monthlyRent );

    }

    public void showValues(){
        System.out.println("Name of Tenant = " + tenantName);
        System.out.println("Number of apartement = " + apartementNumber);
        System.out.println("Monthly Rent = " + monthlyRent);
        System.out.println("Month = " + month);
    }

    public void process() {
        showValues();
        addPetFee();
        explainPetPolicy();
    }
}