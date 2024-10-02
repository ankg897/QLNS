/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Khach
 */
public class Luong {

    private String ID;
    private String maNV;          
    private double LuongChinhThuc;
    private int thang;
    private int nam;

    public Luong() {
    }

    public Luong(String ID, String maNV, double LuongChinhThuc, int thang, int nam) {
        this.ID = ID;
        this.maNV = maNV;      
        this.LuongChinhThuc = LuongChinhThuc;
        this.thang = thang;
        this.nam = nam;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public double getLuongChinhThuc() {
        return LuongChinhThuc;
    }

    public void setLuongChinhThuc(double LuongChinhThuc) {
        this.LuongChinhThuc = LuongChinhThuc;
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
