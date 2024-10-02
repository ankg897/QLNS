/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Database.TinhLuongDB;
import Model.ChamCong;
import Model.HeSoLuong;
import Model.Luong;
import Model.PhepNam;
import java.util.ArrayList;
import View.Tinhluong;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Khach
 */
public class ChamCongView extends javax.swing.JFrame {

    /**
     * Creates new form ChamCong
     */
    public ChamCongView() {
        initComponents();
    }
    public DefaultTableModel model1;
    public DefaultTableModel model2;
    public DefaultTableModel model3;
    int index;
    public ArrayList<ChamCong> list1;
    public ArrayList<HeSoLuong> list2;
    public ArrayList<PhepNam> list3;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComTen = new javax.swing.JComboBox<>();
        Month = new com.toedter.calendar.JMonthChooser();
        Year = new com.toedter.calendar.JYearChooser();
        Tinh = new javax.swing.JButton();
        LuongChinh = new javax.swing.JTextField();
        Timkiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hesoluong = new javax.swing.JTextField();
        luongcoban = new javax.swing.JTextField();
        songaypheptong = new javax.swing.JTextField();
        songaynghiphep = new javax.swing.JTextField();
        songaynghikhongluong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SongayKhaDung = new javax.swing.JTextField();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComTen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duy Tôn ", "Duy Hành ", " " }));

        Tinh.setText("Tính");
        Tinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TinhActionPerformed(evt);
            }
        });

        Timkiem.setText("Tìm");
        Timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimkiemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Hệ số lương");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Luong cơ bản");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Số ngày phép tổng");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Số ngày nghỉ phép");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Ngày nghỉ không lương");

        songaynghikhongluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songaynghikhongluongActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Số ngày phép khả dụng");

        Back.setText("Trở lại");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tinh)
                        .addGap(42, 42, 42)
                        .addComponent(LuongChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Timkiem)
                        .addGap(36, 36, 36)
                        .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(songaynghikhongluong, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(luongcoban, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(hesoluong, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(songaypheptong, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(songaynghiphep, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(SongayKhaDung))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(ComTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Timkiem)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(hesoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(luongcoban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(songaypheptong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SongayKhaDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(songaynghiphep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(songaynghikhongluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LuongChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tinh))
                .addGap(18, 18, 18)
                .addComponent(Back)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimkiemActionPerformed
        // TODO add your handling code here:
        TinhLuongDB nvd = new TinhLuongDB();
        String name = ComTen.getSelectedItem().toString().trim();
        int a = Month.getMonth() + 1;
        int b = Year.getYear();
         list1 = nvd.Find1(name);
        list2 = nvd.Find2(name);
        list3 = nvd.Find3(name, a, b);
        hesoluong.setText(list2.getFirst().getHesoluong() + "");
        luongcoban.setText(list2.getFirst().getLuongCoBan() + "");
        songaypheptong.setText(list3.getFirst().getSoNgayPhepTong() + "");
        SongayKhaDung.setText(list3.getFirst().getSoNgayNghiKhaDung() + "");
        songaynghiphep.setText(list3.getFirst().getSoNgayNghiPhep() + "");
        System.out.println(XuLY(list1.getFirst().getGioVao()));
        
    }//GEN-LAST:event_TimkiemActionPerformed


    private void songaynghikhongluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songaynghikhongluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songaynghikhongluongActionPerformed

    private void TinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TinhActionPerformed
        // TODO add your handling code here:
         TinhLuongDB nvd = new TinhLuongDB();
        String name = ComTen.getSelectedItem().toString().trim();
        int a = Month.getMonth() + 1;
        int b = Year.getYear();
        ArrayList listcc = nvd.listNgayCong(name);
       
        int count = 0;
        for (int i = 0; i < listcc.size(); i++) {
            count++;
        }
        int soNgayCong = 0;
        int songayLam = 0;
        double koluong = 0;
        double phep = list3.getFirst().getSoNgayNghiPhep();      
        switch (a) {
            case 1:
                songayLam = 23;
                soNgayCong = songayLam - count;
                koluong = songayLam - soNgayCong - phep;
                break;
            case 2:
                songayLam = 21;
                soNgayCong = songayLam - count;
                koluong = songayLam - soNgayCong - phep;
                break;
            case 3:
                songayLam = 21;
                soNgayCong = songayLam - count;
                koluong = songayLam - soNgayCong - phep;
                break;
            case 4:
                songayLam = 22;
                soNgayCong = songayLam - count;
                koluong = songayLam - soNgayCong - phep;
                break;
            case 5:
                songayLam = 23;
                soNgayCong = songayLam - count;
                koluong = songayLam - soNgayCong - phep;
                break;
            case 6:
                songayLam = 20;
                soNgayCong = songayLam - count;
                koluong = songayLam - soNgayCong - phep;
                break;
            case 7:
                songayLam = 23;
                soNgayCong = songayLam - count;
                koluong = songayLam - soNgayCong - phep;
                break;
            case 8:
                songayLam = 22;
                soNgayCong = songayLam - count;
                koluong = songayLam - soNgayCong - phep;
                break;
            case 9:
                songayLam = 21;
                soNgayCong = songayLam - count;
                koluong = songayLam - soNgayCong - phep;
                break;
            case 10:
                songayLam = 23;
                soNgayCong = songayLam - count;
                koluong = songayLam - soNgayCong - phep;
                break;
            case 11:
                songayLam = 21;
                soNgayCong = songayLam - count;
                koluong = songayLam - soNgayCong - phep;
                break;
            case 12:
                songayLam = 22;
                soNgayCong = songayLam - count;
                koluong = songayLam - soNgayCong - phep;
                break;         
        }       
        int soLanTre = 0;
        if(XuLY(list1.getFirst().getGioVao()) > 80000 || XuLY(list1.getFirst().getGiOra()) < 170000){
            soLanTre++;
        }           
        System.out.println(XuLY(list1.getFirst().getGiOra()));
        songaynghikhongluong.setText(soNgayCong + "");
        int luongCoBan = XuLY(luongcoban.getText());
        double heso = Double.parseDouble(hesoluong.getText());       
        double luongChinhThuc = heso * luongCoBan - ((heso*luongCoBan)/songayLam * koluong) - soLanTre * 1000;
        LuongChinh.setText(luongChinhThuc + "");
        nvd.update(luongChinhThuc, name, a, b);
       
    }//GEN-LAST:event_TinhActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        new Tinhluong().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    
    public int XuLY(String name){
        String a ="";
        for(int i = 0; i < 8; i++){
            if(Character.isDigit(name.charAt(i))){
                a += name.charAt(i);
            }           
        }
        int ab = Integer.parseInt(a);
        return ab;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChamCongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChamCongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChamCongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChamCongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChamCongView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JComboBox<String> ComTen;
    private javax.swing.JTextField LuongChinh;
    private com.toedter.calendar.JMonthChooser Month;
    private javax.swing.JTextField SongayKhaDung;
    private javax.swing.JButton Timkiem;
    private javax.swing.JButton Tinh;
    private com.toedter.calendar.JYearChooser Year;
    private javax.swing.JTextField hesoluong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField luongcoban;
    private javax.swing.JTextField songaynghikhongluong;
    private javax.swing.JTextField songaynghiphep;
    private javax.swing.JTextField songaypheptong;
    // End of variables declaration//GEN-END:variables
}