package app.QuartsToGallons;

public class QuartsToGallons{

    public static void main(String[] args)
    {
        int quarts=18,gallons,mod;
        gallons = quarts/4;
        mod = 18%4;
        System.out.printf("A job that needs %d quarts requires %d gallons plus %d quarts.",quarts,gallons,mod);
    }
}