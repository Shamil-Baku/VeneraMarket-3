/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qarisiqmallar.veneramarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shamil
 */
public class SatilanMallarSatisID extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pres;
    Statement stmt;
    DefaultTableModel df;

    public SatilanMallarSatisID() {
        initComponents();
        connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSatisID = new javax.swing.JTable();
        btnStart = new javax.swing.JButton();
        btnKocurme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblSatisID.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Malin adi", "Miqdari", "Satis qiymeti", "Movsum_id", "Kateqoriya_id", "Alt_kateqoriya_id", "Umumi_Mebleg", "Satis_Tarixi", "OdenisinNovu", "QiemenOdenis", "Qaytarilan_Mehsul_Miqdari", "Musteriye_Geri_Odenis", "Borc_Alanin_Adi", "Yeni_goturulen_Mebleg", "Borcdan_Gelen"
            }
        ));
        jScrollPane1.setViewportView(tblSatisID);

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnKocurme.setText("Kocurme");
        btnKocurme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKocurmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1199, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnKocurme)
                        .addGap(18, 18, 18)
                        .addComponent(btnStart)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnKocurme))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        int a;
        int say = 1;
        try {

            Statement stmt = con.createStatement();
            stmt.execute("select * from satilan_mallar");
            ResultSet rs = stmt.getResultSet();
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) tblSatisID.getModel();
            df.setRowCount(0);

            while (rs.next()) {

                Vector v2 = new Vector();
                for (int i = 0; i < a; i++) {
                    v2.add(rs.getInt("id"));
                    v2.add(rs.getString("Malin_adi"));
                    v2.add(rs.getString("Miqdari"));
                    v2.add(rs.getDouble("Satis_qiymeti"));
                    v2.add(rs.getInt("Movsum_id"));
                    v2.add(rs.getInt("Kateqoriya_id"));
                    v2.add(rs.getInt("Alt_kateqoriya_id"));
                    v2.add(rs.getDouble("Umumi_Mebleg"));
                    v2.add(rs.getDate("Satis_Tarixi"));
                    v2.add(rs.getString("OdenisinNovu"));
                    v2.add(rs.getDouble("QiemenOdenis"));
                    v2.add(rs.getDouble("Qaytarilan_Mehsul_Miqdari"));
                    v2.add(rs.getDouble("Musteriye_Geri_Odenis"));
                    v2.add(rs.getString("Borc_Alanin_Adi"));
                    v2.add(rs.getDouble("Yeni_goturulen_Mebleg"));
                    v2.add(rs.getDouble("Borcdan_Gelen"));

                }
                df.addRow(v2);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_btnStartActionPerformed

    private void btnKocurmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKocurmeActionPerformed

        String ID, Malin_adi, Miqdari, Qiymeti, Movsum_ID, Kateqoriya_ID, Alt_Kateqoriya_ID, Ümumi_Məbləğ, Tarix;
        String OdenisinNovu, QiemenOdenis, Qaytarilan_Mehsul_Miqdari, Musteriye_Geri_Odenis, Borc_Alanin_Adi, Yeni_goturulen_Mebleg, Borcdan_Gelen;
        df = (DefaultTableModel) tblSatisID.getModel();

        for (int i = 0; i < df.getRowCount(); i++) {

            try {
                ID = df.getValueAt(i, 1).toString();

                ID = df.getValueAt(i, 0).toString();
                Malin_adi = df.getValueAt(i, 1).toString();
                Miqdari = df.getValueAt(i, 2).toString();
                Qiymeti = df.getValueAt(i, 3).toString();
                Movsum_ID = df.getValueAt(i, 4).toString();
                Kateqoriya_ID = df.getValueAt(i, 5).toString();
                Alt_Kateqoriya_ID = df.getValueAt(i, 6).toString();
                Ümumi_Məbləğ = df.getValueAt(i, 7).toString();
                Tarix = df.getValueAt(i, 8).toString();
                //OdenisinNovu = df.getValueAt(i, 9).toString();
                QiemenOdenis = df.getValueAt(i, 10).toString();
                Qaytarilan_Mehsul_Miqdari = df.getValueAt(i, 11).toString();
                Musteriye_Geri_Odenis = df.getValueAt(i, 12).toString();
                Borc_Alanin_Adi = df.getValueAt(i, 13).toString();
                Yeni_goturulen_Mebleg = df.getValueAt(i, 14).toString();
                Borcdan_Gelen = df.getValueAt(i, 15).toString();

                String query = "insert into satilan_mallar_copy1 (id, Malin_adi, Miqdari, Satis_qiymeti, Movsum_id, Kateqoriya_id, Alt_kateqoriya_id, Umumi_Mebleg, Satis_Tarixi, QiemenOdenis, Qaytarilan_Mehsul_Miqdari, Musteriye_Geri_Odenis, Borc_Alanin_Adi, Yeni_goturulen_Mebleg, Borcdan_Gelen) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                pres = con.prepareStatement(query);
                pres.setString(1, ID);
                pres.setString(2, Malin_adi);
                pres.setString(3, Miqdari);
                pres.setString(4, Qiymeti);
                pres.setString(5, Movsum_ID);
                pres.setString(6, Kateqoriya_ID);
                pres.setString(7, Alt_Kateqoriya_ID);
                pres.setString(8, Ümumi_Məbləğ);
                pres.setString(9, Tarix);
                //pres.setString(10, OdenisinNovu);
                pres.setString(10, QiemenOdenis);
                pres.setString(11, Qaytarilan_Mehsul_Miqdari);
                pres.setString(12, Musteriye_Geri_Odenis);
                pres.setString(13, Borc_Alanin_Adi);
                pres.setString(14, Yeni_goturulen_Mebleg);
                pres.setString(15, Borcdan_Gelen);
                pres.execute();

            } catch (SQLException ex) {
                Logger.getLogger(SatilanMallarSatisID.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnKocurmeActionPerformed

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
            java.util.logging.Logger.getLogger(SatilanMallarSatisID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SatilanMallarSatisID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SatilanMallarSatisID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SatilanMallarSatisID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SatilanMallarSatisID().setVisible(true);
            }
        });
    }

    public void connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/mehsullar", "root", "dxdiag92");
            } catch (SQLException ex) {
                Logger.getLogger(SatilanMallarSatisID.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SatilanMallarSatisID.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKocurme;
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSatisID;
    // End of variables declaration//GEN-END:variables
}