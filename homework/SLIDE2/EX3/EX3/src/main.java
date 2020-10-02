import java.util.Scanner;
interface myinteger
{
    void isNegative(int a);
    void isPosetive(int a);
    void isOdd(int a);
    void isEven(int a);
    void isZero(int a);
    void test();
    void check();
}
abstract class test implements myinteger
{
    public Scanner scanner;
public int num;
public void test()
{
    scanner=new Scanner(System.in);
    System.out.println("enter number : ");
    num=scanner.nextInt();
}
}
abstract class result extends test
{
    @Override
    public void isEven(int num)
    {
 System.out.println("it is even  ! ");
    }

    @Override
    public void isZero(int a)
    {
        System.out.println("it is zero  ! ");
    }

    @Override
    public void isNegative(int a)
    {
        System.out.println("it is negative  ! ");
    }

    @Override
    public void isPosetive(int a)
    {
        System.out.println("it is positive  ! ");
    }

    @Override
    public void isOdd(int a)
    {
        System.out.println("it is odd  ! ");
    }
}
class check extends result
{
    public void check()
    {
        if (num > 0) {
            isPosetive(num);
            if (num % 2 == 0) isEven(num);
            else if (num % 2 != 0) isOdd(num);
        }
        else if (num < 0)isNegative(num);

        else if (num == 0) {
            isZero(num);
            isEven(num);
        }
    }
}
public class main
{
    public static void main(String[] args)
    {
myinteger ch=new check();
ch.test();
ch.check();
    }
}
