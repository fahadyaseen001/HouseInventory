/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.House_Class;
import Controller.House_File;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wajeeha Usman
 */
public class Houses_View_Admin extends javax.swing.JFrame {

    /**
     * Creates new form House_Info_AdminPanel
     */
    public Houses_View_Admin() {
        initComponents();
               model = (DefaultTableModel)TABLE.getModel();
        
        ViewDataInTable();
    }
  
  
 
House_File F=new  House_File();
  
    private DefaultTableModel model;
    
    private void ViewDataInTable(){
        
        ArrayList <House_Class> a =new ArrayList<>() ;
        a=F.readfromFile();
        
        for(House_Class u : a){
            Object[] o=new Object[4];
            
            o[0] = u.getHouse_Owner();
            o[1] = u.getHouse_Adress();
            o[2] = u.getHouse_Storeys();
            o[3] = u.getHouse_rooms();
             
            model.addRow(o);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Backk = new javax.swing.JButton();
        Exitt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();
        headshow = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(null);

        Backk.setText("Back");
        Backk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackkActionPerformed(evt);
            }
        });
        jPanel1.add(Backk);
        Backk.setBounds(10, 320, 80, 50);

        Exitt.setText("Exit");
        Exitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExittActionPerformed(evt);
            }
        });
        jPanel1.add(Exitt);
        Exitt.setBounds(350, 330, 90, 40);

        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Owner", "Address", "Storeys", "Rooms"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TABLE);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 90, 430, 180);

        headshow.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        headshow.setForeground(new java.awt.Color(255, 255, 255));
        headshow.setText("HOUSES");
        jPanel1.add(headshow);
        headshow.setBounds(150, 20, 140, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExittActionPerformed
        // TODO add your handling code here:
         Exit ex=new Exit();
       ex.setVisible(true);
       ex.setDefaultCloseOperation(0);
    }//GEN-LAST:event_ExittActionPerformed

    private void BackkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackkActionPerformed
        // TODO add your handling code here:
        HOUSECRUD_ADMIN c=new HOUSECRUD_ADMIN();
        c.setVisible(true);
        c.setDefaultCloseOperation(0);
    }//GEN-LAST:event_BackkActionPerformed

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
            java.util.logging.Logger.getLogger(Houses_View_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Houses_View_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Houses_View_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Houses_View_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Houses_View_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backk;
    private javax.swing.JButton Exitt;
    private javax.swing.JTable TABLE;
    private javax.swing.JLabel headshow;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}