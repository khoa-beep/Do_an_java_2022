/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLHD;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Managerfrom extends javax.swing.JFrame {
    private List<Benhnhanbhyt> list = new ArrayList<>();
    //private List<Benhnhanxh> list2 = new ArrayList<>();
    private String[] colume = new String[]{"ID","Name","Date","Request room","Code"};
    DefaultTableModel tbmode1 = new DefaultTableModel();
    /**
     * Creates new form Managerfrom
     */
    public Managerfrom() {
        initComponents();
        setLocationRelativeTo(null);
        indata();
        FillTable();
        
    }

    // gia lap du lieu 
    private void indata()
    {
        list.add(new Benhnhanbhyt("001","Anh khoa",2,true,11111));
        list.add(new Benhnhanbhyt("002","Cuong",1,true,12345));
        list.add(new Benhnhanbhyt("003","Ha Van",20,true,20000));
        list.add(new Benhnhanbhyt("004","Le Lan",2,false,12455));
        list.add(new Benhnhanbhyt("005","Van Tan",1,true,89999));
        list.add(new Benhnhanbhyt("006","Doc Co",20,true,30000));
    }
    
    // them du lieu
    private void FillTable(){
        tbmode1 = new DefaultTableModel();
        tbmode1.setColumnIdentifiers(colume);
        
        list.forEach(
                item-> tbmode1.addRow(new Object[]{item.getID(),item.getName(),item.getDate(),item.isRequest_Room(),item.getMabaohiemyt()})
        );
        tbHoadon.setModel(tbmode1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        Hear_HoaDonvienphi = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ID_variable = new javax.swing.JLabel();
        Name_variable = new javax.swing.JLabel();
        Date_variable = new javax.swing.JLabel();
        Mayte = new javax.swing.JLabel();
        Phongyeucau = new javax.swing.JLabel();
        txt_iid = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();
        txt_yt = new javax.swing.JTextField();
        Co = new javax.swing.JRadioButton();
        Khong = new javax.swing.JRadioButton();
        Mabaohiemxh = new javax.swing.JLabel();
        txt_bhxh = new javax.swing.JTextField();
        node_delete = new javax.swing.JButton();
        Node_add = new javax.swing.JButton();
        node_update = new javax.swing.JButton();
        node_writetofile = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHoadon = new javax.swing.JTable();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Hear_HoaDonvienphi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Hear_HoaDonvienphi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLHD/Icon/index.png"))); // NOI18N
        Hear_HoaDonvienphi.setText("             Quan ly hoa don vien phi");

        ID_variable.setText("ID");

        Name_variable.setText("Name");

        Date_variable.setText("Date");

        Mayte.setText("Medical insurance code");

        Phongyeucau.setText("Request Roome");

        txt_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dateActionPerformed(evt);
            }
        });

        Co.setText("Yes");

        Khong.setText("No");

        Mabaohiemxh.setText("Insurance code ");

        node_delete.setText("DELETE");
        node_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                node_deleteActionPerformed(evt);
            }
        });

        Node_add.setText("ADD");
        Node_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node_addActionPerformed(evt);
            }
        });

        node_update.setText("UPDATE");
        node_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                node_updateActionPerformed(evt);
            }
        });

        node_writetofile.setText("Write");
        node_writetofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                node_writetofileActionPerformed(evt);
            }
        });

        tbHoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Date", "Request room", "Code "
            }
        ));
        jScrollPane1.setViewportView(tbHoadon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hear_HoaDonvienphi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Name_variable)
                                            .addComponent(ID_variable)
                                            .addComponent(Date_variable))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                                                .addComponent(txt_iid))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Mayte)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_yt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Phongyeucau)
                                            .addComponent(Mabaohiemxh))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_bhxh, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Co, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Khong, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Node_add, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(node_delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(node_update, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(node_writetofile, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Hear_HoaDonvienphi, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_variable)
                    .addComponent(txt_iid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Node_add))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name_variable)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(node_delete)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_yt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Date_variable)
                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Mayte)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(node_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phongyeucau)
                    .addComponent(Co)
                    .addComponent(Khong))
                .addGap(5, 5, 5)
                .addComponent(node_writetofile)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mabaohiemxh)
                    .addComponent(txt_bhxh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txt_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dateActionPerformed
   
    }//GEN-LAST:event_txt_dateActionPerformed

    private void node_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_node_updateActionPerformed
        if(txt_name.getText().equals("") || txt_iid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Pleas Enter ID and Name your");
        }
        Object data[] = {txt_iid.getText(),txt_name.getText(),txt_date.getText(),Co.isSelected(),txt_bhxh.getText(),txt_yt.getText()};
        
        tbmode1.addRow(data);
        
    }//GEN-LAST:event_node_updateActionPerformed

    // nhap them moi 1 benh nhan tai day
    private void Node_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node_addActionPerformed
         if(txt_name.getText().equals("") || txt_iid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Pleas Enter ID and Name your");
        }
        Object data[] = {txt_iid.getText(),txt_name.getText(),txt_date.getText(),Co.isSelected(),txt_bhxh.getText(),txt_yt.getText()};
        
        tbmode1.addRow(data);
    }//GEN-LAST:event_Node_addActionPerformed

    private void node_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_node_deleteActionPerformed
        
          int i = tbHoadon.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    tbmode1.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
    }//GEN-LAST:event_node_deleteActionPerformed

    private void node_writetofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_node_writetofileActionPerformed
        try (PrintWriter pw = new PrintWriter(new File("bn.txt"))){
            for (Benhnhanbhyt benhnhanbhyt : list) {
                pw.println(benhnhanbhyt.getID());
                pw.println(benhnhanbhyt.getName());
                pw.println(benhnhanbhyt.getMabaohiemyt());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_node_writetofileActionPerformed

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
            java.util.logging.Logger.getLogger(Managerfrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Managerfrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Managerfrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Managerfrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Managerfrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Co;
    private javax.swing.JLabel Date_variable;
    private javax.swing.JLabel Hear_HoaDonvienphi;
    private javax.swing.JLabel ID_variable;
    private javax.swing.JRadioButton Khong;
    private javax.swing.JLabel Mabaohiemxh;
    private javax.swing.JLabel Mayte;
    private javax.swing.JLabel Name_variable;
    private javax.swing.JButton Node_add;
    private javax.swing.JLabel Phongyeucau;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton node_delete;
    private javax.swing.JButton node_update;
    private javax.swing.JButton node_writetofile;
    private javax.swing.JTable tbHoadon;
    private javax.swing.JTextField txt_bhxh;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_iid;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_yt;
    // End of variables declaration//GEN-END:variables

   
}
