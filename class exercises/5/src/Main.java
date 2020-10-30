import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter : ");
        String str = scanner.next();
        int a=Integer.parseInt(String.valueOf(str.charAt(0)));
        int b=Integer.parseInt(String.valueOf(str.charAt(2)));

        CalcFactory calcFactory=new CalcFactory();

        Calculator cal1=CalcFactory.getCalc(str);
        System.out.println(cal1.calc(a,b));

    }
}
