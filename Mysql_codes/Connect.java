package Mysql_codes;
import java.sql.*;

public class Connect {
    static Connection conn  = null;
        public static Connection cont(){
            try {
                String url = "jdbc:mysql://localhost:3306/";
                String db = "jdbc";
                String user = "root";
                String pass = "02032002";
                conn = DriverManager.getConnection(url+db,user,pass);

            } catch (Exception e) {
                e.printStackTrace();
            }

            return conn;
        }
}
