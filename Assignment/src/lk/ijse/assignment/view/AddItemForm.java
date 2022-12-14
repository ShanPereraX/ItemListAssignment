/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.assignment.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author shan
 */
public class AddItemForm extends javax.swing.JFrame {

    /**
     * Creates new form AddCustomerForm
     */
    public AddItemForm() {
        initComponents();
        setTitle("Add Item Form");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codeTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        descriptionTxt = new javax.swing.JTextField();
        unitTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        qtyTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add ITEM Form");
        jLabel1.setPreferredSize(new java.awt.Dimension(174, 30));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel2.setText("Code");

        codeTxt.setToolTipText("");
        codeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codeTxtKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel3.setText("Description");

        descriptionTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descriptionTxtKeyReleased(evt);
            }
        });

        unitTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unitTxtKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel4.setText("Unit Price");

        qtyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyTxtActionPerformed(evt);
            }
        });
        qtyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtyTxtKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel5.setText("Qty on Hand");

        addBtn.setText("Add");
        addBtn.setEnabled(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(unitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(descriptionTxt)
                                    .addComponent(codeTxt)
                                    .addComponent(qtyTxt))
                                .addGap(0, 20, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(addBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(codeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(descriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(unitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(qtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        add();
    }//GEN-LAST:event_addBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void qtyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyTxtActionPerformed
        add();
    }//GEN-LAST:event_qtyTxtActionPerformed

    private void qtyTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTxtKeyReleased
        activeAddBtn();
    }//GEN-LAST:event_qtyTxtKeyReleased

    private void codeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeTxtKeyReleased
        activeAddBtn();
    }//GEN-LAST:event_codeTxtKeyReleased

    private void descriptionTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionTxtKeyReleased
        activeAddBtn();
    }//GEN-LAST:event_descriptionTxtKeyReleased

    private void unitTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitTxtKeyReleased
        activeAddBtn();
    }//GEN-LAST:event_unitTxtKeyReleased

    public void clearAll() {
        codeTxt.setText("");
        descriptionTxt.setText(null);
        unitTxt.setText(null);
        qtyTxt.setText(null);
    }

    public void activeAddBtn() {
        addBtn.setEnabled(!qtyTxt.getText().isEmpty() & !unitTxt.getText().isEmpty() & !codeTxt.getText().isEmpty() & !descriptionTxt.getText().isEmpty());
    }

    public void add() {
        String SQL = "Insert into Item Values(?,?,?,?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ThogaKade", "admin", "12345");
            PreparedStatement stm = connection.prepareStatement(SQL);
            stm.setObject(1, codeTxt.getText());
            stm.setObject(2, descriptionTxt.getText());
            stm.setObject(3, Double.valueOf(unitTxt.getText()));
            stm.setObject(4, Double.valueOf(qtyTxt.getText()));
            int res = stm.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(this, "Item Added Succsfully");
            } else {
                JOptionPane.showMessageDialog(this, "Something went wrong!");
            }

        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        clearAll();
        addBtn.setEnabled(false);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField codeTxt;
    private javax.swing.JTextField descriptionTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField qtyTxt;
    private javax.swing.JTextField unitTxt;
    // End of variables declaration//GEN-END:variables
}
