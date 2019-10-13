import java.util.Scanner;

public class PalindromeTester
{
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("Would you like to enter a palindrome?");
    System.out.println("'y' for yes and 'n' for no");
    String answer = scan.nextLine();


    while (answer.equals("y")) {
      System.out.println("What is your palindrome?");
      String word = scan.nextLine();
      word = word.replaceAll("\\s","");
      word = word.replaceAll(",","");
      word = word.toLowerCase();
      int length = word.length();
      int forward = 0;
      int backward = length - 1;
      boolean isPalindrome = true;

      while (backward > forward) {
        char forwardChar = word.charAt(forward++);
        char backwardChar = word.charAt(backward--);

        if (forwardChar != backwardChar) {
          isPalindrome = false;
        }
      }
      if (isPalindrome) {
        System.out.println("That is a palindrome");
      } else {
        System.out.println("That is not a palindrome?");
      }
      System.out.println("Would you like to enter another palindrome?");
      System.out.println("'y' for yes and 'n' for no");
      answer = scan.nextLine();
    }
  }
}
