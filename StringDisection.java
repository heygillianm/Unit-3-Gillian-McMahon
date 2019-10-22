//
//Written by Nina Pejcinovic and Gillian McMahon
//

import java.util.*;
public class StringDisection {
  public static void main (String [] args) {

    Scanner scan = new Scanner(System.in);

    //Question asking for user input.
    System.out.println("Would you like to use the StringDisection?");
    System.out.println("'Y' for yes and 'N' for no");
    String answer = scan.nextLine();

    //Overall 'while' loop that keeps the program going until
    //the user tells it to stop
    while (answer.equals("Y")) {
      System.out.println("What is your word or sentence?");
      String input = scan.nextLine();

    //Receiving string length for later
    int lengthString = input.length();

    //Here is the vowels. Each one is an individual counter for a different
    //vowel. We used unicode values to rectrieve the vowel and 'for' statements
    //to stop once string is done. Each vowel has a counter.
    int count1 = 0;
    for (int i = 0; i < lengthString ; i++) {
        int a_count = input.charAt(i);
        final int a_unicode = 97;
      if (a_count == a_unicode) {
          count1++;
        }
    }

    int count2 = 0;
    for (int i = 0; i < lengthString ; i++) {
        int e_count = input.charAt(i);
        final int e_unicode = 101;
      if (e_count == e_unicode) {
          count2++;
        }
    }

    int count3 = 0;
    for (int i = 0; i < lengthString ; i++) {
      int i_count = input.charAt(i);
      final int i_unicode = 105;
    if (i_count == i_unicode) {
      count3++;
      }
    }

    int count4 = 0;
    for (int i = 0; i < lengthString ; i++) {
      int o_count = input.charAt(i);
      final int o_unicode =111;
      if (o_count == o_unicode) {
      count4++;
      }
    }

    int count5 = 0;
    for (int i = 0; i < lengthString ; i++) {
      int u_count = input.charAt(i);
      final int u_unicode =117;
    if (u_count == u_unicode) {
      count5++;
      }
    }


    int count6 = 0;
    for (int i = 0; i < lengthString ; i++) {
      int A_count = input.charAt(i);
      final int A_unicode =65;
    if (A_count == A_unicode) {
      count6++;
      }
    }

    int count7 = 0;
    for (int i = 0; i < lengthString ; i++) {
      int E_count = input.charAt(i);
      final int E_unicode =69;
    if (E_count == E_unicode) {
      count7++;
      }
    }

    int count8 = 0;
    for (int i = 0; i < lengthString ; i++) {
      int I_count = input.charAt(i);
      final int I_unicode =73;
    if (I_count == I_unicode) {
      count8++;
      }
    }

    int count9 = 0;
    for (int i = 0; i < lengthString ; i++) {
      int O_count = input.charAt(i);
      final int O_unicode =79;
    if (O_count == O_unicode) {
      count9++;
      }
    }

    int count10 = 0;
    for (int i = 0; i < lengthString ; i++) {
      int U_count = input.charAt(i);
      final int U_unicode =79;
    if (U_count == U_unicode) {
      count10++;
      }
    }

    String consonants = input.toLowerCase();
    int count11 = 0;
    for (int i = 0; i < lengthString; i++) {
      int consonant_count = consonants.charAt(i);
      int min = 98;
      int max = 122;
      int eLower = 101;
      int iLower = 105;
      int oLower = 111;
      int uLower = 117;
      int zLower = 122;
      int bLower = 98;
      // First determine if consonant is within range of all lowercase letters.
      //Then, checks to see if character is equal to value of lowercase vowel.
      //If the character is equal to vowel value, we know it's not a consonant.
    if (bLower <= consonant_count && consonant_count <= zLower
    && consonant_count != eLower&& consonant_count != iLower
    && consonant_count != oLower && consonant_count != uLower) {
        count11++;
      }
    }

    //Then, we had to count the spaces. We had a counter and 'for' statement
    //like previous procedures. Then, we count all the white spaces.
    int count12 = 0;
    for (int i =0; i < lengthString; i++) {
      int whiteSpace = input.charAt(i);
      if (whiteSpace == 32){
        count12++;
      }
    }

      int count13 = 0;
      for (int i=0; i< lengthString; i++){
        int punctuation=input.charAt(i);
        final int exclamation = 33;
        final int comma = 44;
        final int period = 46;
        final int questionMark = 63;
      // checks to see if character value is equal to any values of punctuation.
          if (punctuation == exclamation || punctuation==comma
          || punctuation==period
          || punctuation== questionMark){
            count13++;
          }
      }


    //Finally, print statements for the amount of times each of these
    //characters show up.
    System.out.println("number of times a shows up: "+ count1);
    System.out.println("number of times e shows up:"+ count2);
    System.out.println("number of times i shows up:"+ count3);
    System.out.println("number of times o shows up:"+ count4);
    System.out.println("number of times u shows up:"+ count5);
    System.out.println("number of times A shows up:"+ count6);
    System.out.println("number of times E shows up:"+ count7);
    System.out.println("number of times I shows up:"+ count8);
    System.out.println("number of times O shows up:"+ count9);
    System.out.println("number of times U shows up:"+ count10);
    System.out.println("number of times a consonant shows up:"+ count11);
    System.out.println("number of spaces that show up:" + count12);
    System.out.println("number of punctuation marks that show up:" + count13);

    //This is the end of the first while loop. When you say no, you exit
    //the while loop and the program is finished.
    System.out.println("Would you like to use again?");
    System.out.println("'Y' for yes and 'N' for no");
    answer = scan.nextLine();
    }
    System.out.println("Thank you");
  }
}
