/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Khach
 */
public class ChamCong {
    private String idcc;
    private String Ngay;
    private String GioVao;
    private String GiOra;
    private String MaNV;

    public ChamCong(String idcc, String Ngay, String GioVao, String GiOra, String MaNV) {
        this.idcc = idcc;
        this.Ngay = Ngay;
        this.GioVao = GioVao;
        this.GiOra = GiOra;
        this.MaNV = MaNV;
    }

    public ChamCong() {
    }

    public String getIdcc() {
        return idcc;
    }

    public void setIdcc(String idcc) {
        this.idcc = idcc;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public String getGioVao() {
        return GioVao;
    }

    public void setGioVao(String GioVao) {
        this.GioVao = GioVao;
    }

    public String getGiOra() {
        return GiOra;
    }

    public void setGiOra(String GiOra) {
        this.GiOra = GiOra;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
    
}
