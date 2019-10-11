import java.util.Scanner;
import java.util.DecimalFormat;

public class WinPercentage
{
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter number of games played:");
    int played = scan.nextInt();
    System.out.println("Enter number of games won:");
    int won = scan.nextInt();

    while (int == played && int == won)
    {
      double finalWin = ((won/played) * 100);
      System.out.println("Your winning percentage is: " + finalWin);
    }

  }
}
