import java.util.Scanner;
import java.text.DecimalFormat;

public class WinPercentage
{
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat dec = new DecimalFormat(".#");
    

    System.out.println("Enter number of games played:");
    int played = scan.nextInt();
    System.out.println("Enter number of games won:");
    int won = scan.nextInt();

    while (played < 0 || won > played || won < 0)
    {
      if (won > played)
      {
        System.out.println("Games won must be less than total games played");
      }
      if (played < 0)
      {
        System.out.println("Total number of games played must be greater than 0");
      }
      if (won < 0)
      {
        System.out.println("Total number of gams won must be greater than 0");
      }
      System.out.println("Enter number of games played:");
      played = scan.nextInt();
      System.out.println("Enter number of games won:");
      won = scan.nextInt();
    }
      double finalWin = (double) won/played *100;
      System.out.println("Your winning percentage is: " + dec.format(finalWin) + "%");
  }
}
