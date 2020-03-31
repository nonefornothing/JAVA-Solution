package app.CallMethodFromAnotherPackage;

import app.ParadiseDaySpa.ParadiseInfo;

public class Test {
    public static void main(String[] args) {
        System.out.println("Calling method from another class:");
        ParadiseInfo.displayInfo();
        }
}