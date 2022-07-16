/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.House_Class;
import Controller.House_File;
import Controller.User_File;
import Controller.User_Class;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Wajeeha Usman
 */
public class Add_House extends javax.swing.JFrame {

    /**
     * Creates new form Add_House
     */
    public Add_House() {
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
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        house_Owner_button = new javax.swing.JButton();
        House_Owner_text = new javax.swing.JTextField();
        house_Adress_button = new javax.swing.JButton();
        House_Adress_text = new javax.swing.JTextField();
        house_Storey_button = new javax.swing.JButton();
        House_Storey_text = new javax.swing.JTextField();
        house_Room_button = new javax.swing.JButton();
        House_Room_text = new javax.swing.JTextField();
        ADD_HOUSE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(null);

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(360, 360, 90, 50);

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(30, 360, 90, 50);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("CLICK TO ADD HOUSES");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 10, 340, 70);

        house_Owner_button.setText("House Owner");
        house_Owner_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                house_Owner_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(house_Owner_button);
        house_Owner_button.setBounds(30, 100, 120, 40);
        jPanel1.add(House_Owner_text);
        House_Owner_text.setBounds(190, 100, 210, 40);

        house_Adress_button.setText("House Adress");
        jPanel1.add(house_Adress_button);
        house_Adress_button.setBounds(30, 150, 120, 40);
        jPanel1.add(House_Adress_text);
        House_Adress_text.setBounds(190, 150, 210, 40);

        house_Storey_button.setText("House Storey");
        jPanel1.add(house_Storey_button);
        house_Storey_button.setBounds(30, 200, 120, 40);
        jPanel1.add(House_Storey_text);
        House_Storey_text.setBounds(190, 200, 210, 40);

        house_Room_button.setText("House Room");
        jPanel1.add(house_Room_button);
        house_Room_button.setBounds(30, 250, 120, 40);
        jPanel1.add(House_Room_text);
        House_Room_text.setBounds(190, 250, 210, 40);

        ADD_HOUSE.setText("ADD");
        ADD_HOUSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_HOUSEActionPerformed(evt);
            }
        });
        jPanel1.add(ADD_HOUSE);
        ADD_HOUSE.setBounds(200, 360, 90, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/housesssssss.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 470, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 470, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        HOUSECRUD_ADMIN add=new HOUSECRUD_ADMIN();
        add.setVisible(true);
        add.setDefaultCloseOperation(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         Exit ex=new Exit();
       ex.setVisible(true);
       ex.setDefaultCloseOperation(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void house_Owner_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_house_Owner_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_house_Owner_buttonActionPerformed

    private void ADD_HOUSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_HOUSEActionPerformed
        // TODO add your handling code here:
            Boolean b=false;
        String Option;
      
        ArrayList <House_Class> mylist=new ArrayList<>();
        House_File FH=new House_File();
        String Owner=House_Owner_text.getText();
        String Address=House_Adress_text.getText();
        String Storeys=House_Storey_text.getText();
        String Rooms=House_Room_text.getText();
         
        
        //String Name, String Company,String category, double price, double Quantity, String expireDate
        
        FH.addHouse(Owner, Address,Storeys, Rooms);
        JOptionPane.showMessageDialog(this,"Records added successfully");
        Option=JOptionPane.showInputDialog(this,"Do u want to add another House");
        if(Option.equals("Yes"))
        {
           House_Owner_text.setText(" ");
            House_Adress_text.setText(" ");
            House_Storey_text.setText(" ");
            House_Room_text.setText(" ");
            
            
             b=true;
        }
        else{
            b=false;
        }

    }//GEN-LAST:event_ADD_HOUSEActionPerformed

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
            java.util.logging.Logger.getLogger(Add_House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_House().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_HOUSE;
    private javax.swing.JTextField House_Adress_text;
    private javax.swing.JTextField House_Owner_text;
    private javax.swing.JTextField House_Room_text;
    private javax.swing.JTextField House_Storey_text;
    private javax.swing.JButton house_Adress_button;
    private javax.swing.JButton house_Owner_button;
    private javax.swing.JButton house_Room_button;
    private javax.swing.JButton house_Storey_button;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
