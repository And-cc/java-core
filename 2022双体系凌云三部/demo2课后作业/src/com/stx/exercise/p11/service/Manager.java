package com.stx.exercise.p11.service;

import com.stx.exercise.p11.pojo.*;
import com.stx.exercise.p11.utils.DateUtil;
import com.stx.exercise.p11.utils.MD5Util;
import com.stx.exercise.p11.utils.OJdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2022/03/23/17:11
 * @Description:
 */
public class Manager {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> times = new ArrayList<>();
    private User user;
    private Record record;
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    /**
     * 初始化连接
     */
    private void init() {
        try {
            connection = OJdbcUtil.getConnection();
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        boolean isExit = false;
        do {
            System.out.println("***请选择操作：");
            System.out.println("***1.注册***2.登录***3.今日打卡***4.打卡统计***5.补交打卡***6.退出登录***7.退出系统");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    record();
                    break;
                case 4:
                    showCord();
                    break;
                case 5:
                    perRecord();
                    break;
                case 6:
                    user=null;
                    break;
                case 7:
                    scanner.close();
                    isExit = true;
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }

        } while (!isExit);
    }

    /**
     * 打卡信息查看
     */
    public void showCord() {
        if (!isLogin()){
            System.out.println("您未登录，无法查看");
            return;
        }
        /**
         * 1.打印姓名
         * 2.打印打卡记录
         */
        ArrayList<Show> use = new ArrayList<>();
        init();
        String sql = "select pu.name name,pc.address address,pc.CREATE_TIME time,heat,trip_code,health_code\n" +
                "from P_CARD_RECORD pc inner join p_user pu\n" +
                "on pc.pid=pu.sno and pu.sno=" + user.getSno();
        try {
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Show show = new Show();
                show.setName(resultSet.getString("name"));
                show.setAddress(resultSet.getString("address"));
                show.setTime(DateUtil.toTimestamp(resultSet.getString("time")));
                show.setHeat(resultSet.getInt("heat") / 10.0);
                int tripCode = resultSet.getInt("trip_code");
                if (tripCode == 0) {
                    show.setTripCode("绿码");
                } else if (tripCode == 1) {
                    show.setTripCode("黄码");
                } else {
                    show.setTripCode("红码");
                }
                int healthCode = resultSet.getInt("health_code");
                if (healthCode == 0) {
                    show.setHealthCode("正常");
                } else if (healthCode == 1) {
                    show.setHealthCode("警告");
                } else {
                    show.setHealthCode("异常");
                }
                use.add(show);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            OJdbcUtil.close(connection, statement, resultSet);
        }
        if (use.size() == 0) {
            System.out.println("您还从未打卡，请按时打卡");
        } else {
            for (Show show : use) {
                System.out.println(show.toString());
            }
        }
    }

    /**
     * 输入打卡信息,今日打卡无需输入
     *
     * @param time
     */
    public void inputCord(Timestamp time) {
        record = new Record();
        record.setCreateTime(time);
        System.out.println("请输入地址");
        record.setAddress(scanner.next());
        System.out.println("请输入温度");
        record.setHeat(scanner.nextDouble() * 10);
        System.out.println("请输入健康码状态:0绿码、1黄码、2绿码");
        record.setTripCode(scanner.nextInt());
        System.out.println("请输入行程码状态:0绿码、1黄码、2绿码");
        record.setHealthCode(scanner.nextInt());
    }

    /**
     * 输入日期，判断是否打卡
     *
     * @return
     */
    public boolean isDayRecord(Timestamp time) {
        /**
         * 把传来的时间转换为日期，精确到日就行
         */
        String sql = "select CREATE_TIME from P_CARD_RECORD where pid=" + user.getSno();
        try {
            init();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                times.add(resultSet.getString("CREATE_TIME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            OJdbcUtil.close(connection, statement, resultSet);
        }
        String s = DateUtil.timestampToStr(time);
        if (times.contains(s)) {
            return true;
        }
        return false;
    }

    /**
     * 输入日期打卡
     */
    public void perRecord(){
        if (!isLogin()) {
            System.out.println("您还未登录，请登录再来");
            return;
        }
        /**
         * 1.判断今天有没有打卡
         * 2.打卡并输入信息
         */
        System.out.println("请输入你要补打卡的日期(yyyy-MM-dd):");
        Timestamp timestamp=DateUtil.toTimestamp(scanner.next());
        if (isDayRecord(timestamp)) {
            System.out.println("今日您已打卡，请勿重复打卡");
        } else {
            inputCord(timestamp);
            init();
            String sql = "insert into P_CARD_RECORD(id,pid,CREATE_TIME,address,heat,trip_code,health_code)" +
                    "values(seq_p_card.nextval," + user.getSno() + ",'" + DateUtil.timestampToStr(timestamp) + "','" + record.getAddress() + "'," + record.getHeat()
                    + "," + record.getTripCode() + "," + record.getHealthCode() + ")";
            try {
                int i = statement.executeUpdate(sql);
                if (i != 0) {
                    System.out.println("恭喜您，打卡成功");
                    return;
                } else {
                    //TODO
                    statement.executeUpdate("delete from P_CARD_RECORD where CREATE_TIME='" + DateUtil.timestampToStr(timestamp) + "'");
                    System.out.println("系统有误，打卡失败");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                OJdbcUtil.close(connection, statement);
            }
        }
    }

    /**
     * 今日打卡
     */
    public void record() {
        if (!isLogin()) {
            System.out.println("您还未登录，请登录再来");
            return;
        }
        /**
         * 1.判断今天有没有打卡
         * 2.打卡并输入信息
         */
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if (isDayRecord(timestamp)) {
            System.out.println("今日您已打卡，请勿重复打卡");
        } else {
            inputCord(timestamp);
            init();
            String sql = "insert into P_CARD_RECORD(id,pid,CREATE_TIME,address,heat,trip_code,health_code)" +
                    "values(seq_p_card.nextval," + user.getSno() + ",'" + DateUtil.timestampToStr(timestamp) + "','" + record.getAddress() + "'," + record.getHeat()
                    + "," + record.getTripCode() + "," + record.getHealthCode() + ")";
            try {
                int i = statement.executeUpdate(sql);
                if (i != 0) {
                    System.out.println("恭喜您，打卡成功");
                    return;
                } else {
                    //TODO
                    statement.executeUpdate("delete from P_CARD_RECORD where CREATE_TIME='" + DateUtil.timestampToStr(timestamp) + "'");
                    System.out.println("系统有误，打卡失败");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                OJdbcUtil.close(connection, statement);
            }
        }

    }

    /**
     * 判断用户是否已经登录
     *
     * @return
     */
    public boolean isLogin() {
        /**
         * 如果已经登录了，就不能再次登录
         */
        String sno;
        try {
            sno = String.valueOf(user.getSno());
        } catch (NullPointerException e) {
            return false;
        }
        if (sno != null && sno.length() != 0) {
            return true;
        }
        return false;
    }

    /**
     * 登录
     */
    public void login() {
        if (isLogin()) return;
        /**
         * 1.输入用户信息
         * 2.校验密码
         * 3.保存信息，用于打卡
         */
        User temp = new User();
        System.out.println("请输入学号");
        int sno = scanner.nextInt();
        String pwd = isExistSno(sno);
        if (pwd != null && pwd.length() != 0) {
            System.out.println("请输入密码");
            String password = MD5Util.encrypt32(scanner.next());
            if (password.equals(pwd)) {
                System.out.println("登录成功~~~~~~~");
                temp.setSno(sno);
                user = temp;
                return;
            }
            System.out.println("密码有误");
        }
        System.out.println("账户有误");
    }

    /**
     * 根据学号查密码
     *
     * @param sno
     * @return
     */
    public String isExistSno(int sno) {
        init();
        String sql = "select pwd from p_user where sno=" + sno;
        try {
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                return resultSet.getString("PWD");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            OJdbcUtil.close(connection, statement, resultSet);
        }
        return "";
    }

    /**
     * 注册
     */
    public void register() {
        if (isLogin()) {
            System.out.println("您以登录，请勿重复注册");
            return;
        }
        /**
         * 1.输入用户信息，
         * 2.判断学号是否已被注册（学号作为唯一标识符，不以名字，名字或许会重复）
         * 3.注册
         */
        User temp = new User();
        System.out.println("请输入学号");
        int repeat = noRepeat(scanner.nextInt());
        temp.setSno(repeat);

        System.out.println("请输入用户名");
        temp.setName(scanner.next());

        System.out.println("请输入密码");
        String password = MD5Util.encrypt32(scanner.next());
        temp.setPwd(password);
        String sql = "insert into p_user(id,sno,name,pwd)values(seq_p_user.nextval,+" + temp.getSno() + ",'" + temp.getName() + "','" + temp.getPwd() + "')";
        try {
            init();
            int i = statement.executeUpdate(sql);
            if (i != 0) {
                /**
                 * 注册成功
                 */
                System.out.println("恭喜你，注册成功，快去登录吧");
            } else {
                System.out.println("系统错误，注册失败");
                statement.executeUpdate("delete from p_user where sno=" + temp.getSno());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            OJdbcUtil.close(connection, statement);
        }
    }

    /**
     * 递归去重学号
     */
    public int noRepeat(int sno) {
        init();
        String sql = "select sno from p_user where sno=" + sno;
        try {
            resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                System.out.println("该学号已被注册，请重新输入！");
                sno = noRepeat(scanner.nextInt());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            OJdbcUtil.close(connection, statement, resultSet);
        }
        return sno;
    }

}
