import java.util.Scanner;
interface character
{
void student();
void teacher();
void employee();
void recieve();
}
abstract class recieve extends character
{
    public String name[]=new String[5];
    public String namechecker;
    public int num[]=new int[5];
    public int i;
    private Scanner scanner=new Scanner(System.in);
    public void recieve()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("enter person,s name : ");
            name[i]=scanner.next();
            System.out.println("enter 1 if he/she is student\nenter 2 if he/she is teacher\nenter 3 if he/she is employee: ");
            num[i]=scanner.nextInt();
        }
    }

}


abstract class student implements character
{
public void student(){System.out.println("he/she is student !! ");}
}
abstract class teacher implements character
{
    public void teacher(){System.out.println("he/she is teacher !! ");}
}
abstract class employee implements character
{
    public void employee(){System.out.println("he/she is employee !! ");}
}
public class MAIN
{
    public static void main(String[] args)
    {

    }
}
