package Y1概述;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @Author: yqy
 * @Date: 2021/08/08/22:43
 * @Description:
 */
public class Y2InsertTest {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///shop?serverTimezone=UTC","root","Yy042300");
        String sql="insert into classify  values('5','鸿星尔克') ";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i);
        statement.close();
        connection.close();

    }
}
