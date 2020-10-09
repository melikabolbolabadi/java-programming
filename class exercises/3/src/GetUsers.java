import java.util.Scanner;
 abstract class GetUsers implements project
 {
        String name1,name2,family1,family2;
       public int age1,age2;
        public Scanner scanner=new Scanner(System.in);
        public void getuser1info()
        {
            System.out.println("enter your info \n name: ");
            name1=scanner.next();
            System.out.println("family: ");
            family1=scanner.next();
            System.out.println("age: ");
            age1=scanner.nextInt();
        }
        public void getuser2info()
        {
            System.out.println("enter your info \n name: ");
            name2=scanner.next();
            System.out.println("family: ");
            family2=scanner.next();
            System.out.println("age: ");
            age2=scanner.nextInt();
        }


    }
