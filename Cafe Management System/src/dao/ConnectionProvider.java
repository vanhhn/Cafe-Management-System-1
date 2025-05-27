package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    public static Connection getCon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Sửa driver mới
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false&serverTimezone=UTC", "root", "L28062003@m");
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi: Không tìm thấy Driver MySQL!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Lỗi: Không thể kết nối đến MySQL!");
            e.printStackTrace();  
        }
        return con;
    }
}
