import java.util.Scanner;
public class SetInfo
{
    Scanner scanner=new Scanner(System.in);
     String username;
     String realname;
     String password;
     String address;
     String grade;
     String phonenumber;
     int age;
     public void information()
     {
         System.out.println("username: ");
         username=scanner.nextLine();
         System.out.println("realname: ");
         realname=scanner.nextLine();
         System.out.println("password contain letters and numbers: ");
         password=scanner.nextLine();
         System.out.println("address: ");
         address=scanner.nextLine();
         System.out.println("grade: ");
         grade=scanner.next();
         System.out.println("phone number: ");
         phonenumber=scanner.next();
         System.out.println("age : ");
         age=scanner.nextInt();
     }
     public void printinfo()
     {
         BuilderCreat bldrcrt= new BuilderCreat.Builder(username)
                 .setname(realname)
                 .setpass(password)
                 .setaddress(address)
                 .setgrade(grade)
                 .setphone(phonenumber)
                 .setage(age)
                 .Build();
         System.out.println(" the user information: "+bldrcrt);

     }
}
