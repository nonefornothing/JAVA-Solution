package app.Billing;

public class Billing {

     public static void main(String[] args) {
        System.out.println(computeBill(30));
        System.out.println(computeBill(40, 40));
        System.out.println(computeBill(40,50,20));  
    }

    public static double computeBill(double price){
        return price+ (double)price*8/100;
    }

    public static double computeBill(int price,int quantity) {
        int totalBill = price*quantity; 
        return totalBill +(double)totalBill*8/100;
    }

    public static double computeBill(int price, int quantity, int coupon) {
        int totalBill = price * quantity;
        int totalBillWithCoupon = totalBill - coupon;
        return totalBill + (double) totalBillWithCoupon * 8 / 100;
    }
}