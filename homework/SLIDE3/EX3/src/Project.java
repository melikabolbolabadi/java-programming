import java.util.Scanner;
public class Project
{
    public  String str;
    public int index;
    char[] chr= {'0','1','2','3','4','5','6','7','8','9'};
    Scanner scanner=new Scanner(System.in);

    public void getstr()
    {
        System.out.println("string : ");
        str=scanner.nextLine();
    }
    public  int check()
    {
        for (int i=0;i<10;i++)
             index=str.indexOf(chr[i]);
        return index;
    }

    public void checkit(int a) throws CreatException
    {
        if (a==1)
         throw new CreatException("ERROR: number is not allowed! ");
        else if (a==2)
            System.out.println("OK: string length is "+str.length());
    }
}
