package perpustakaan;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tarigan
 */
public class buku extends javax.swing.JFrame {

    /**
     * Creates new form buku
     */
    int x=0;
    
    public buku() {
        initComponents();
        datatable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTahun = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_buku = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        id_buku = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBuku = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPengarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPenerbit = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTahunActionPerformed(evt);
            }
        });
        getContentPane().add(txtTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 155, 301, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 255, -1, -1));

        tb_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode_Buku", "Nama_Buku", "Nama_Pengarang", "Penerbit", "Tahun_Terbit", "Status"
            }
        ));
        tb_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_bukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_buku);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 284, 613, 102));

        jLabel7.setText(":");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 54, -1, -1));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 193, -1, -1));

        jLabel8.setText(":");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 80, -1, -1));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 193, 65, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("DATA BUKU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 11, -1, -1));

        jLabel9.setText(":");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 106, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 255, 71, -1));

        jLabel10.setText(":");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 132, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Buku");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 193, 71, -1));

        jLabel11.setText(":");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 158, -1, -1));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 363, 71, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Buku");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        id_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_bukuActionPerformed(evt);
            }
        });
        getContentPane().add(id_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 51, 301, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pengarang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, -1, -1));
        getContentPane().add(txtBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 77, 301, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Penerbit");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 132, -1, -1));
        getContentPane().add(txtPengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 103, 301, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tahun Terbit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, -1, -1));
        getContentPane().add(txtPenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 129, 301, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Tabel Data Buku");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 261, -1, -1));
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 256, 118, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icon/anggota.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTahunActionPerformed

    private void id_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_bukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_bukuActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
//        tb_buku.setValueAt("", tb_buku.getSelectedRow(),0);
//        tb_buku.setValueAt("", tb_buku.getSelectedRow(),1);
//        tb_buku.setValueAt("", tb_buku.getSelectedRow(),2);
//        tb_buku.setValueAt("", tb_buku.getSelectedRow(),3);
//        tb_buku.setValueAt("", tb_buku.getSelectedRow(),4);

        String Kode_Buku = id_buku.getText();
        String Nama_Buku = txtBuku.getText();
        try{
            Statement statement = (Statement)koneksi.getConnection().createStatement();
            statement.executeUpdate("delete from tb_buku where Kode_Buku='"+ Kode_Buku +"' OR Nama_Buku='"+ Nama_Buku +"';");
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            id_buku.setText("");
            txtBuku.setText("");
            txtPengarang.setText("");            
            txtPenerbit.setText(null);            
            txtTahun.setText("");            
        }catch(Exception t){
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
        datatable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        id_buku.setText("");
        txtBuku.setText("");
        txtPengarang.setText("");
        txtPenerbit.setText("");
        txtTahun.setText("");
        id_buku.requestFocus();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String Kode_Buku = id_buku.getText();
        String Nama_Buku = txtBuku.getText();
        String Nama_Pengarang = txtPengarang.getText();
        String Penerbit = txtPenerbit.getText();
        String Tahun_Terbit = txtTahun.getText();
        String Status = "Tersedia";
        try{
            Statement statement = (Statement)koneksi.getConnection().createStatement();
            statement.executeUpdate("insert into tb_buku VALUES ('"+ Kode_Buku +"','"+ Nama_Buku +"','"+ Nama_Pengarang +"','"+ Penerbit +"','"+ Tahun_Terbit +"','"+ Status +"');");
            statement.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            id_buku.setText("");
            txtBuku.setText("");
            txtPengarang.setText("");
            txtPenerbit.setText(null);
            txtTahun.setText("");
        }catch(Exception t){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
        datatable();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try{
            Statement statement = (Statement)koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from tb_buku where "+"Kode_Buku like '%"+txtSearch.getText()+"%' OR "+"Nama_Buku like '%"+txtSearch.getText()+"%'");
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Kode_Buku");
            tbl.addColumn("Nama_Buku");
            tbl.addColumn("Nama_Pengarang");
            tbl.addColumn("Penerbit");
            tbl.addColumn("Tahun_Terbit");
            
            tb_buku.setModel(tbl);
            while(res.next()){
                tbl.addRow(new Object[]{
                    res.getString("Kode_Buku"),
                    res.getString("Nama_Buku"),
                    res.getString("Nama_Pengarang"),
                    res.getString("Penerbit"),
                    res.getString("Tahun_Terbit"),
                    res.getString("Status"),
                });
            tb_buku.setModel(tbl);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
                
        txtSearch.setText("");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if (btnEdit.getText() == "btnEdit"){
            id_buku.requestFocus();
        }else{
            String Kode_Buku = id_buku.getText();
            String Nama_Buku = txtBuku.getText();
            String Nama_Pengarang = txtPengarang.getText();
            String Penerbit = (String) txtPenerbit.getText();
            String Tahun_Terbit = txtTahun.getText();
            try{
                Statement statement = (Statement)koneksi.getConnection().createStatement();
                statement.executeUpdate("update tb_buku set Kode_Buku='"+ Kode_Buku +"',"+"Nama_Buku='"+ Nama_Buku +"',"+"Nama_Pengarang='"+ Nama_Pengarang +"',"+"Penerbit='"+ Penerbit +"',"+"Tahun_Terbit='"+ Tahun_Terbit +"'"+ "WHERE Kode_Buku='"+ Kode_Buku +"' OR Nama_Buku='"+ Nama_Buku +"'");
                statement.close();
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
                id_buku.setText("");
                txtBuku.setText("");
                txtPengarang.setText("");
                txtPenerbit.setText("");
                txtTahun.setText("");
            }catch(Exception t){
                JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
            }
            datatable();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tb_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_bukuMouseClicked
        // TODO add your handling code here:
        int i= tb_buku.getSelectedRow();
        if(i == -1){
            return;
        }
        String Kode_Buku = (String) tb_buku.getValueAt(i, 0);
        id_buku.setText(Kode_Buku);
        String Nama_Buku = (String) tb_buku.getValueAt(i, 1);
        txtBuku.setText(Nama_Buku);
        String Nama_Pengarang = (String) tb_buku.getValueAt(i, 2);
        txtPengarang.setText(Nama_Pengarang);
        String Penerbit = (String) tb_buku.getValueAt(i, 3);
        txtPenerbit.setText(Penerbit);
        String Tahun_Terbit = (String) tb_buku.getValueAt(i, 4);
        txtTahun.setText(Tahun_Terbit);
    }//GEN-LAST:event_tb_bukuMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField id_buku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_buku;
    private javax.swing.JTextField txtBuku;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables

    private void datatable() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode_Buku");
        tbl.addColumn("Nama_Buku");
        tbl.addColumn("Nama_Pengarang");
        tbl.addColumn("Penerbit");
        tbl.addColumn("Tahun_Terbit");
        tbl.addColumn("Status");
        tb_buku.setModel(tbl);
        try{
            Statement statement = (Statement) koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from tb_buku");
            while(res.next())
            {
                tbl.addRow(new Object[]{
                    res.getString("Kode_Buku"),
                    res.getString("Nama_Buku"),
                    res.getString("Nama_Pengarang"),
                    res.getString("Penerbit"),
                    res.getString("Tahun_Terbit"),
                    res.getString("Status"),
                });
                tb_buku.setModel(tbl);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Gagal");
        }    
    }
}
