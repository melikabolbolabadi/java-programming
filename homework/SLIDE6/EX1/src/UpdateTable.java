import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateTable {
    public UpdateTable() throws Exception {
        Scanner scanner = new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "melikabolbolabadi", "melika");
        System.out.println(" which info do you want update?!\n1.username\n2.password\n3.email\n4.grade\n5.age");
        int m = scanner.nextInt();
        switch (m) {
            case 1:
                PreparedStatement preparedStatement = connection.prepareStatement("update users set username=? where id=? ");
                preparedStatement.setString(1, "melinabolbolabadi");
                preparedStatement.setLong(2, 1);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
            case 2:
                preparedStatement = connection.prepareStatement("update users set password=? where id=? ");
                preparedStatement.setString(1, "na_bl");
                preparedStatement.setLong(2, 1);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
            case 3:
                preparedStatement = connection.prepareStatement("update users set email=? where id=? ");
                preparedStatement.setString(1, "melinabolbolabadi11");
                preparedStatement.setLong(2, 1);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
            case 4:
                preparedStatement = connection.prepareStatement("update users set grade=? where id=? ");
                preparedStatement.setString(1, "lisans");
                preparedStatement.setLong(2, 1);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
            case 5:
                preparedStatement = connection.prepareStatement("update users set age=? where id=? ");
                preparedStatement.setLong(1, 13);
                preparedStatement.setLong(2, 1);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
        }

    }
}