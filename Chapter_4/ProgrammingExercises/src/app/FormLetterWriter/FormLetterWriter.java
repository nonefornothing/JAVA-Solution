package app.FormLetterWriter;

public class FormLetterWriter {

    public static void main(String[] args){
        displaySalutation("Anas");
        displaySalutation("Anas","Riado");
    }


    public static void displaySalutation(String name){
        System.out.println("Dear Mr. or Ms. " + name);
    }

    public static void displaySalutation(String firstName, String lastName){
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order");
    }

}