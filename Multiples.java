import java.util.Scanner;

public class Multiples
{
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("Find multiples of a number!"); // title

    System.out.println("Please enter a positive integer:"); //ask user
    int posInt = scan.nextInt();
    while ( posInt <= 0) //validate input
    {
      System.out.println("That is not a positive integer, try again.");
      System.out.println("Please enter a positive integer:");
      posInt = scan.nextInt();
    }

    System.out.println("Please enter an upper limit: "); //ask user
    int upperLim = scan.nextInt();
    while (upperLim < posInt)//validate input
    {
      System.out.println("Error: Upper limit must be greater than postive integer");
      System.out.println("Please enter an upper limit: ");
      upperLim = scan.nextInt();
    }

    for (int i = posInt; i <= upperLim; i += posInt) //figure out multiples.
    {
      System.out.print(i + " "); //upperlim stops the loop
      counter++;
    }
  }
}
