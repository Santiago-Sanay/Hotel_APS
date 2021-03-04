/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.view;

import ec.edu.espe.hotelaps.model.Conection;
import ec.edu.espe.hotelaps.model.Product;
import ec.edu.espe.hotelaps.model.Room;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class FrmRegisterRoom extends javax.swing.JFrame {

    /**
     * Creates new form frmroom
     */
    public FrmRegisterRoom() {
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

        room = new javax.swing.JLabel();
        txtNumberRoom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPriceRoom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSaveRegister = new javax.swing.JButton();
        btnCancelRegister = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtFeatures = new javax.swing.JTextField();
        cboStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        room.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        room.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        room.setText("Creacion de habitaciones");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero de la habitación:");

        txtPriceRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceRoomActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio diario de la habitación:");

        jLabel3.setText("Estatus de la habitación:");

        cboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matrimonial", "Individual", "Familiar" }));

        jLabel4.setText("Tipo de la habitación:");

        jLabel6.setText("Caracteristicas:");

        btnSaveRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/hotelaps/files/task-checklist-check.png"))); // NOI18N
        btnSaveRegister.setText("Guardar");
        btnSaveRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveRegisterActionPerformed(evt);
            }
        });

        btnCancelRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/hotelaps/files/delete.png"))); // NOI18N
        btnCancelRegister.setText("Cancelar");
        btnCancelRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRegisterActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/hotelaps/files/house-chimney.png"))); // NOI18N
        btnExit.setText("Regresar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        cboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Deshabilitado" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSaveRegister)
                                .addComponent(jLabel3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumberRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(cboType, 0, 181, Short.MAX_VALUE)
                                    .addComponent(txtPriceRoom)
                                    .addComponent(txtFeatures)
                                    .addComponent(cboStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnCancelRegister)
                                .addGap(34, 34, 34)
                                .addComponent(btnExit))))
                    .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumberRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPriceRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFeatures, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelRegister)
                    .addComponent(btnSaveRegister)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveRegisterActionPerformed
        // TODO add your handling code here:
        
        Conection conection = new Conection("Room");
        String a = (String) cboStatus.getSelectedItem();
        String b = (String) cboType.getSelectedItem();
        Room room = new Room(txtNumberRoom.getText(),txtPriceRoom.getText(),a,b,txtFeatures.getText());
        conection.saveRoom(room);
        
        //String[] options = {"Guardar", "Salir"};
        
        /*
        int x = JOptionPane.showOptionDialog(null, "Seleccione su opcion",
                "!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if(x==0){
            
            
            txtIdProduct.setText("");
            txtCuantity.setText("");
            txtPrice.setText("");
            txtNameProduct.setText("");
      
        }
        else{
            txtIdProduct.setText("");
            txtCuantity.setText("");
            txtPrice.setText("");
            txtNameProduct.setText("");
        }*/
    }//GEN-LAST:event_btnSaveRegisterActionPerformed

    private void txtPriceRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceRoomActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        FrmPrincipalMenu principalMenu = new FrmPrincipalMenu();
        this.setVisible(false);
        principalMenu.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCancelRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRegisterActionPerformed
        txtNumberRoom.setText("");
        txtPriceRoom.setText("");
        txtFeatures.setText("");
    }//GEN-LAST:event_btnCancelRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegisterRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegisterRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegisterRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegisterRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegisterRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelRegister;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSaveRegister;
    private javax.swing.JComboBox<String> cboStatus;
    private javax.swing.JComboBox<String> cboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel room;
    private javax.swing.JTextField txtFeatures;
    private javax.swing.JTextField txtNumberRoom;
    private javax.swing.JTextField txtPriceRoom;
    // End of variables declaration//GEN-END:variables
}
