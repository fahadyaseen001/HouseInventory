/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Wajeeha Usman
 */
public class ADMIN extends javax.swing.JFrame {

    /**
     * Creates new form ADMIN
     */
    public ADMIN() {
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

        jPanel1 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        U_Name_Admin = new javax.swing.JTextPane();
        Password_Admin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(null);

        login.setBackground(new java.awt.Color(204, 0, 204));
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(190, 330, 90, 40);

        jScrollPane1.setViewportView(U_Name_Admin);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(160, 180, 160, 30);
        jPanel1.add(Password_Admin);
        Password_Admin.setBounds(160, 270, 160, 30);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Name: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 140, 140, 30);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 230, 130, 40);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 390, 80, 40);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(390, 390, 80, 40);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("            WELCOME! To Admin Panel");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-40, 50, 500, 50);

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/housesssssss.jpeg"))); // NOI18N
        pic.setText("jLabel4");
        jPanel1.add(pic);
        pic.setBounds(0, 0, 500, 460);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       String name;
        name=U_Name_Admin.getText();
        String Paswordd=Password_Admin.getText();
        if(("Ayesha".equals(name))&&("123".equals(Paswordd)))
        {
        JOptionPane.showMessageDialog(this,  "Login SuccessFull" );
        Admin_Panel AP=new Admin_Panel();
        AP.setVisible(true);
        this.dispose();
        
       Admin_Panel adp=new Admin_Panel();
       adp.setVisible(true);
       adp.setDefaultCloseOperation(0);
       
        }
        else{
            JOptionPane.showMessageDialog(this,  "Invalid Email id or pasword" );
            U_Name_Admin.setText("");
           Password_Admin.setText("");
        }
       
        Admin_Panel adp=new Admin_Panel();
       adp.setVisible(true);
       adp.setDefaultCloseOperation(0);
    }//GEN-LAST:event_loginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          Login l=new Login();
        l.setVisible(true);
        l.setDefaultCloseOperation(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          Exit ex=new Exit();
       ex.setVisible(true);
       ex.setDefaultCloseOperation(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password_Admin;
    private javax.swing.JTextPane U_Name_Admin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton login;
    private javax.swing.JLabel pic;
    // End of variables declaration//GEN-END:variables
}
