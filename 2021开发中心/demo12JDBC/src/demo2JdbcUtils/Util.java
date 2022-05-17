package demo2JdbcUtils;


import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Util {
    private static  String url;
    private static String user;
    private static String password;
    private static String driver;

    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileReader("D:\\IDEA\\学习\\Java核心技术\\demoJDBC1\\src\\demo2JdbcUtils\\jdbc.properties"));
            url=properties.getProperty("url");
            user=properties.getProperty("user");
            password=properties.getProperty("password");
            driver=properties.getProperty("driver");
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
         return DriverManager.getConnection(url,user,password);
    }

    public static void close(Connection connection,Statement statement){
        if (statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(Connection connection, Statement statement,ResultSet resultSet){
        if (statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
