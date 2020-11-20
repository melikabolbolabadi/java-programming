import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateTable
{
    public UpdateTable() throws Exception
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("which student update? : ");
        int o=scanner.nextInt();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","melikabolbolabadi","melika");
        switch (o)
        {
            case 1:
                PreparedStatement preparedStatement = connection.prepareStatement(" update students set fullname=? where id=? ");
                preparedStatement.setString(1, "updated-fullname");
                preparedStatement.setLong(2, 1);
                preparedStatement = connection.prepareStatement(" update students set yearr=? where id=? ");
                preparedStatement.setString(1, "updated-year");
                preparedStatement.setLong(2, 1);
                preparedStatement = connection.prepareStatement(" update students set average=? where id=? ");
                preparedStatement.setString(1, "updated-avrage");
                preparedStatement.setLong(2, 1);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
            case 2:
                preparedStatement = connection.prepareStatement(" update students set fullname=? where id=? ");
                preparedStatement.setString(1, "updated-fullname");
                preparedStatement.setLong(2, 2);
                preparedStatement = connection.prepareStatement(" update students set yearr=? where id=? ");
                preparedStatement.setString(1, "updated-year");
                preparedStatement.setLong(2, 2);
                preparedStatement = connection.prepareStatement(" update students set average=? where id=? ");
                preparedStatement.setString(1, "updated-avrage");
                preparedStatement.setLong(2, 2);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
            case 3:
                preparedStatement = connection.prepareStatement(" update students set fullname=? where id=? ");
                preparedStatement.setString(1, "updated-fullname");
                preparedStatement.setLong(2, 3);
                preparedStatement = connection.prepareStatement(" update students set yearr=? where id=? ");
                preparedStatement.setString(1, "updated-year");
                preparedStatement.setLong(2, 3);
                preparedStatement = connection.prepareStatement(" update students set average=? where id=? ");
                preparedStatement.setString(1, "updated-avrage");
                preparedStatement.setLong(2, 3);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
        }
    }
}
