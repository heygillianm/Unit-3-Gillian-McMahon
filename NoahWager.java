import java.util.Scanner;

public class NoahWager {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("How much do I love Noah Wager?");
    int loveamount = scan.nextInt();
    System.out.println("Eh, close enough");

    for (int hearts = 1; hearts <= loveamount; hearts++){
      System.out.println("I love you " + hearts);
    }
    System.out.println("Yours truly, Gillian");
  }
}
