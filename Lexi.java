import java.util.*;
public class Lexi {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.println("Would you like to use the StringDisection?");
      System.out.println("'Y' for yes and 'N' for no");
      String answer = scan.nextLine();


      while (answer.equals("Y")) {
        System.out.println("What is your word or sentence?");
        String input = scan.nextLine();

      int count11 = 0;
      int lengthString = input.length();
      for (i = 0; i < lengthString; i++) {
        char ch = consonants.charAt(i);
        if ((ch >= 'b' && ch <= 'z')) {
          count11++;
        }
      }
        System.out.println("number of times a consonant shows up:"+ count11);
    }
  }
}
