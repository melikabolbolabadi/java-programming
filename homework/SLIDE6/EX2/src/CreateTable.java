import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CreateTable
{

    public CreateTable() throws Exception  {
        Scanner scanner=new Scanner(System.in);
        String fullname1,fullname2,fname1,fname2,meliicode1,mellicode2,posision1,posision2;
        long salary1,salary2;
        int woexp1,woexp2;
        System.out.println("enter informations for employee 1 : ");
        System.out.println("fullname: ");
        fullname1=scanner.next();
        System.out.println("father name: ");
        fname1=scanner.next();
        System.out.println("melli code: ");
        meliicode1=scanner.next();
        System.out.println("posision: ");
        posision1=scanner.next();
        System.out.println("salary: ");
        salary1=scanner.nextLong();
        System.out.println("work experiance: ");
        woexp1=scanner.nextInt();

        System.out.println("enter informations for employee 2 : ");
        System.out.println("fullname: ");
        fullname2=scanner.next();
        System.out.println("father name: ");
        fname2=scanner.next();
        System.out.println("melli code: ");
        mellicode2=scanner.next();
        System.out.println("posision: ");
        posision2=scanner.next();
        System.out.println("salary: ");
        salary2=scanner.nextLong();
        System.out.println("work experiance: ");
        woexp2=scanner.nextInt();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","melikabolbolabadi","melika");
        PreparedStatement preparedStatement=connection.prepareStatement
                        ("insert into employees (id,fullname,fname,mellicode,posision,salary,workexp) values (?,?,?,?,?,?,?)" );
        preparedStatement.setLong(1,1);
        preparedStatement.setString(2,fullname1);
        preparedStatement.setString(3,fname1);
        preparedStatement.setString(4, meliicode1);
        preparedStatement.setString(5,posision1);
        preparedStatement.setLong(6,salary1);
        preparedStatement.setInt(7,woexp1);

        preparedStatement.setLong(1,2);
        preparedStatement.setString(2,fullname2);
        preparedStatement.setString(3,fname2);
        preparedStatement.setString(4, mellicode2);
        preparedStatement.setString(5,posision2);
        preparedStatement.setLong(6,salary2);
        preparedStatement.setInt(7,woexp2);

        preparedStatement.executeUpdate();
    }
}
