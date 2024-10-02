/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Connect.Connect;
import Model.NhanVien;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Khach
 */
public class NhanVienDB {

    PreparedStatement state = null;
    Connection connect = null;

    public ArrayList<NhanVien> listNhanVien(){
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            String str = "Select * From NHAN_VIEN"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNv(rs.getString("maNV"));
                nv.setHoten(rs.getString("Hoten"));
                nv.setVitri(rs.getString("Vitri"));
                nv.setBophan(rs.getString("Bophan"));
                nv.setNgayThangNamSinh(rs.getString("Sinh"));
                nv.setGioitinh(rs.getString("Gioitinh"));
                nv.setEmail(rs.getString("Email"));
                nv.setSdt(rs.getString("SDT"));
                nv.setMaPB(rs.getString("MaPB"));
                nv.setIsActive(rs.getBoolean("isActive"));
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void AddNhanVien(NhanVien nv) {
        String url = "Insert into NHAN_VIEN values (?,?,?,?,?,?,?,?,?,?)";
        connect = Connect.getConnection();
        try {
            state = connect.prepareStatement(url);
            state.setString(1, nv.getMaNv());
            state.setString(2, nv.getHoten());
            state.setString(3, nv.getVitri());
            state.setString(4, nv.getBophan());
            state.setString(5, nv.getNgayThangNamSinh());
            state.setString(6, nv.getGioitinh());
            state.setString(7, nv.getEmail());
            state.setString(8, nv.getSdt());
            state.setString(9, nv.getMaPB());
            state.setBoolean(10, nv.isIsActive());
            state.executeUpdate();
        } catch (SQLException ex) {
            ex.toString();
        }
    }

    public void Delete(String id) {
        String url = "Delete From NHAN_VIEN where MaNV=?";
        connect = Connect.getConnection();
        try {
            state = connect.prepareCall(url);
            state.setString(1, id);
            state.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<NhanVien> FindByName(String name) {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            String str = "Select * from NHAN_VIEN where Hoten like ?"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            state.setString(1, "%" + name + "%");
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNv(rs.getString("maNV"));
                nv.setHoten(rs.getString("Hoten"));
                nv.setVitri(rs.getString("Vitri"));
                nv.setBophan(rs.getString("Bophan"));
                nv.setNgayThangNamSinh(rs.getString("Sinh"));
                nv.setGioitinh(rs.getString("Gioitinh"));
                nv.setEmail(rs.getString("Email"));
                nv.setSdt(rs.getString("SDT"));
                nv.setMaPB(rs.getString("MaPB"));
                nv.setIsActive(rs.getBoolean("isActive"));
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<NhanVien> FindByMa(String maNV) {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            String str = "Select * from NHAN_VIEN where MaNV = ?"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            state.setString(1, maNV);
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNv(rs.getString("MaNV"));
                nv.setHoten(rs.getString("Hoten"));
                nv.setVitri(rs.getString("Vitri"));
                nv.setBophan(rs.getString("Bophan"));
                nv.setNgayThangNamSinh(rs.getString("Sinh"));
                nv.setGioitinh(rs.getString("Gioitinh"));
                nv.setEmail(rs.getString("Email"));
                nv.setSdt(rs.getString("SDT"));
                nv.setMaPB(rs.getString("MaPB"));
                nv.setIsActive(rs.getBoolean("isActive"));
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
