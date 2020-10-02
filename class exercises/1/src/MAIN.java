import java.util.Scanner;
abstract class character
{
abstract void student();
abstract void teacher();
abstract void employee();
abstract void recieve();
abstract void check();
}



  abstract class student extends character {
public void student(){System.out.println("he/she is student !! ");}
}
 abstract class teacher extends student
{
    public void teacher(){System.out.println("he/she is teacher !! ");}
}
 abstract class employee extends teacher
{
    public void employee(){System.out.println("he/she is employee !! ");}
}
abstract class recieve extends  employee{
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
 class check extends recieve
{
    public void check()
    {
        for (i=0;i<5;i++)
        {
            if (namechecker==name[i])
            {
                if (num[i]==1)student();
                else if (num[i]==2)teacher();
                else if (num[i]==3) employee();
            }
        }

    }
}
public class MAIN
{
    public static void main(String[] args)
    {
character ch=new check();
ch.recieve();
ch.check();
    }
}
