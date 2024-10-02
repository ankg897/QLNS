/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Connect.Connect;
import Model.ChamCong;
import Model.HeSoLuong;
import Model.Luong;
import Model.PhepNam;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Khach
 */
public class TinhLuongDB {

    PreparedStatement state = null;
    Connection connect = null;

    public ArrayList<Luong> listLuong() {
        ArrayList<Luong> list = new ArrayList<>();
        try {
            String str = "Select *"
                    + " from TINH_LUONG"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                Luong l = new Luong();
                l.setID(rs.getString("ID"));
                l.setMaNV(rs.getString("MaNV"));            
                l.setLuongChinhThuc(rs.getInt("LuongChinhThuc"));
                l.setThang(Integer.parseInt(rs.getString("Thang")));
                l.setNam(Integer.parseInt(rs.getString("Nam")));
                list.add(l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Luong> FindByma(String name, int month, int year) {

        ArrayList<Luong> list = new ArrayList<>();
        try {
            String str = "Select * from NHAN_VIEN nv, TINH_LUONG tl where nv.MaNV = tl.MaNV and Hoten like ? and Thang = ? and Nam = ?"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            state.setString(1, "%" + name + "%");
            state.setInt(2, month);
            state.setInt(3, year);
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                Luong l = new Luong();
                l.setID(rs.getString("ID"));
                l.setMaNV(rs.getString("MaNV"));               
                l.setLuongChinhThuc(Double.parseDouble(rs.getString("LuongChinhThuc")));
                l.setThang(Integer.parseInt(rs.getString("Thang")));
                l.setNam(Integer.parseInt(rs.getString("Nam")));
                list.add(l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<ChamCong> Find1(String name) {

        ArrayList<ChamCong> list = new ArrayList();
        try {
            String str = "Select * from NHAN_VIEN nv, CHAM_CONG cc where nv.MaNV = cc.MaNV and Hoten like ?"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            state.setString(1, "%" + name + "%");
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                ChamCong l = new ChamCong();
                l.setIdcc(rs.getString("IDCC"));
                l.setMaNV(rs.getString("MaNV"));
                l.setGioVao(rs.getString("Giovao"));
                l.setGiOra(rs.getString("Giora"));
                // l.setMaNV(rs.getString("MaNV"));
                list.add(l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<HeSoLuong> Find2(String name) {

        ArrayList<HeSoLuong> list = new ArrayList<>();
        try {
            String str = "Select * from NHAN_VIEN nv, HE_SO_LUONG hsl where nv.MaNV = hsl.MaNV and Hoten like ?"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            state.setString(1, "%" + name + "%");
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                HeSoLuong hsl = new HeSoLuong();
                hsl.setId(rs.getString("ID"));
                hsl.setMaNV(rs.getString("MaNV"));
                hsl.setHesoluong(rs.getInt("HeSoLuong"));
                hsl.setLuongCoBan(rs.getInt("LuongCoBan"));
                list.add(hsl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<PhepNam> Find3(String name, int month, int year) {

        ArrayList<PhepNam> list = new ArrayList<>();
        try {
            String str = "Select * from PHEP_NAM pn, NHAN_VIEN nv where pn.MaNV = nv.MaNV and Hoten like ? and Thang = ? and Nam = ?"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            state.setString(1, "%" + name + "%");
            state.setInt(2, month);
            state.setInt(3, year);
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                PhepNam pn = new PhepNam();
                pn.setSoNgayNghiKhaDung(rs.getInt("SoNgayNghiKhaDung"));
                pn.setSoNgayNghiKhongLuong(rs.getInt("SoNgayNghiKhongLuong"));
                pn.setSoNgayNghiPhep(rs.getInt("SoNgayNghiPhep"));
                pn.setSoNgayPhepTong(rs.getInt("SoNgayNghiTong"));
                pn.setThang(rs.getInt("Thang"));
                pn.setNam(rs.getInt("Nam"));
                list.add(pn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<ChamCong> listNgayCong(String name) {
        ArrayList<ChamCong> list = new ArrayList<>();
        try {
            String str = "Select *"
                    + " from CHAM_CONG cc, NHAN_VIEN nv where cc.MaNV = nv.MaNV and Hoten like ? and isActive = 1"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            state.setString(1, "%" + name + "%");
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                ChamCong cc = new ChamCong();
                cc.setIdcc(rs.getString("IDCC"));
                cc.setMaNV(rs.getString("MaNV"));
                cc.setGioVao(rs.getString("Giovao"));
                cc.setGiOra(rs.getString("Giora"));
                list.add(cc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void update(double john, String ma, int a, int b) {
        try {
            String url = "update TINH_LUONG set LuongChinhThuc = ? "
                    + "from TINH_LUONG, NHAN_VIEN where TINH_LUONG.MaNV = NHAN_VIEN.MaNV "
                    + "and NHAN_VIEN.Hoten like ? and Thang = ? and Nam = ?";
            connect = Connect.getConnection();
            state = connect.prepareStatement(url);
            state.setDouble(1, john);
            state.setString(2, "%" + ma + "%");
            state.setInt(3, a);
            state.setInt(4, b);
            state.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public ArrayList<Luong> FindBy(String maNV, int month, int year) {

        ArrayList<Luong> list = new ArrayList<>();
        try {
            String str = "Select * from TINH_LUONG where MaNV = ? and Thang = ? and Nam = ?"; // đoạn lệnh
            connect = Connect.getConnection(); // lệnh kết nối
            state = connect.prepareStatement(str);
            state.setString(1, maNV);
            state.setInt(2, month);
            state.setInt(3, year);
            ResultSet rs = state.executeQuery(); // kết quả lấy ra
            while (rs.next()) {
                Luong l = new Luong();
                l.setID(rs.getString("ID"));
                l.setMaNV(rs.getString("MaNV"));               
                l.setLuongChinhThuc(Double.parseDouble(rs.getString("LuongChinhThuc")));
                l.setThang(Integer.parseInt(rs.getString("Thang")));
                l.setNam(Integer.parseInt(rs.getString("Nam")));
                list.add(l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    

}
