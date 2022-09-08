/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.view;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlbh.dao.PhieuNhapHHDAO;
import qlbh.model.PhieuNhapHH;

/**
 *
 * @author DELL
 */
public class PhieuNhapHHJPanel extends javax.swing.JPanel {

    DefaultTableModel dtm = new DefaultTableModel();
    /**
     * Creates new form PhieuNhapHHJPanel
     */
    public PhieuNhapHHJPanel() {
        initComponents();
        
        String []tieuDe = {"Mã Phiếu Nhập", "Mã Nhà Cung Cấp", "Ngày Nhập", "Mã Nhân Viên", "Tổng Tiền"};
        dtm.setColumnIdentifiers(tieuDe);
        tbPhieuNhap.setModel(dtm);
        
        hienThi();
    }
    public void hienThi() {
        ArrayList<PhieuNhapHH> dsPNHH = PhieuNhapHHDAO.layDanhSachPhieuNhapHH();
        dtm.setRowCount(0);
        for(PhieuNhapHH pn:dsPNHH){
            Vector<Object> vec = new Vector<Object>();
            vec.add(pn.getMaPN());
            vec.add(pn.getMaNCC());
            vec.add(pn.getNgayNhap());
            vec.add(pn.getMaNV());
            vec.add(pn.getTongTien());
            dtm.addRow(vec);
    }
        tbPhieuNhap.setModel(dtm);
}
    
    public void hienThiTK(){
        String maPN = txtSearch.getText();
        PhieuNhapHHDAO.timKiemPhieuNhapHHTheoMa(maPN);
        ArrayList<PhieuNhapHH> dsPN = PhieuNhapHHDAO.timKiemPhieuNhapHHTheoMa(maPN);
        dtm.setRowCount(0);
        for(PhieuNhapHH ph:dsPN){
            Vector<Object> vec = new Vector<Object>();
            vec.add(ph.getMaPN());
            vec.add(ph.getMaNCC());
            vec.add(ph.getNgayNhap());
            vec.add(ph.getMaNV());
            vec.add(ph.getTongTien());
            dtm.addRow(vec);
    }
        tbPhieuNhap.setModel(dtm);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaPN = new javax.swing.JTextField();
        txtMaNCC = new javax.swing.JTextField();
        txtNgayNhap = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        btThem = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btTim = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCapNhat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhieuNhap = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(102, 255, 0));

        jPanel2.setBackground(new java.awt.Color(102, 255, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mã PN:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Mã NCC:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Ngày nhập:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Mã NV:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Tổng Tiền:");

        txtMaPN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtMaNCC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNgayNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtTongTien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btThem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbh/images/logoThem.png"))); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btLuu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbh/images/logoLuu.png"))); // NOI18N
        btLuu.setText("Lưu");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        btXoa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbh/images/logoXoa.png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btTim.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbh/images/logoTimKiem.png"))); // NOI18N
        btTim.setText("Tìm");
        btTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Nhập mã cần tìm:");

        txtCapNhat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbh/images/logoCapNhat.png"))); // NOI18N
        txtCapNhat.setText("Cập Nhật");
        txtCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btTim, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(59, 59, 59)
                                .addComponent(txtMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtCapNhat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btLuu, btThem, btXoa, txtCapNhat});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTim, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 0));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tbPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPhieuNhap);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhieuNhapMouseClicked
        // TODO add your handling code here:
        int row = tbPhieuNhap.getSelectedRow();
        txtMaPN.setText((String ) tbPhieuNhap.getValueAt(row, 0));
        txtMaNCC.setText((String) tbPhieuNhap.getValueAt(row, 1));
        txtNgayNhap.setText((String) tbPhieuNhap.getValueAt(row, 2));
        txtMaNV.setText((String) tbPhieuNhap.getValueAt(row, 3));
        txtTongTien.setText((float) tbPhieuNhap.getValueAt(row, 4)+"");
        
    }//GEN-LAST:event_tbPhieuNhapMouseClicked

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        txtMaPN.setText("");
        txtMaNCC.setText("");
        txtNgayNhap.setText("");
        txtMaNV.setText("");
        txtTongTien.setText("");
    }//GEN-LAST:event_btThemActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
        //nếu rỗng
        if(txtMaPN.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Không được để mã số rỗng");
        txtMaPN.requestFocus();
        }
        else{
            String maPN = txtMaPN.getText();
            String maNCC = txtMaNCC.getText();
            String ngayNhap = txtNgayNhap.getText();
            String maNV = txtMaNV.getText();
            float tongTien = Float.parseFloat(txtTongTien.getText());
            PhieuNhapHH pn = new PhieuNhapHH();
            pn.setMaPN(maPN);
            pn.setMaNCC(maNCC);
            pn.setNgayNhap(ngayNhap);
            pn.setMaNV(maNV);
            pn.setTongTien(tongTien);
            PhieuNhapHHDAO.themPhieuNhapHH(pn);
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            hienThi();
        }
    }//GEN-LAST:event_btLuuActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        if(tbPhieuNhap.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Chọn dòng cần xóa");
            return;
        }
        int xoa = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (xoa == JOptionPane.YES_OPTION){
            try {
                String mapn = txtMaPN.getText();
                PhieuNhapHH pn = new PhieuNhapHH();
                pn.setMaPN(mapn);
                PhieuNhapHHDAO.xoaPhieuNhapHH(mapn);
                JOptionPane.showMessageDialog(null, "Xóa thành công");
                hienThi();
            } catch (Exception e) {
                System.out.println("Không xóa được");
            }
        }  
    }//GEN-LAST:event_btXoaActionPerformed

    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
        // TODO add your handling code here:
        hienThiTK();
    }//GEN-LAST:event_btTimActionPerformed

    private void txtCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapNhatActionPerformed
        // TODO add your handling code here:
        String mapn = txtMaPN.getText();
        String mancc = txtMaNCC.getText();
        String ngayNhap = txtNgayNhap.getText();
        String manv = txtMaNV.getText();
        float tongtien = Float.parseFloat(txtTongTien.getText());
        PhieuNhapHH pn = new PhieuNhapHH(mapn, mancc, ngayNhap, manv, tongtien);
        PhieuNhapHHDAO.capNhatPhieuNhapHH(pn);
        hienThi();
        JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtCapNhatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTim;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPhieuNhap;
    private javax.swing.JButton txtCapNhat;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaPN;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

}
