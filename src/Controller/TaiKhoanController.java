/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Connect.Connect;
import Database.TaiKhoanDB;
import Model.TaiKhoan;
import java.sql.Connection;

/**
 *
 * @author Khach
 */
public class TaiKhoanController {

    public Boolean loginUser(TaiKhoan taiKhoan) {
        TaiKhoanDB taiKhoanDB = new TaiKhoanDB();
        try {
            return taiKhoanDB.loginUser(taiKhoan);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
