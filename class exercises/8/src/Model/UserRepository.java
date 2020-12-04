package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserRepository
{
    protected Connection connection;
    protected PreparedStatement preparedStatement;
    public UserRepository() throws Exception
    {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","melikabolbolabadi","melika");
    }

    public void insertTable(UserEntity userEntity) throws Exception
    {
        preparedStatement=connection.prepareStatement("insert into userrss(id,fullname,username,password,email) values (?,?,?,?,?)");
        preparedStatement.setInt(1,userEntity.getId());
        preparedStatement.setString(2,userEntity.getFullname());
        preparedStatement.setString(3,userEntity.getUsername());
        preparedStatement.setString(4,userEntity.getPassword());
        preparedStatement.setString(5,userEntity.getEmail());
        preparedStatement.executeUpdate();
    }

    public void update(UserEntity userEntity) throws Exception
    {
        preparedStatement=connection.prepareStatement("update userrss set fullname =? , username=?,password=?,email=? where id=? ");

        preparedStatement.setString(1,userEntity.getFullname());
        preparedStatement.setString(2,userEntity.getUsername());
        preparedStatement.setString(3,userEntity.getPassword());
        preparedStatement.setString(4,userEntity.getEmail());
        preparedStatement.setInt(5,userEntity.getId());
        preparedStatement.executeUpdate();
    }

    public void delete(int id) throws Exception{
        preparedStatement=connection.prepareStatement ("DELETE FROM userrss WHERE id=?");
        preparedStatement.setInt (1,id);
        preparedStatement.executeUpdate ();
    }

    public List<UserEntity> select() throws Exception{
        UserEntity userEntity=new UserEntity();
        preparedStatement=connection.prepareStatement ("select *from userrss");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<UserEntity> userEntityList=new ArrayList<>();
        while (resultSet.next ())
        {
            userEntity.setId (resultSet.getInt ("id"));
            userEntity.setFullname (resultSet.getString ("name"));
            userEntity.setUsername (resultSet.getString ("family"));
            userEntity.setPassword (resultSet.getString ("salary"));
            userEntity.setEmail (resultSet.getString ("salary"));

            userEntityList.add (userEntity);
        }
        return userEntityList;
    }

    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }
}

