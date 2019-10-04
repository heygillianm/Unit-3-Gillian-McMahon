import java.util.Scanner;

public class MinOfThree {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Please give three numbers (no decimals!):");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();

    if((num1 <= num2)&& num1 < num3 )
      System.out.println("Smallest number is " + num1);
    else if ((num2 <= num1) && num2 < num3)
      System.out.println("Smallest number is " + num2);
    else 
      System.out.println("Smallest number is " + num3);
  }
}
