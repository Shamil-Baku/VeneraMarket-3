/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.qarisiqmallar.veneramarket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class createNewCapitalBudget extends javax.swing.JDialog {

    Connection con;
    PreparedStatement pres;
    ResultSet rs;
    ResultSet rs2;

    public createNewCapitalBudget(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        load();
        setTime();

    }

    public Connection connect() {
        try {

            //Class.forName("com.mysql.jdbc.Driver");
            String url = ("jdbc:mysql://localhost:3306/mehsullar");
            String usercategoryOfProduct = ("root");
            String password = ("dxdiag92");
            con = DriverManager.getConnection(url, usercategoryOfProduct, password);

        } catch (Exception ex) {

        }

        return con;

    }

    public void load() {

        try {
            double totalStartCapital = 0;
            double roundedTotalCapital = 0;
            con = connect();
            pres = con.prepareStatement("select AmountOfCapitalBudget from capitalbudget");
            rs = pres.executeQuery();

            while (rs.next()) {
                double currentCapitalBudget = rs.getDouble("AmountOfCapitalBudget");
                totalStartCapital += currentCapitalBudget;
                roundedTotalCapital = Math.round(totalStartCapital * 100.000) / 100.000;
            }

            txtStartCapital.setText(Double.toString(roundedTotalCapital));

            con = connect();
            pres = con.prepareStatement("select AmountOfCapitalBudget from updatedcapitalbudget order by id desc limit 1");
            rs2 = pres.executeQuery();

            rs2.next();

            double currentCapitalBudget = rs2.getDouble("AmountOfCapitalBudget");
            txtCurrentCapitalBudget.setText(Double.toString(currentCapitalBudget));

            if (totalStartCapital > 0) {

                btnAdd.disable();

            }

        } catch (Exception ex) {

            ex.printStackTrace();
        }

    }

    String time;
    String currentTime;
    Timer timer;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf2;

    public void setTime() {

        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                //sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                sdf2 = new SimpleDateFormat("dd-MM-yyyy");

                time = sdf2.format(dt);
                currentTime = sdf.format(dt);

                txtDate.setText(time);

            }
        });
        timer.start();

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
        txtStartCapital = new javax.swing.JTextField();
        txtCurrentCapitalBudget = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        cbWhoPutBudget = new javax.swing.JComboBox<>();
        txtDate = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCommentary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtStartCapital.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        txtCurrentCapitalBudget.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setText("Elave et");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        cbWhoPutBudget.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçim edin..", "Zülfiyye", "Şamil", "Ramil", "Hecer" }));

        txtDate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Start Kapital Büdce");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Cari Büdce");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Kim terefinden :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Tarix :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Daxil edilen mebleg :");

        txtCommentary.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Komentari :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtTotal)
                            .addComponent(txtDate)
                            .addComponent(cbWhoPutBudget, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStartCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCurrentCapitalBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel2))))
                    .addComponent(txtCommentary))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStartCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurrentCapitalBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbWhoPutBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCommentary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String name = cbWhoPutBudget.getSelectedItem().toString();
        if (name.equals("Seçim edin..")) {

            JOptionPane.showMessageDialog(this, "Zehmet olmasa - Kim terefinden xanasini doldurun", "DİQQET!!", HEIGHT);

    }//GEN-LAST:event_btnAddActionPerformed
   
        else {
            initialBudget();
        }

    }

    public void initialBudget() {

        double startBudget = Double.parseDouble(txtStartCapital.getText());
        double totalSum = Double.parseDouble(txtTotal.getText());
        String name = cbWhoPutBudget.getSelectedItem().toString();
        String date = currentTime;

        if (startBudget > 0) {

            JOptionPane.showMessageDialog(this, "Siz artiq ilkin Kapitalinizi yaratmisiniz. Kapital meblegini alatmaq \n veya artirmaq üçün + ve - düymelerinden istifade edin", "DİQQET!!", HEIGHT);

        } else {

            if (totalSum == 0.0) {
                JOptionPane.showMessageDialog(this, "Mebleğ sıfır veya ondan kicik ola bilmez!", "DİQQET!!", HEIGHT);
            } else {
                try {

                    con = connect();
                    pres = con.prepareStatement("insert into capitalbudget (AmountOfCapitalBudget, WhoPutBudget, date) values(?,?,?)");
                    pres.setDouble(1, totalSum);
                    pres.setString(2, name);
                    pres.setString(3, date);
                    pres.execute();

                    pres = con.prepareStatement("insert into updatedCapitalbudget (AmountOfCapitalBudget, date, `from`, `status`, processedValue) values(?,?,?,?,?)");
                    pres.setDouble(1, totalSum);
                    pres.setString(2, currentTime);
                    pres.setString(3, "İlkin kapital deyeri " + name +" - terefinden teyin edildi");
                    pres.setString(4, "+");
                    pres.setDouble(5, totalSum);
                    pres.executeUpdate();

                    JOptionPane.showMessageDialog(this, "İlkin kapital mebleginiz ugurla teyin olundu", "Info", HEIGHT);

                    txtTotal.setText("0.0");
                    txtDate.setText("");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }

        load();
    }

    public void updateInitialBudget(String operationType) {

        double startBudget = Double.parseDouble(txtStartCapital.getText());
        double totalSum = Double.parseDouble(txtTotal.getText());
        String name = cbWhoPutBudget.getSelectedItem().toString();
        String date = currentTime;

        try {

            con = connect();
            pres = con.prepareStatement("update capitalbudget set AmountOfCapitalBudget = AmountOfCapitalBudget " + operationType + " ?, date = ? where id = ?");
            pres.setDouble(1, totalSum);
            pres.setString(2, date);
            pres.setInt(3, 1);
            pres.execute();

            txtTotal.setText("0.0");
            txtDate.setText("");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        double totalSum = Double.parseDouble(txtTotal.getText());
        String operationType = "+";
        String name = cbWhoPutBudget.getSelectedItem().toString();
        if (name.equals("Seçim edin..")) {
            JOptionPane.showMessageDialog(this, "Zehmet olmasa - Kim terefinden xanasini doldurun", "DİQQET!!", HEIGHT);
        } else {

            if (totalSum == 0.0) {
                JOptionPane.showMessageDialog(this, "Mebleğ sıfır veya ondan kicik ola bilmez!", "DİQQET!!", HEIGHT);
            } else {

                addBudget();
                updateInitialBudget(operationType);
                JOptionPane.showMessageDialog(this, "Kapital mebleği uğurla yenilendi!", "Info", HEIGHT);
                load();
                txtTotal.setText("0.0");
                txtDate.setText("");
            }
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        double totalSum = Double.parseDouble(txtTotal.getText());
        String operationType = "-";
        String name = cbWhoPutBudget.getSelectedItem().toString();
        if (name.equals("Seçim edin..")) {
            JOptionPane.showMessageDialog(this, "Zehmet olmasa - Kim terefinden xanasini doldurun", "DİQQET!!", HEIGHT);
        } else {

            if (totalSum == 0.0) {
                JOptionPane.showMessageDialog(this, "Mebleğ sıfır veya ondan kicik ola bilmez!", "DİQQET!!", HEIGHT);
            } else {

                minusBudget();
                updateInitialBudget(operationType);
                JOptionPane.showMessageDialog(this, "Kapital mebleği uğurla yenilendi!", "Info", HEIGHT);
                load();
                txtTotal.setText("0.0");
                txtDate.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
        }
    }

    public void addBudget() {

        double totalSum = Double.parseDouble(txtTotal.getText());
        String name = cbWhoPutBudget.getSelectedItem().toString();
        String commentary = txtCommentary.getText();

        try {

            pres = con.prepareStatement("select * from updatedCapitalbudget order by id desc limit 1");
            rs = pres.executeQuery();

            rs.next();

            double capitalBudget = rs.getDouble("AmountOfCapitalBudget");

            double result = capitalBudget + totalSum;
            double roundedResult = Math.round(result * 100.000) / 100.000;
            double roundedTotalSum = Math.round(totalSum * 100.000) / 100.000;

            pres = con.prepareStatement("insert into updatedCapitalbudget (AmountOfCapitalBudget, date, `from`, `status`, processedValue, commentary ) values(?,?,?,?,?,?)");
            pres.setDouble(1, roundedResult);
            pres.setString(2, currentTime);
            pres.setString(3, "Büdce - " + name+ " terefinden artirildi");
            pres.setString(4, "+");
            pres.setDouble(5, roundedTotalSum);
            pres.setString(6, commentary);
            pres.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void minusBudget() {

        double totalSum = Double.parseDouble(txtTotal.getText());
        String name = cbWhoPutBudget.getSelectedItem().toString();

        try {

            pres = con.prepareStatement("select * from updatedCapitalbudget order by id desc limit 1");
            rs = pres.executeQuery();

            rs.next();

            double capitalBudget = rs.getDouble("AmountOfCapitalBudget");

            double result = capitalBudget - totalSum;
            double roundedResult = Math.round(result * 100.000) / 100.000;
            double roundedTotalSum = Math.round(totalSum * 100.000) / 100.000;

            pres = con.prepareStatement("insert into updatedCapitalbudget (AmountOfCapitalBudget, date, `from`, `status`, processedValue) values(?,?,?,?,?)");
            pres.setDouble(1, roundedResult);
            pres.setString(2, currentTime);
            pres.setString(3, "Kapital meblegi " + name +" - terefinden çıxarıldı");
            pres.setString(4, "-");
            pres.setDouble(5, roundedTotalSum);
            pres.executeUpdate();

            load();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

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
            java.util.logging.Logger.getLogger(createNewCapitalBudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createNewCapitalBudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createNewCapitalBudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createNewCapitalBudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                createNewCapitalBudget dialog = new createNewCapitalBudget(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cbWhoPutBudget;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCommentary;
    private javax.swing.JTextField txtCurrentCapitalBudget;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtStartCapital;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}