package app;

// This application displays some math facts
public class DebugThree2
{
   public static void main(String[] args)
   {
      int a = 2, b = 5, c = 10;
      add(a, b);
      add(b, c);
      subtract(c, a);            
   }
   public static void add(int number1 , int number2)
   {
      System.out.println("The sum of " + number1 + " and " + number2 + " is " + (number1 + number2 ) );
   }
   public static void subtract(int number1 , int number2 )
   {
      System.out.println("The difference between " + number1 + " and " + number2 + " is " + (number1 - number2) );
   }
}
