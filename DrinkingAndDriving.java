import java.util.Scanner;
public class DrinkingAndDriving{
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your age?");
    int age = scan.nextInt();

    if (age >= 21)
      System.out.println("You're old enough to drink and to drive");
    else if (age >= 17)
      System.out.println("You can drive but not drink");
    else if (age < 17)
      System.out.println("You cannot drink or drive");
  }
}
