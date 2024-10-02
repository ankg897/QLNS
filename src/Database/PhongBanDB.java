/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Connect.Connect;
import Model.NhanVien;
import Model.PhongBan;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Khach
 */
public class PhongBanDB {
    PreparedStatement state = null;
    Connection connect = null;
    
    public ArrayList<PhongBan> listPhongBan() {
        ArrayList<PhongBan> list = new ArrayList<>();
        try {
            String str = "Select * from PHONG_BAN"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                PhongBan nv = new PhongBan();
                nv.setMaPB(rs.getString("MaPB"));
                nv.setTenPB(rs.getString("TenPB"));
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<NhanVien> listNhanVien(String tenPB) {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            String str = "Select * from QUAN_LY qu, PHONG_BAN pb where qu.MaPB = pb.MaPB and TenPB like ?"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            state.setString(1, tenPB);
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
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }    
     public void AddPhongBan(PhongBan nv) {
        String url = "Insert into PHONG_BAN(MaPB, TenPB) values (?,?)";
        connect = Connect.getConnection();
        try {
            state = connect.prepareStatement(url);
            state.setString(1, nv.getMaPB());
            state.setString(2, nv.getTenPB());          
            state.executeUpdate();
        } catch (SQLException ex) {
            ex.toString();
        }
    }
     public void DeletePB(String id) {
        String url = "Delete From PHONG_BAN where MaPB = ?";
        connect = Connect.getConnection();
        try {
            state = connect.prepareCall(url);
            state.setString(1, id);
            state.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<PhongBan> FindByName(String name) {
        ArrayList<PhongBan> list = new ArrayList<>();
        try {
            String str = "Select * from PHONG_BAN where TenPB like ?"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            state.setString(1, "%" + name + "%");
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                PhongBan nv = new PhongBan();
                nv.setMaPB(rs.getString("MaPB"));
                nv.setTenPB(rs.getString("TenpB"));              
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
