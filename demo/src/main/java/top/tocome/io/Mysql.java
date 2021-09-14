package top.tocome.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mysql {

        //      1.定义方法，并接收参数
        public  static  boolean getConnection(String user,String password) throws  Exception{
            //         2.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //         3.获取数据库连接对象
            Connection con= DriverManager.getConnection
                    ("jdbc:mysql://localhost:3366/mysql?serverTimezone=GMT%2B8\n&useSSL=false", "root","****密码***");
            //定义sql，（判断输入的账号以及密码是否在表内）
            String sql="select * from tb88 where name='"+user+"' and password='"+password+"'";

            //获取执行sql的对象
            Statement state=con.createStatement();
            //执行sql
            ResultSet rs= state.executeQuery(sql);
            //判断结果
            return  rs.next();
        }
}
