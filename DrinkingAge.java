import java.util.Scanner;

public class DrinkingAge
{
  public static void main (String [] args)
  {
    Scanner scan = new Scanner ();

    System.out.println("What is your age?");
    int age = scan.nextInt();

    if (age >= 21) {
      System.out.println("You are old enough to drink");
    }
    else {
      System.out.println("You are not old enough to drink");
    }
  }
}
