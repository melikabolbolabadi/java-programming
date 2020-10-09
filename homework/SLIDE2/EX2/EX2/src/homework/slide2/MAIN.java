package homework.slide2;
import java.util.Scanner;

class lesson
{
    private Scanner scanner;
    public int z;
    public void recieve()
    {
        scanner = new Scanner(System.in);
        System.out.println("enter lesson name:\nwrite 1 for barnamenevisipishrafte\nwrite 2 for madarhaye electrici electronici\nwrite 3 for shabakehaye computer");
        z = scanner.nextInt();
    }
}
class pishniazha extends lesson
{
    public void pishniaz1()
    {
        System.out.println("pishniaz ha : riazi1 - mabani barname nevisi");
    }
    public void pishniaz2()
    {
        System.out.println("pishniaz ha : fizik2 ");
    }
    public void pishniaz3()
    {
        System.out.println("pishniaz ha :amar ehtemal mohandesi - memari computer");
    }
}
class hamniazha extends pishniazha
{
    public void hamniaz1()
    {
        System.out.println("hamniaz ha : kargah barname nevisi oishrafte");
    }
    public void hamniaz2()
    {
    System.out.println("hamniaz ha : moadelat difransiel - kargah madar elctrici electronici");
    }
    public void hamniaz3()
    {
    System.out.println("hamniaz ha : system haye amel - az shbke haye computer");
    }
}
public class MAIN {
    public static void main(String[] args)
    {
hamniazha ham= new hamniazha();
ham.recieve();
if (ham.z==1)
{
    ham.pishniaz1();
    ham.hamniaz1();
}
       else if (ham.z==2)
        {
            ham.pishniaz2();
            ham.hamniaz2();
        }
        else if (ham.z==3)
        {
            ham.pishniaz3();
            ham.hamniaz3();
        }
    }
}