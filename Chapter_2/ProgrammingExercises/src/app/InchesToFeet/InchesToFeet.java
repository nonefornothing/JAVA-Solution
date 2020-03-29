package app.InchesToFeet;

public class InchesToFeet{

    public static void main(String[] args)
    {
        int inches=86,feet,mod;
        mod = inches%12;
        feet = inches/12;
        System.out.printf("%d inches becomes %d feet and %d inches",inches,feet,mod);

    }
}