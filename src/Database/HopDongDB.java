/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Connect.Connect;
import Model.HopDong;
import Model.NhanVien;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Khach
 */
public class HopDongDB {
    PreparedStatement state = null;
    Connection connect = null;
    
      public ArrayList<HopDong> listHopDong() {
        ArrayList<HopDong> list = new ArrayList<>();
        try {
            String str = "Select * " + "from HOP_DONG";
                    // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                HopDong hd = new HopDong(); 
                hd.setID(rs.getString("ID"));  
                hd.setTen(rs.getString("Ten"));
                hd.setNgayBatDau(rs.getString("Ngaybatdau"));
                hd.setNgayKetThuc(rs.getString("ngaykethuc"));
                hd.setGiaHan(rs.getBoolean("GiaHan"));
                hd.setSolanky(rs.getInt("SoLanKy"));  
                hd.setMaNV(rs.getString("MaNV"));
                list.add(hd);
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
     public void addHopDong(HopDong nv) {
        String url = "Insert into HOP_DONG(ID, Ten, Ngaybatdau, Ngaykethuc, GiaHan, SoLanKy, MaNV) values (?,?,?,?,?,?,?)";
        connect = Connect.getConnection();
        try {
            state = connect.prepareStatement(url);
            state.setString(1, nv.getID());
            state.setString(2, nv.getTen());
            state.setString(3, nv.getNgayBatDau());  
            state.setString(4, nv.getNgayKetThuc());
            state.setBoolean(5, nv.isGiaHan());
            state.setInt(6, nv.getSolanky());                
            state.setString(7, nv.getMaNV());
            state.executeUpdate();
        } catch (SQLException ex) {
            ex.toString();
        }
    }
     public void DeleteHD(String id) {
        String url = "Delete From HOP_DONG where ID = ?";
        connect = Connect.getConnection();
        try {
            state = connect.prepareCall(url);
            state.setString(1, id);
            state.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<HopDong> FindByName(String name) {
        ArrayList<HopDong> list = new ArrayList<>();
        try {
            String str = "Select * from HOP_DONG where ID like ?"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            state.setString(1, "%" + name + "%");
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                HopDong hd = new HopDong();
                hd.setID(rs.getString("ID"));
                hd.setTen(rs.getString("Ten"));
                hd.setNgayBatDau(rs.getString("Ngaybatdau"));
                hd.setNgayKetThuc(rs.getString("Ngaykethuc"));
                hd.setGiaHan(rs.getBoolean("GiaHan"));
                hd.setSolanky(rs.getInt("SoLanKy")); 
                hd.setMaNV(rs.getString("MaNV"));
                list.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<HopDong> FindByName1(String name) {
        ArrayList<HopDong> list = new ArrayList<>();
        try {
            String str = "Select * from HOP_DONG where MaNV like ?"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            state.setString(1, "%" + name + "%");
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                HopDong hd = new HopDong();
                hd.setID(rs.getString("ID"));
                hd.setTen(rs.getString("Ten"));
                hd.setNgayBatDau(rs.getString("Ngaybatdau"));
                hd.setNgayKetThuc(rs.getString("Ngaykethuc"));
                hd.setGiaHan(rs.getBoolean("GiaHan"));
                hd.setSolanky(rs.getInt("SoLanKy")); 
                hd.setMaNV(rs.getString("MaNV"));
                list.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
