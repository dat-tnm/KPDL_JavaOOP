/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong03.dohoa;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapp00.chuong03.dohoa.frames.CoffeeFrame;
import javaapp00.chuong03.dohoa.frames.XuatDuLieuFrame;

/**
 *
 * @author Admin
 */
public class MyMainForm extends javax.swing.JFrame {

    XuatDuLieuFrame frm;
    CoffeeFrame coffeeF;
    /**
     * Creates new form MyMainForm
     */
    public MyMainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        desktopPanel = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mIExit = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mIMangMotChieu = new javax.swing.JMenuItem();
        mICoffee = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("chương trình thao tác với mảng 1 chiều");

        javax.swing.GroupLayout desktopPanelLayout = new javax.swing.GroupLayout(desktopPanel);
        desktopPanel.setLayout(desktopPanelLayout);
        desktopPanelLayout.setHorizontalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        desktopPanelLayout.setVerticalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        jMenu3.setText("File");

        mIExit.setText("Exit");
        mIExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIExitActionPerformed(evt);
            }
        });
        jMenu3.add(mIExit);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Mảng");

        mIMangMotChieu.setText("Mảng 1 chiều");
        mIMangMotChieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIMangMotChieuActionPerformed(evt);
            }
        });
        jMenu4.add(mIMangMotChieu);

        mICoffee.setText("Coffee");
        mICoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mICoffeeActionPerformed(evt);
            }
        });
        jMenu4.add(mICoffee);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(desktopPanel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mIExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mIExitActionPerformed

    private void mIMangMotChieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIMangMotChieuActionPerformed
        // TODO add your handling code here:
        if (frm == null || frm.isClosed()) {
            frm = new XuatDuLieuFrame();
            desktopPanel.add(frm);
            frm.setLocation((this.getWidth() - frm.getWidth())/2, (this.getHeight() - frm.getHeight())/2);
            frm.setVisible(true);
        }
    }//GEN-LAST:event_mIMangMotChieuActionPerformed

    private void mICoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mICoffeeActionPerformed
        // TODO add your handling code here:
        if (coffeeF == null || coffeeF.isClosed()) {
            try {
                coffeeF = new CoffeeFrame();
                desktopPanel.add(coffeeF);
                coffeeF.setLocation((this.getWidth() - coffeeF.getWidth())/2, (this.getHeight() - coffeeF.getHeight())/2);
                coffeeF.setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(MyMainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mICoffeeActionPerformed

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
            java.util.logging.Logger.getLogger(MyMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MyMainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem mICoffee;
    private javax.swing.JMenuItem mIExit;
    private javax.swing.JMenuItem mIMangMotChieu;
    // End of variables declaration//GEN-END:variables
}
