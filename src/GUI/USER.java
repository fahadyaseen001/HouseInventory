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
public class USER extends javax.swing.JFrame {

    /**
     * Creates new form USER
     */
    public USER() {
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        U_Password_User = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        U_Name_User = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("WELCOME! To User Panel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, -10, 340, 100);

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 260, 80, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("User Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 120, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 180, 130, 40);
        jPanel1.add(U_Password_User);
        U_Password_User.setBounds(160, 210, 130, 30);

        jScrollPane1.setViewportView(U_Name_User);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(150, 150, 160, 30);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 330, 90, 50);

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(370, 320, 80, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/housesssssss.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 470, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 470, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name;
        name=U_Name_User.getText();
        String Paswordd=U_Password_User.getText();
        if(("Fizza".equals(name))&&("702".equals(Paswordd))||("Irsa".equals(name))&&("456".equals(Paswordd))||("Wajeeha".equals(name))&&("789".equals(Paswordd)))
        {
        JOptionPane.showMessageDialog(this,  "Login SuccessFull" );
        Admin_Panel AP=new Admin_Panel();
        AP.setVisible(true);
        this.dispose();
        
      User_Panel up =new User_Panel();
        up.setVisible(true);
        up.setDefaultCloseOperation(0);
       
        }
        else{
            JOptionPane.showMessageDialog(this,  "Invalid Email id or pasword" );
            U_Name_User.setText("");
           U_Password_User.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login l=new Login();
        l.setVisible(true);
        l.setDefaultCloseOperation(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         Exit ex=new Exit();
       ex.setVisible(true);
       ex.setDefaultCloseOperation(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new USER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane U_Name_User;
    private javax.swing.JPasswordField U_Password_User;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
