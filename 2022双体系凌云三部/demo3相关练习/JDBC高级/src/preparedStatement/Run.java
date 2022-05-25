package preparedStatement;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

/**
 * @Author: yqy
 * @Date: 2022/05/25/9:38
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String user="SCOTT";
        String password="scott";
        String driver="oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql="update t_user set name=? where id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,"探索");
            statement.setInt(2,4);
            int i = statement.executeUpdate();
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
