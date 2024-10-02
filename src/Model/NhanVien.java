/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.*;
import javax.management.Query;

/**
 *
 * @author Khach
 */
public class NhanVien {

    private String hoten;
    private String maNv;
    private String maPB;
    private String vitri;
    private String bophan;    
    private String ngayThangNamSinh;
    private String gioitinh;
    private String email;
    private String sdt;
    private boolean isActive;
    public NhanVien() {

    }

    public NhanVien(String hoten, String maNv, String vitri, String bophan, String ngayThangNamSinh, String gioitinh, String email, String sdt, boolean isActive) {
        this.hoten = hoten;
        this.maNv = maNv;
        this.vitri = vitri;
        this.bophan = bophan;
        this.ngayThangNamSinh = ngayThangNamSinh;
        this.gioitinh = gioitinh;
        this.email = email;
        this.sdt = sdt;   
        this.isActive = isActive;
    }

    public String getMaPB() {
        return maPB;
    }

    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public String getBophan() {
        return bophan;
    }

    public void setBophan(String bophan) {
        this.bophan = bophan;
    }

    public String getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setNgayThangNamSinh(String ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

}
