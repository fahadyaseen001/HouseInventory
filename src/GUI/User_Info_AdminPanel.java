/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import Controller.User_File;
import Controller.User_Class;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Wajeeha Usman
 */
public class User_Info_AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form User_Info_AdminPanel
     */
    public User_Info_AdminPanel() {
        initComponents();
    }
     ArrayList <User_Class> mylist=new ArrayList<>();
        User_File FH=new User_File();

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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Exitt = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Add_User_Admin = new javax.swing.JButton();
        Delete_User_Admin = new javax.swing.JButton();
        Update_User_Admin = new javax.swing.JButton();
        View_User_Admin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 10, 270, 20);

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("User Information");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(110, 10, 260, 70);

        Exitt.setBackground(new java.awt.Color(255, 255, 255));
        Exitt.setText("Exit");
        Exitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExittActionPerformed(evt);
            }
        });
        jPanel2.add(Exitt);
        Exitt.setBounds(400, 360, 80, 40);

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(30, 360, 80, 40);

        Add_User_Admin.setText("Add User");
        Add_User_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_User_AdminActionPerformed(evt);
            }
        });
        jPanel2.add(Add_User_Admin);
        Add_User_Admin.setBounds(250, 90, 120, 60);

        Delete_User_Admin.setText("Delete User");
        Delete_User_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_User_AdminActionPerformed(evt);
            }
        });
        jPanel2.add(Delete_User_Admin);
        Delete_User_Admin.setBounds(250, 160, 120, 60);

        Update_User_Admin.setText("Update User");
        Update_User_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_User_AdminActionPerformed(evt);
            }
        });
        jPanel2.add(Update_User_Admin);
        Update_User_Admin.setBounds(250, 230, 120, 50);

        View_User_Admin.setText("View User");
        View_User_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_User_AdminActionPerformed(evt);
            }
        });
        jPanel2.add(View_User_Admin);
        View_User_Admin.setBounds(250, 290, 120, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/housesssssss.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 490, 410);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 490, 410);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 490, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Admin_Panel ad=new Admin_Panel();
        ad.setVisible(true);
        ad.setDefaultCloseOperation(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Add_User_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_User_AdminActionPerformed
        // TODO add your handling code here:
       ADD_User_Admin addu=new  ADD_User_Admin();
       addu.setVisible(true);
        addu.setDefaultCloseOperation(0);
      
    }//GEN-LAST:event_Add_User_AdminActionPerformed

    private void ExittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExittActionPerformed
        // TODO add your handling code here:
         Exit ex=new Exit();
       ex.setVisible(true);
       ex.setDefaultCloseOperation(0);
    }//GEN-LAST:event_ExittActionPerformed

    private void Delete_User_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_User_AdminActionPerformed
        // TODO add your handling code here:
        Del_User del=new Del_User();
        del.setVisible(true);
        del.setDefaultCloseOperation(0);
    }//GEN-LAST:event_Delete_User_AdminActionPerformed

    private void Update_User_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_User_AdminActionPerformed
        // TODO add your handling code here:
        UP_User up= new UP_User();
        up.setVisible(true);
        up.setDefaultCloseOperation(0);
        
    }//GEN-LAST:event_Update_User_AdminActionPerformed

    private void View_User_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_User_AdminActionPerformed
        // TODO add your handling code here:
        View_User uv=new View_User();
        uv.setVisible(true);
        uv.setDefaultCloseOperation(0);
    }//GEN-LAST:event_View_User_AdminActionPerformed
    
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
            java.util.logging.Logger.getLogger(User_Info_AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Info_AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Info_AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Info_AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Info_AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_User_Admin;
    private javax.swing.JButton Delete_User_Admin;
    private javax.swing.JButton Exitt;
    private javax.swing.JButton Update_User_Admin;
    private javax.swing.JButton View_User_Admin;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}