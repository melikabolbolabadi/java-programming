import java.util.Scanner;

public class CalcPlus implements Calculator
{
    Scanner scanner=new Scanner(System.in);

    @Override
    public int calc(int a, int b)
    {
      return a+b;
    }
}
