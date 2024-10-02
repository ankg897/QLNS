/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import java.sql.*;

/**
 *
 * @author Khach
 */
public class Connect {
  
    public static Connection getConnection() {
        Connection ketnoi = null;
        String strDbUrl = "jdbc:sqlserver://DESKTOP-L943S3Q:1433;databaseName=QuanLyNhanSu;user=an;password=123456;encrypt=true;trustServerCertificate=true";
        try {
            ketnoi = DriverManager.getConnection(strDbUrl);
  //          System.out.println("Ket noi thanh cong");
 /*             DatabaseMetaData data = ketnoi.getMetaData();
                // hien thi thong tin sql khi ket noi thanh cong
                System.out.println("Driver Name: " + data.getDriverName());
                System.out.println("Driver Version: " + data.getDriverVersion());
                System.out.println("Product Name: " + data.getDatabaseProductName());
                System.out.println("Version: " + data.getDatabaseProductVersion()); */
        } catch (Exception e) {
            System.out.println("Khong the ket noi den CSDL \n" + e);
        }
        return ketnoi;
    }

}
