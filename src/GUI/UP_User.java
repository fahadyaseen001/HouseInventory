/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.User_File;
import Controller.User_Class;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Wajeeha Usman
 */
public class UP_User extends javax.swing.JFrame {

          
    /**
     * Creates new form User_Class
     */
    public UP_User() {
        initComponents();
    }
        ArrayList <User_Class>arrayList=new ArrayList<>();
            User_File User_FileObj=new  User_File();
            User_Class  U_classobj=new User_Class();
            
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Up = new javax.swing.JButton();
        Exitt = new javax.swing.JButton();
        Backk = new javax.swing.JButton();
        head = new javax.swing.JLabel();
        Name_User3 = new javax.swing.JButton();
        Name_U = new javax.swing.JTextField();
        Cnic_U = new javax.swing.JTextField();
        CNIC_User = new javax.swing.JButton();
        EMAIL_User = new javax.swing.JButton();
        Email_U = new javax.swing.JTextField();
        Phone_U = new javax.swing.JTextField();
        PHONE_User = new javax.swing.JButton();
        Update_n = new javax.swing.JButton();
        updatename = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        Up.setText("Update");
        Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpActionPerformed(evt);
            }
        });
        jPanel1.add(Up);
        Up.setBounds(180, 360, 90, 50);

        Exitt.setText("Exiit");
        Exitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExittActionPerformed(evt);
            }
        });
        jPanel1.add(Exitt);
        Exitt.setBounds(360, 360, 90, 50);

        Backk.setText("Back");
        Backk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackkActionPerformed(evt);
            }
        });
        jPanel1.add(Backk);
        Backk.setBounds(20, 360, 90, 50);

        head.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        head.setForeground(new java.awt.Color(51, 0, 51));
        head.setText("UPDATE USER INFORMATION");
        jPanel1.add(head);
        head.setBounds(50, 10, 400, 70);

        Name_User3.setText("Name:");
        jPanel1.add(Name_User3);
        Name_User3.setBounds(50, 130, 80, 30);
        jPanel1.add(Name_U);
        Name_U.setBounds(210, 130, 220, 30);
        jPanel1.add(Cnic_U);
        Cnic_U.setBounds(210, 180, 220, 30);

        CNIC_User.setText("CNIC:");
        jPanel1.add(CNIC_User);
        CNIC_User.setBounds(50, 180, 80, 30);

        EMAIL_User.setText("E-Mail:");
        jPanel1.add(EMAIL_User);
        EMAIL_User.setBounds(50, 230, 80, 30);
        jPanel1.add(Email_U);
        Email_U.setBounds(210, 230, 220, 30);
        jPanel1.add(Phone_U);
        Phone_U.setBounds(210, 280, 220, 30);

        PHONE_User.setText("Phone:");
        PHONE_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHONE_UserActionPerformed(evt);
            }
        });
        jPanel1.add(PHONE_User);
        PHONE_User.setBounds(50, 280, 80, 30);

        Update_n.setText("Name To Update");
        jPanel1.add(Update_n);
        Update_n.setBounds(50, 80, 130, 40);
        jPanel1.add(updatename);
        updatename.setBounds(210, 80, 220, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/housesssssss.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 430);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpActionPerformed
        // TODO update your handling code here:
        arrayList=User_FileObj.readfromFile();
     User_Class [] array_U_class=new User_Class [arrayList.size ()];
           
         for(int i=0;i<arrayList.size();i++)
         {
           
             array_U_class[i]=arrayList.get(i);
             
            String nameToUpdate= updatename.getText();
            String User_Name=Name_U.getText();
            String User_Cnic=Cnic_U.getText();
            String User_Email=Email_U.getText();
            String User_Phone=Phone_U.getText();
           
            
            if(updatename.getText().equalsIgnoreCase(array_U_class[i].getName())){
               
             array_U_class[i].setName(User_Name);
             array_U_class[i].setCnic(User_Cnic);
             array_U_class[i].setEmail(User_Email);
             array_U_class[i].setPhone(User_Phone);
           U_classobj=new User_Class(User_Name,User_Cnic,User_Email,User_Phone);
           
            
           arrayList.set(i, U_classobj);
           User_FileObj.againWriteToFile();
            
            JOptionPane.showMessageDialog(this, "User Data Updated Successfully");
            JOptionPane.showInputDialog("DO YOY WANT TO UPDATE MORE DATA?");
            }else
            {
            JOptionPane.showMessageDialog(this, "The data of the user '"+updatename.getText()+"' is not found ");
            break;
            }
       
         }
    }//GEN-LAST:event_UpActionPerformed

    private void ExittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExittActionPerformed
        // TODO update your handling code here:
         Exit ex=new Exit();
       ex.setVisible(true);
       ex.setDefaultCloseOperation(0);
    }//GEN-LAST:event_ExittActionPerformed

    private void BackkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackkActionPerformed
        // TODO update your handling code here:
        User_Info_AdminPanel u=new User_Info_AdminPanel();
        u.setVisible(true);
        u.setDefaultCloseOperation(0);
    }//GEN-LAST:event_BackkActionPerformed

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
            java.util.logging.Logger.getLogger(UP_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UP_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UP_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UP_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UP_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backk;
    private javax.swing.JButton CNIC_User;
    private javax.swing.JTextField Cnic_U;
    private javax.swing.JButton EMAIL_User;
    private javax.swing.JTextField Email_U;
    private javax.swing.JButton Exitt;
    private javax.swing.JTextField Name_U;
    private javax.swing.JButton Name_User3;
    private javax.swing.JButton PHONE_User;
    private javax.swing.JTextField Phone_U;
    private javax.swing.JButton Up;
    private javax.swing.JButton Update_n;
    private javax.swing.JLabel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField updatename;
    // End of variables declaration//GEN-END:variables
}