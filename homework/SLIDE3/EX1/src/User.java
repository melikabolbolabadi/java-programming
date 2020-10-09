import java.util.Scanner;
public class User
{
    Scanner scanner=new Scanner(System.in);
   public String name="MelikaBolbolabadi";
        String name1;
    public String username="memelikaka",username1;
    public String password="123456",password1;
    public void getname()
    {
        System.out.println("enter FULLname: ");
        name1=scanner.next();
    }
    public void getusername()
    {
        System.out.println("enter USERname: ");
        username1=scanner.next();
    }
    public void getpassword()
    {
        System.out.println("enter PASSword: ");
        password1=scanner.next();
    }
}

