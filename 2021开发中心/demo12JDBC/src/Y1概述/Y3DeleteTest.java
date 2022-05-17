package Y1概述;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @Author: yqy
 * @Date: 2021/08/08/23:00
 * @Description:
 */
public class Y3DeleteTest {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///shop?serverTimezone=UTC", "root", "Yy042300");
        String sql="delete from classify where id=5";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i);
        connection.close();
        statement.close();
    }
}
