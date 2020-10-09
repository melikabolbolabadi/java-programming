import java.util.Scanner;
public class Project
{
    public  String str;
    char[] chr= {'0', '1', '2','3','4','5','6','7','8','9'};
    Scanner scanner=new Scanner(System.in);

    public void getstr()
    {
        System.out.println("string : ");
        str=scanner.nextLine();
    }
    public  int check()
    {
int a=0;
        for (int i=0;i<str.length();i++)

            {
                if (str.charAt(i)==chr[i])
                {
                    a=1;
break;
                }

                else{a=2; }

            }

            return a;
    }

    public void checkit(int a) throws CreatException
    {
        if (a==1)
         throw new CreatException("ERROR: number is not allowed! ");
        else if (a==2)
            System.out.println("OK: string length is "+str.length());
    }
}
