/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Khach
 */
public class HopDong {
    private String ID;
    private String ten;
    private String ngayBatDau;
    private String ngayKetThuc;
    private boolean giaHan;
    private int solanky;  
    private String MaNV;

    public HopDong() {
       
    }

    public HopDong(String ID, String ten, String ngayBatDau, String ngayKetThuc, boolean giaHan, int solanky, String MaNV) {
        this.ID = ID;
        this.ten = ten;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.giaHan = giaHan;
        this.solanky = solanky;
        this.MaNV = MaNV;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public boolean isGiaHan() {
        return giaHan;
    }

    public void setGiaHan(boolean giaHan) {
        this.giaHan = giaHan;
    }

    public int getSolanky() {
        return solanky;
    }

    public void setSolanky(int solanky) {
        this.solanky = solanky;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
   

 
    
    
}
