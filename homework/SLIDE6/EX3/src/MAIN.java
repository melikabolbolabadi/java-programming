import java.util.Scanner;

public class MAIN
{
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        CreateTable createTable=new CreateTable();
        System.out.println("wanna updated? 1.yes 2.no");
        int n=scanner.nextInt();
        if (n==1)
        {
            UpdateTable updateTable=new UpdateTable();
        }
        System.out.println("wanna deleted? 1.yes 2.no");
        int m=scanner.nextInt();
        if (m==1)
        {
            DeleteTable deleteTable=new DeleteTable();
        }

    }
}
