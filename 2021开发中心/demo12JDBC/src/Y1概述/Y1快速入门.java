package Y1概述;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Y1快速入门 {
    public static void main(String[] args) throws Exception {

        //1.导入jar包
        //2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3获取数据库连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop?serverTimezone=UTC", "root", "Yy042300");
        //4定义一个sql语句
        String sql="update classify set name='康师傅' where id=1 ";
        //5获取执行sql的对象Statement
        Statement statement = connection.createStatement();
        //6执行sql
        int i = statement.executeUpdate(sql);
        //7处理结果
        System.out.println(i);
        //8释放资源
        statement.close();
        connection.close();

    }

}
