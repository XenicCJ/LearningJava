package _02JavaAdvanced._10MysqlJDBC;

import java.sql.*;

/**
 * mysql连接的练习类
 * 要求DBMS中需要有test数据库
 */
public class MysqlConnectTest {
    // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
//    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//    static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB";

    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";


    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "Xcjxiansheng1996";

    private void createTableTest(){
        Connection conn = null;
        Statement stmt = null;
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            // 执行sql
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            //建表
            sql="CREATE TABLE if not exists `testWebsits` (\n" +
                    "  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
                    "  `name` char(20) NOT NULL DEFAULT '' COMMENT '站点名称',\n" +
                    "  `url` varchar(255) NOT NULL DEFAULT '',\n" +
                    "  `alexa` int(11) NOT NULL DEFAULT '0' COMMENT 'Alexa 排名',\n" +
                    "  `country` char(10) NOT NULL DEFAULT '' COMMENT '国家',\n" +
                    "  PRIMARY KEY (`id`)\n" +
                    ") ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;";
            PreparedStatement ps=conn.prepareStatement(sql);
            System.out.println("建表完成，或表已存在");
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }

    private void insertTableTest(){
        Connection conn = null;
        Statement stmt = null;
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            // 执行sql
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;

            //插入一些数据
            sql="INSERT INTO `testWebsits` VALUES ('1', 'Google', 'https://www.google.cm/', '1', 'USA'), ('2', '淘宝', 'https://www.taobao.com/', '13', 'CN'), ('3', '菜鸟教程', 'http://www.runoob.com', '5892', ''), ('4', '微博', 'http://weibo.com/', '20', 'CN'), ('5', 'Facebook', 'https://www.facebook.com/', '3', 'USA');";
            PreparedStatement ps = conn.prepareStatement(sql);
            System.out.println("插入数据完成");

            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }

    private void readTableTest(){
        Connection conn = null;
        Statement stmt = null;
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            // 执行sql
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;

            //读取数据
            sql = "SELECT id, name, url FROM testWebsits";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("读取数据完成");

            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                int id  = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");

                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MysqlConnectTest msqc=new MysqlConnectTest();
        try{
            msqc.createTableTest();
            msqc.insertTableTest();
            msqc.readTableTest();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }
        System.out.println("Goodbye!");
    }
}
