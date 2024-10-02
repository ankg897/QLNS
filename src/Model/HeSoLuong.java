/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Khach
 */
public class HeSoLuong {
    private String id;
    private String MaNV;
    private double hesoluong;
    private double luongCoBan;

    public HeSoLuong() {
    }

    public HeSoLuong(String id, String MaNV, double hesoluong, double luongCoBan) {
        this.id = id;
        this.MaNV = MaNV;
        this.hesoluong = hesoluong;
        this.luongCoBan = luongCoBan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    
}
