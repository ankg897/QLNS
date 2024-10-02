/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Khach
 */
public class PhongBan {
    private String maPB;
    private String TenPB;

    public PhongBan() {
    }

    public PhongBan(String maPB, String TenDB) {
        this.maPB = maPB;
        this.TenPB = TenDB;
    }
   
    public String getMaPB() {
        return maPB;
    }

    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }

    public String getTenPB() {
        return TenPB;
    }

    public void setTenPB(String TenPB) {
        this.TenPB = TenPB;
    }

   
    
    
}
