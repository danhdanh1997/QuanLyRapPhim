/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LichChieu;

import Phim.Phim;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlrap.util.ConnectionUtils;
import static qlrap.util.ConnectionUtils.getJDBCConnection;

/**
 *
 * @author Hieu Vo
 */
public class LQLichChieuStep2 extends javax.swing.JFrame {

    /**
     * Creates new form LQLichChieuStep2
     */
    private String TenP, MALC;
    private String TGBDC, TGKTC;
    private Date NgayLc;
    SimpleDateFormat DMY = new SimpleDateFormat("dd-MM-YYYY");

    public void setNgayLc(Date NgayLc) {
        this.NgayLc = NgayLc;
    }

    public void setTenP(String TenP) {
        this.TenP = TenP;
    }

    public void setTGBDC(String TGBDC) {
        this.TGBDC = TGBDC;
    }

    public void setTGKTC(String TGKTC) {
        this.TGKTC = TGKTC;
    }

    public LQLichChieuStep2(Date NgayLC, String Tenp, Calendar TGBD, Calendar TGKT) {
        TenP = Tenp;
        NgayLc = NgayLC;
        initComponents();
        JLableTenP.setText(TenP);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public void setNgayLichC() {
        JlableCaChieu.setText(DMY.format(this.NgayLc) + "   " + this.TGBDC + "  " + this.TGKTC);
        setCbx(this.TGBDC, TGKTC, NgayLc);
    }

    public void setTenPhimChoLabel() {
        JLableTenP.setText(TenP);
    }

    public void setMALC(String a) {
        MALC = a;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    public String getMap(String TenP) {
        String a = new String();
        try {

            Connection connection = getJDBCConnection();

            String sql = "Select MaPhim from Phim where TenPhim='" + TenP + "'";
            // show data
            PreparedStatement statement = connection.prepareCall(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                a = resultSet.getString("MaPhim");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return a;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CbxPCTrong = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JLableTenP = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JlableCaChieu = new javax.swing.JLabel();
        btnQuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý ca chiếu");

        jLabel1.setText("Chọn phòng chiếu trống :");

        CbxPCTrong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThem.setText("Xác nhận");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên phim :");

        JLableTenP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLableTenP.setText("Cua lại vợ bầu");

        jLabel4.setText("Ca chiếu :");

        JlableCaChieu.setText("05/05/2019     19:20:00 - 21:00:00");

        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnQuayLai)
                .addGap(28, 28, 28)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CbxPCTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlableCaChieu))
                        .addContainerGap(130, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLableTenP, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JLableTenP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JlableCaChieu))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxPCTrong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnQuayLai))
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Chọn Phòng chiếu", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:

        QLLichChieuStep1 a = new QLLichChieuStep1();
        a.setVisible(true);
        setVisible(false);
        a.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (MALC == null) {
            insertCachieu(NgayLc, TGBDC, TGKTC, getMap(TenP), getMAPC());
        } else {
            updateCaChieu(NgayLc, TGBDC, TGKTC, getMap(TenP), getMAPC());
        }
        QLLichChieuStep1 step1 = new QLLichChieuStep1();
        step1.setVisible(true);
        step1.setLocationRelativeTo(null);
        setVisible(false);

    }//GEN-LAST:event_btnThemActionPerformed
    public void updateCaChieu(Date NgayC, String GioBD, String GioKT, String MaP, String MaPC) {
        try {

            Connection connection=null;
            try {
                connection = ConnectionUtils.getJDBCConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LQLichChieuStep2.class.getName()).log(Level.SEVERE, null, ex);
            }

            String sql = "update Cachieu set NgayChieu=?,GioBD=?,GioKT=?,MaPhim='" + MaP + "',MaPC='" + MaPC + "' where MaCC ='" + MALC + "'";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date(NgayC.getTime()));
            SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
            Date parsedDate;
            try {
                parsedDate = dateFormat.parse(GioBD);
                Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
                pst.setTimestamp(2, timestamp);
            } catch (ParseException ex) {
                Logger.getLogger(LQLichChieuStep2.class.getName()).log(Level.SEVERE, null, ex);
            }

            Date parsedDate1;
            try {
                parsedDate1 = dateFormat.parse(GioKT);
                Timestamp timestamp1 = new java.sql.Timestamp(parsedDate1.getTime());
                pst.setTimestamp(3, timestamp1);
            } catch (ParseException ex) {
                Logger.getLogger(LQLichChieuStep2.class.getName()).log(Level.SEVERE, null, ex);
            }

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cập nhật thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertCachieu(Date NgayC, String GioBD, String GioKT, String MaP, String MaPC) {
        try {
            Connection connection=null;
            try {
                connection = getJDBCConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LQLichChieuStep2.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "insert into caChieu values (null,?,?,?,?,?)";
            // show data
            PreparedStatement statement;
            statement = connection.prepareCall(sql);
            statement.setDate(1, new java.sql.Date(NgayC.getTime()));
            SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
            Date parsedDate;
            try {
                parsedDate = dateFormat.parse(GioBD);
                Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
                statement.setTimestamp(2, timestamp);
            } catch (ParseException ex) {
                Logger.getLogger(LQLichChieuStep2.class.getName()).log(Level.SEVERE, null, ex);
            }

            Date parsedDate1;
            try {
                parsedDate1 = dateFormat.parse(GioKT);
                Timestamp timestamp1 = new java.sql.Timestamp(parsedDate1.getTime());
                statement.setTimestamp(3, timestamp1);
            } catch (ParseException ex) {
                Logger.getLogger(LQLichChieuStep2.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement.setString(4, MaP);
            statement.setString(5, MaPC);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            // close connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getMAPC() {
        String TenPC = CbxPCTrong.getSelectedItem().toString();
        String a = new String();
        try {

            Connection connection = getJDBCConnection();

            String sql = "select MAPc from PhongChieu where TenPc=N'" + TenPC + "'";
            // show data
            PreparedStatement statement;
            statement = connection.prepareCall(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                a = resultSet.getString("MAPC");
            }
            // close connection
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return a;
    }

    public void setCbx(String GioBd, String GioKT, Date NgayChieu) {
        ArrayList<String> ListPC = new ArrayList();
        try {
            Connection connection = getJDBCConnection();
            String sql = "select TenPC from phongchieu where mapc not in(select MaPC from cachieu where ((('" + GioBd + "' between GIOBD  and GIOKT)or ('" + GioKT + "' between GIOBD  and GIOKT)) and NgayChieu=?))";
            // show data 
            //
            PreparedStatement statement;
            statement = connection.prepareCall(sql);
            statement.setDate(1, new java.sql.Date(NgayChieu.getTime()));
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String p = resultSet.getString("TenPC");
                ListPC.add(p);
            }
            // close connection
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        DefaultComboBoxModel model = (DefaultComboBoxModel) CbxPCTrong.getModel();
        model.removeAllElements();
        Object[] TPC = new Object[ListPC.size()];
        for (int j = 0; j < ListPC.size(); j++) {
            //JOptionPane.showMessageDialog(null,ListP.get(j).getMaP());
            TPC[j] = ListPC.get(j).toString();
            model.addElement(TPC[j]);
        }
        CbxPCTrong.setModel(model);

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
            java.util.logging.Logger.getLogger(LQLichChieuStep2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LQLichChieuStep2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LQLichChieuStep2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LQLichChieuStep2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LQLichChieuStep2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxPCTrong;
    private javax.swing.JLabel JLableTenP;
    private javax.swing.JLabel JlableCaChieu;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
