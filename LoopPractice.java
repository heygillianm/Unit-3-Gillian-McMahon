public class LoopPractice
{
  public static void main (String [] args)
  {
    for (int i = 1; i < 5; i++)
    {
      if (i == 2)
        continue;
      System.out.print(i + "");
    }
  }
}
