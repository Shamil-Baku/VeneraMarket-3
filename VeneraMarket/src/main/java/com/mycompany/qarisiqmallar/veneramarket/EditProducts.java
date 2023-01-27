/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.qarisiqmallar.veneramarket;

import static com.mycompany.qarisiqmallar.veneramarket.TreeView1.df;
import static com.mycompany.qarisiqmallar.veneramarket.TreeView1.jTableMehsullar;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shamil
 */
public class EditProducts extends javax.swing.JDialog {

    String productName;
    String barcode;
    String date;
    Connection con;
    PreparedStatement pres;
    ResultSet rs;
    int numberProduct;
    int qaliqsay;
    public int InputID;
    double priceBuy;
    double priceSale;

    public EditProducts(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setScreenSize();

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQaliqSay = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPriceBuy = new javax.swing.JTextField();
        txtPriceSale = new javax.swing.JTextField();
        txtBarcode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbl_Image = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mehsu adi :");

        jLabel2.setText("Qaliq say :");

        jLabel3.setText("Satis qiymeti :");

        jLabel4.setText("Alis qiymeti :");

        jLabel5.setText("Barcode :");

        jButton1.setText("Deyisikliyi tesdiq et");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Auto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Tarix :");

        lbl_Image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbl_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton3.setText("Şekil elave et");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQaliqSay, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPriceBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPriceSale, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQaliqSay)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPriceBuy)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPriceSale)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBarcode)
                        .addComponent(jButton2)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDate)
                    .addComponent(jButton1))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        productName = txtName.getText();
        qaliqsay = Integer.parseInt(txtQaliqSay.getText());
        priceBuy = Double.parseDouble(txtPriceBuy.getText());
        priceSale = Double.parseDouble(txtPriceSale.getText());
        barcode = txtBarcode.getText();
        date = txtDate.getText();

        int selectedRow = 0;
        int id = 0;
        String nameOfProduct = null;
        int qaliqSay = 0;
        double priceBuy = 0;
        double priceSale = 0;
        String barcode = null;
        String date = null;
        String productName1 = null;

        try {

            df = (DefaultTableModel) jTableMehsullar.getModel();
            selectedRow = jTableMehsullar.getSelectedRow();
            id = Integer.parseInt(df.getValueAt(selectedRow, 0).toString());
            nameOfProduct = df.getValueAt(selectedRow, 1).toString();
            qaliqSay = Integer.parseInt(df.getValueAt(selectedRow, 2).toString());
            priceBuy = Double.parseDouble(df.getValueAt(selectedRow, 3).toString());
            priceSale = Double.parseDouble(df.getValueAt(selectedRow, 4).toString());
            try {
                date = (df.getValueAt(selectedRow, 5).toString());
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Duwdum");
                barcode = df.getValueAt(selectedRow, 6).toString();
            }
            barcode = df.getValueAt(selectedRow, 6).toString();

            txtName.setText(nameOfProduct);
            this.txtQaliqSay.setText(Integer.toString(qaliqSay));
            this.txtPriceBuy.setText(Double.toString(priceBuy));
            this.txtPriceSale.setText(Double.toString(priceSale));
            this.txtBarcode.setText(barcode);
            this.txtDate.setText(date);

            int qaliqSay1 = getQaliqsay();
            double priceOfBuy1 = getPriceBuy();
            double priceOfSale1 = getPriceSale();
            String barcode1 = getBarcode();

            con = connect();
            pres = con.prepareStatement("update mehsullar set Malin_adi = ?, Qaliq_say=?, Alis_qiymeti=?, Satis_qiymeti=?, Barcode=?, Alis_Tarixi=? where id = " + id);
            pres.setString(1, productName1);
            pres.setInt(2, qaliqSay1);
            pres.setDouble(3, priceOfBuy1);
            pres.setDouble(4, priceOfSale1);
            pres.setString(5, barcode1);
            pres.setString(6, date);
            pres.executeUpdate();

            TreeView1.mouseClicked();

            JOptionPane.showMessageDialog(this, "Mehsul melumatlari ugurla yenilendi");

            this.dispose();

        } catch (Exception ex) {
            ex.printStackTrace();

            txtName.setText(nameOfProduct);
            txtQaliqSay.setText(Integer.toString(qaliqSay));
            txtPriceBuy.setText(Double.toString(priceBuy));
            txtPriceSale.setText(Double.toString(priceSale));
            txtBarcode.setText(barcode);

            String productName2 = getProductName();

            int qaliqSay2 = getQaliqsay();
            double priceOfBuy2 = getPriceBuy();
            double priceOfSale = getPriceSale();
            String barcode2 = getBarcode();
            String date2 = getDate();

            try {

                con = connect();
                pres = con.prepareStatement("update mehsullar set Malin_adi = ?, Qaliq_say=?, Alis_qiymeti=?, Satis_qiymeti=?, Barcode=?, Alis_Tarixi=? where id = " + id);
                pres.setString(1, productName2);
                pres.setInt(2, qaliqSay2);
                pres.setDouble(3, priceOfBuy2);
                pres.setDouble(4, priceOfSale);
                pres.setString(5, barcode2);
                pres.setString(6, date2);
                pres.executeUpdate();
                TreeView1.mouseClicked();

            } catch (Exception exx) {
                exx.printStackTrace();
            }

            JOptionPane.showMessageDialog(this, "Mehsul melumatlari ugurla yenilendi");

            this.dispose();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {

            String uniqueNumber = RandomCodeGenerator.rondomNumbersForBarcode();
            String newBarcode = "1234500" + uniqueNumber;
            TestClass.checkBarcode(newBarcode, InputID);

            //txtBarcode.setText(newBarcode);
        } catch (Exception ex) {
            ex.printStackTrace();

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    File f;
    String filename;
    String filePath;
    ImageIcon format = null;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //chooseImage();
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("C:\\Users\\Shamil\\Downloads\\"));
        chooser.setDialogTitle("Şəkili seçin");
        FileFilter filter = new FileNameExtensionFilter("Image Files(JPEG, JPG, PNG,)", "JPEG", "JPG", "PNG");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        String imagePath = filename;
        //Image getAbsolutePath = null;
        try {

            BufferedImage img = null;
            img = ImageIO.read(new File(f.getAbsolutePath()));
            Image img2 = img.getScaledInstance(lbl_Image.getWidth(), lbl_Image.getHeight(), Image.SCALE_SMOOTH);
            format = new ImageIcon(img2);
            lbl_Image.setIcon(format);

        } catch (Exception ex) {

        }

        filename = f.getAbsolutePath();
        filePath = (f.toString());

        try {

            File f = new File(filename);
            InputStream is = new FileInputStream(f);

            con = connect();
            pres = con.prepareStatement("update mehsullar set imagePath = ? where id = " + InputID);
            pres.setBlob(1, is);
            pres.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Mehsulun tesviri ugurla elave olundu", "Info", HEIGHT);

        } catch (Exception ex) {
            //ex.printStackTrace();
            String errorMessage =  ex.getMessage();
            JOptionPane.showMessageDialog(this, "Sekil teleb olunan standarta uygun deyil! \n "+errorMessage, date, HEIGHT);

        }


    }//GEN-LAST:event_jButton3ActionPerformed

    public String getProductName() {
        return productName;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getQaliqsay() {
        return qaliqsay;
    }

    public double getPriceBuy() {
        return priceBuy;
    }

    public double getPriceSale() {
        return priceSale;
    }

    public String getDate() {
        return date;
    }

    public void setScreenSize() {

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

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
            java.util.logging.Logger.getLogger(EditProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditProducts dialog = new EditProducts(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Image;
    public static javax.swing.JTextField txtBarcode;
    public javax.swing.JTextField txtDate;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtPriceBuy;
    public javax.swing.JTextField txtPriceSale;
    public javax.swing.JTextField txtQaliqSay;
    // End of variables declaration//GEN-END:variables
}