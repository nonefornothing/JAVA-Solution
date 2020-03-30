package app.MadLibs;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        String word1, word2, word3, word4, word5;

        Scanner input = new Scanner(System.in);
        System.out.println("Mary had a little .......");
        System.out.println("Its ........ was ....... as snow ");
        System.out.println("And everywhere that Mary ....... ");
        System.out.println("The ......... was sure to go.");

        System.out.println("Insert word respectively");
        word1 = input.nextLine();
        word2 = input.nextLine();
        word3 = input.nextLine();
        word4 = input.nextLine();
        word5 = input.nextLine();

        System.out.println("Mary had a little " + word1);
        System.out.println("Its " + word2 + " was " + word3 + " as snow ");
        System.out.println("And everywhere that Mary " + word4);
        System.out.println("The " + word5 + " was sure to go.");

        input.close();

    }
}