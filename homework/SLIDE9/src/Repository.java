import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Repository
{
    protected Connection connection;
    protected PreparedStatement preparedStatement;
    public Repository() throws Exception
    {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","melikabolbolabadi","melika");
    }

    public void insertTable(UserEntity userEntity) throws Exception
    {
        preparedStatement=connection.prepareStatement("insert into userrss(id,username,password) values (?,?,?)");
        preparedStatement.setInt(1,userEntity.getId());
        preparedStatement.setString(2,userEntity.getUsername());
        preparedStatement.setString(3,userEntity.getPassword());

        preparedStatement.executeUpdate();
    }

    public void commit() throws Exception
    {
        connection.commit ();
    }
}
