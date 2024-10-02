/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Khach
 */
public class PhepNam {
    private String ID;
    private String MaNV;
    private int SoNgayNghiKhaDung;
    private int SoNgayPhepTong;
    private int SoNgayNghiPhep;
    private int SoNgayNghiKhongLuong;
    private int SoLanDiTre;
    private int thang;
    private int nam;

    public PhepNam() {
    }

    public PhepNam(String ID, String MaNV, int SoNgayNghiKhaDung, int SoNgayPhepTong, int SoNgayNghiPhep, int SoLanDiTre, int SoNgayNghiKhongLuong, int thang, int nam) {
        this.ID = ID;
        this.MaNV = MaNV;
        this.SoNgayNghiKhaDung = SoNgayNghiKhaDung;
        this.SoNgayPhepTong = SoNgayPhepTong;
        this.SoNgayNghiPhep = SoNgayNghiPhep;
        this.SoNgayNghiKhongLuong = SoNgayNghiKhongLuong;
        this.thang = thang;
        this.nam = nam;
    }

    public int getSoLanDiTre() {
        return SoLanDiTre;
    }

    public void setSoLanDiTre(int SoLanDiTre) {
        this.SoLanDiTre = SoLanDiTre;
    }
    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public int getSoNgayNghiKhaDung() {
        return SoNgayNghiKhaDung;
    }

    public void setSoNgayNghiKhaDung(int SoNgayNghiKhaDung) {
        this.SoNgayNghiKhaDung = SoNgayNghiKhaDung;
    }

    public int getSoNgayPhepTong() {
        return SoNgayPhepTong;
    }

    public void setSoNgayPhepTong(int SoNgayPhepTong) {
        this.SoNgayPhepTong = SoNgayPhepTong;
    }

    public int getSoNgayNghiPhep() {
        return SoNgayNghiPhep;
    }

    public void setSoNgayNghiPhep(int SoNgayNghiPhep) {
        this.SoNgayNghiPhep = SoNgayNghiPhep;
    }

    public int getSoNgayNghiKhongLuong() {
        return SoNgayNghiKhongLuong;
    }

    public void setSoNgayNghiKhongLuong(int SoNgayNghiKhongLuong) {
        this.SoNgayNghiKhongLuong = SoNgayNghiKhongLuong;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    
    
    
}
