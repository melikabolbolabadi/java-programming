import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteTable
{
    public DeleteTable() throws Exception
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("which eployee info do you want delete? ");
        int m=scanner.nextInt();
        if (m>2)
            System.out.println("employee with this number doesnt exist! ");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","melikabolbolabadi","melika");
        PreparedStatement preparedStatement=connection.prepareStatement("delete from employees where id=?");
        preparedStatement.setInt(1,m);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
}
