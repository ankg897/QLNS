/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Connect.Connect;
import Model.TaiKhoan;
import java.sql.*;

/**
 *
 * @author Khach
 */
public class TaiKhoanDB {

    public boolean loginUser(TaiKhoan taiKhoan) throws SQLException {
        PreparedStatement statement = null;
        Connection connect = null;
        try {
            connect = Connect.getConnection(); // lệnh kết nối
            String strSelect = "select UserName, Password from TAI_KHOAN WHERE UserName = ? AND Password = ?"; // đoạn lệnh
            statement = connect.prepareStatement(strSelect); // đoạn thực hiện lệnh
            statement.setString(1, taiKhoan.getUserName());
            statement.setString(2, taiKhoan.getPassword());
            ResultSet rs = statement.executeQuery(); // xử lý kết quả
            while (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            statement.close();

        } finally {
            statement.close();
        }
        return false;
    }
}
