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
public class ADD_User_Admin extends javax.swing.JFrame {

    /**
     * Creates new form ADD_User
     */
    public ADD_User_Admin() {
        initComponents();
    }
 ArrayList<User_Class> add = new ArrayList<User_Class>();
 User_File F=new User_File();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PHONE_User = new javax.swing.JButton();
        EMAIL_User = new javax.swing.JButton();
        CNIC_User = new javax.swing.JButton();
        Name_User3 = new javax.swing.JButton();
        Add_Uinfo = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Phone_U = new javax.swing.JTextField();
        Name_U = new javax.swing.JTextField();
        Email_U = new javax.swing.JTextField();
        Cnic_U = new javax.swing.JTextField();
        head = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(null);

        PHONE_User.setText("Phone:");
        PHONE_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHONE_UserActionPerformed(evt);
            }
        });
        jPanel1.add(PHONE_User);
        PHONE_User.setBounds(80, 280, 80, 40);

        EMAIL_User.setText("E-Mail:");
        jPanel1.add(EMAIL_User);
        EMAIL_User.setBounds(80, 230, 80, 40);

        CNIC_User.setText("CNIC:");
        jPanel1.add(CNIC_User);
        CNIC_User.setBounds(80, 180, 80, 40);

        Name_User3.setText("Name:");
        jPanel1.add(Name_User3);
        Name_User3.setBounds(80, 130, 80, 40);

        Add_Uinfo.setText("Add");
        Add_Uinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_UinfoActionPerformed(evt);
            }
        });
        jPanel1.add(Add_Uinfo);
        Add_Uinfo.setBounds(230, 420, 90, 60);

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(40, 420, 90, 60);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(430, 410, 90, 60);
        jPanel1.add(Phone_U);
        Phone_U.setBounds(240, 280, 220, 40);
        jPanel1.add(Name_U);
        Name_U.setBounds(240, 130, 220, 40);
        jPanel1.add(Email_U);
        Email_U.setBounds(240, 230, 220, 40);
        jPanel1.add(Cnic_U);
        Cnic_U.setBounds(240, 180, 220, 40);

        head.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        head.setForeground(new java.awt.Color(51, 0, 51));
        head.setText("ADD USER INFORMATION");
        jPanel1.add(head);
        head.setBounds(90, 10, 350, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/housesssssss.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_UinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_UinfoActionPerformed
        // TODO add your handling code here:
    

         Boolean b=false;
        String Option;
      
      
        User_File UF=new User_File();
        String userName=Name_U.getText();
        String userEmail=Email_U.getText();
        String userCnic=Cnic_U.getText();
        String userPhone= Phone_U.getText();
         
        
       
        
        UF.addUser(userName, userEmail, userCnic, userPhone);
        JOptionPane.showMessageDialog(this,"Records added successfully");
        Option=JOptionPane.showInputDialog(this,"Do u want to add another User");
        if(Option.equals("Yes"))
        {
           
            Name_U.setText("");
            Email_U.setText("");
            Cnic_U.setText("");
            Phone_U.setText("");
            
             b=true;
        }
        else{
            b=false;
        }


    }//GEN-LAST:event_Add_UinfoActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
         Exit ex=new Exit();
       ex.setVisible(true);
       ex.setDefaultCloseOperation(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        User_Info_AdminPanel u=new User_Info_AdminPanel();
        u.setVisible(true);
        u.setDefaultCloseOperation(0);
    }//GEN-LAST:event_BackActionPerformed

    private void PHONE_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PHONE_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PHONE_UserActionPerformed

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
            java.util.logging.Logger.getLogger(ADD_User_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADD_User_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADD_User_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADD_User_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADD_User_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Uinfo;
    private javax.swing.JButton Back;
    private javax.swing.JButton CNIC_User;
    private javax.swing.JTextField Cnic_U;
    private javax.swing.JButton EMAIL_User;
    private javax.swing.JTextField Email_U;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField Name_U;
    private javax.swing.JButton Name_User3;
    private javax.swing.JButton PHONE_User;
    private javax.swing.JTextField Phone_U;
    private javax.swing.JLabel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}