import java.util.Scanner;

public class QuickProgram
{
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter an integer (no decimals!): ");
    int input = scan.nextInt();
    int oddnumbers = 0;
    int evennumbers = 0;

    for (int i = 1; i <= Integer.toString(input).length(); i++)
    {
      if (i % 2 == 0)
      {
        evennumbers++;
      }
      else
        oddnumbers++;
      }
  

    System.out.println("Number of odd numbers: " + oddnumbers);
    System.out.println("Number of even numbers: " + evennumbers);
    System.out.println("Number of zeroes: " );
  }
}
