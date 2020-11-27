package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserRepos
{
    protected Connection connection;
    protected PreparedStatement preparedStatement;
    public UserRepos() throws Exception
    {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","melikabolbolabadi","melika");
    }

    public void insertTable(UserEntity userEntity) throws Exception
    {
        preparedStatement=connection.prepareStatement("insert into usserrs(id,username,password,currvol,newvol,currbill,newbill) values (?,?,?,?,?,?,?)");
        preparedStatement.setInt(1,userEntity.getId());
        preparedStatement.setString(2,userEntity.getUsername());
        preparedStatement.setString(3,userEntity.getPassword());
        preparedStatement.setDouble(4,userEntity.getCurrvol());
        preparedStatement.setDouble(5,userEntity.getNewvol());
        preparedStatement.setLong(6,userEntity.getCurrbilll());
        preparedStatement.setLong(7,userEntity.getNewbill());

        preparedStatement.executeUpdate();
    }

    public void update(UserEntity userEntity) throws Exception
    {
        preparedStatement=connection.prepareStatement("update usserrs set username=?,password=?,currvol=?,currbill where id=? ");

        preparedStatement.setString(1,userEntity.getUsername());
        preparedStatement.setString(2,userEntity.getPassword());
        preparedStatement.setDouble(3,userEntity.getCurrvol()+userEntity.getNewvol());
        preparedStatement.setLong(4,userEntity.getCurrbilll()+userEntity.getNewbill());
        preparedStatement.setInt(5,userEntity.getId());
        preparedStatement.executeUpdate();
    }

    public void delete(int id) throws Exception{
        preparedStatement=connection.prepareStatement ("DELETE FROM usserrs WHERE id=?");
        preparedStatement.setInt (1,id);
        preparedStatement.executeUpdate ();
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
