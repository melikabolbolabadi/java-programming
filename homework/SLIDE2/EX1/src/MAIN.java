import java.util.Scanner;
class calculator
{
    private int num1,num2;
    private Scanner scanner;
    public int n;
    public int result;
    public void recieve()
    {
        scanner = new Scanner(System.in);
        System.out.println("enter first and second number: ");
        num1=scanner.nextInt();num2=scanner.nextInt();
        System.out.println("enter 1for+ or 2for- or 3for* or 4for/ ");
        n=scanner.nextInt();
    }

    public int pluss()
    {
        return this.num1+this.num2;
    }
    public  int minus()
    {
        return this.num1-this.num2;
    }
    public int firstnum()
    {
        return this.num1;
    }
    public int secondnum()
    {
        return this.num2;
    }
}

class calcu extends calculator
{
   public calcu()
   {
       super();
   }
   public int Multiplication()
   { return this.firstnum()*this.secondnum(); }
   public int Division()
   {
       if (this.firstnum()==0)
           return 0;
       else
       return this.firstnum()/this.secondnum();}
   }

public class MAIN
{
    public static void main(String[] args)
    {
        calcu calcu = new calcu();
        calcu.recieve();
        if (calcu.n == 1) {
            calcu.result = calcu.pluss();
            System.out.println(calcu.result);
        }
       else if (calcu.n == 2) {
            calcu.result = calcu.minus();
            System.out.println(calcu.result);
        }
       else if (calcu.n == 3) {
            calcu.result = calcu.Multiplication();
            System.out.println(calcu.result);
        }
       else if (calcu.n== 4){
            calcu.result = calcu.Division();
            System.out.println(calcu.result);
        }
        }

    }
