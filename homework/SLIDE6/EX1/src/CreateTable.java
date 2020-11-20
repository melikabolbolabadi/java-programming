import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTable
{
    public CreateTable() throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","melikabolbolabadi","melika");
        PreparedStatement preparedStatement=
                connection.prepareStatement("insert into users (id,username,password,email,grade,age) values (?,?,?,?,?,?)" );
        preparedStatement.setLong(1,1);
        preparedStatement.setString(2,"bolbolabadimelika");
        preparedStatement.setString(3,"ka_bl");
        preparedStatement.setString(4, "melikaboblolabadi3");
        preparedStatement.setString(5,"diploma");
        preparedStatement.setLong(6,19);
    }
}
