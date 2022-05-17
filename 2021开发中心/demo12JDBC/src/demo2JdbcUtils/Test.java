package demo2JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: yqy
 * @Date: 2021/08/10/21:46
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        try {
            connection=Util.getConnection();
            String sql="select * from classify";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString("name");
                System.out.println(id+":"+name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Util.close(connection,statement,resultSet);
        }
    }
}
