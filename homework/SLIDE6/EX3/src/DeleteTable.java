import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteTable
{
    public DeleteTable() throws Exception
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("which one deleted ? : ");
        int o=scanner.nextInt();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","melikabolbolabadi","melika");
        switch (o)
        {
            case 1:
                PreparedStatement preparedStatement=connection.prepareStatement("delete from students where id=?");
                preparedStatement.setInt(1,o);
                preparedStatement.executeUpdate();
                preparedStatement.close();
            case 2:
                preparedStatement = connection.prepareStatement("delete from students where id=?");
                preparedStatement.setInt(1,o);
                preparedStatement.executeUpdate();
                preparedStatement.close();
            case 3:
                preparedStatement = connection.prepareStatement("delete from students where id=?");
                preparedStatement.setInt(1,o);
                preparedStatement.executeUpdate();
                preparedStatement.close();
        }
    }
}

