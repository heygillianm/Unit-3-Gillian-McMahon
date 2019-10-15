import java.util.Scanner;

public class OneChar
{
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Give a word: ");
    String input = scan.nextLine();

    for (int index = 0; index < input.length(); index++)
    {
      System.out.println(input.charAt(index));
    }
  }
}
