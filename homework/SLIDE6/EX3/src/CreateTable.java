import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CreateTable
{
    public CreateTable() throws Exception
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" how many student ? : ");
        int n=scanner.nextInt();
        int[] id=new int[n];
        String[] fullname=new String[n];
        int[] yearr=new int[n];
        float[] average=new float[n];

        for (int i=0;i<n;i++)
        {
            i++;
            System.out.println("*** student "+ i +" information : ");
            i--;
            id[i]=i+1;
            fullname[i]=scanner.next();
            yearr[i]=scanner.nextInt();
            average[i]=scanner.nextFloat();
        }

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","melikabolbolabadi","melika");
        PreparedStatement preparedStatement= connection.prepareStatement("insert into students (id,fullname,yearr,average) values (?,?,?,?)" );
          for (int i=0 ; i<n ;i++)
        {
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, fullname[i]);
                preparedStatement.setInt(3, yearr[i]);
                preparedStatement.setFloat(4, average[i]);
        }
        preparedStatement.executeUpdate();

    }
}
