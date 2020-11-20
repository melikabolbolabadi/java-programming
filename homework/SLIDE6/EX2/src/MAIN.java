import java.util.Scanner;

public class MAIN
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner=new Scanner(System.in);
        CreateTable createTable=new CreateTable();
System.out.println("do you need to delete som information? 1.yes 2.no : ");
int v=scanner.nextInt();
if (v==1)
{
    DeleteTable deleteTable=new DeleteTable();

}
    }
}
