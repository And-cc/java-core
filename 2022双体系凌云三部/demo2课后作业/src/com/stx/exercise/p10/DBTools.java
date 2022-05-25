package com.stx.exercise.p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: yqy
 * @Date: 2022/03/23/17:02
 * @Description:
 */
public class DBTools {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    /**
     * 打开连接和声明
     */
    public void open(){
        try {
            connection= OJdbcUtil.getConnection();
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询一个字段
     * @param sql 要查的字段
     * @param str sql语句
     */
    public String queryOne(String sql,String str){
        open();
        String name="";
        try {
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                name = resultSet.getString(str);
                System.out.println(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            OJdbcUtil.close(connection,statement,resultSet);
        }
        return name;
    }

    /**
     * 修改一条数据
     * @param sql
     * @return
     */
    public int updateOne(String sql){
        open();
        int i=0;
        try {
            i = statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            OJdbcUtil.close(connection,statement);
        }
        return i;
    }

    /**
     * 删除一条数据
     * @param sql
     * @param j
     * @return
     */
    public int deleteOne(String sql,int j){
        open();
        int i=0;
        try {
            i = statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            OJdbcUtil.close(connection,statement);
        }
        return i;
    }

    /**
     * 增加一条数据
     * @param sql sql语句
     * @param
     * @return
     */
    public int addOne(String sql,String a,String b,String c){
        open();
        int i=0;
        try {
            i = statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            OJdbcUtil.close(connection,statement);
        }
        return i;
    }
}
