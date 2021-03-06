/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.view;

import ec.edu.espe.hotelaps.controller.MenuController;
import ec.edu.espe.hotelaps.controller.RegisterController;
import ec.edu.espe.hotelaps.model.Conection;
import ec.edu.espe.hotelaps.model.Customer;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Sanay ESPE-DCCO
 */
public class FrmReserveRoom extends javax.swing.JFrame {

    /**
     * Creates new form frmReserveRoom
     */
    public FrmReserveRoom() {
        initComponents();
        Conection conection = new Conection("Room");
        String[][] rooms;
        rooms = MenuController.showRoms();
        listRooms.setModel(new javax.swing.table.DefaultTableModel(rooms,
                new String[]{
                    "Numero de Habitacion", "Precio", "Capacidad", "Descripcion"
                }
        ));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listRooms = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSelectRoom = new javax.swing.JTextField();
        btnReserv = new javax.swing.JButton();
        btnExit5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        room.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        room.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        room.setText("Estos son los cuartos disponibles");

        listRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Habitacion", "Precio", "Capacidad", "Descripcion"
            }
        ));
        jScrollPane1.setViewportView(listRooms);

        jLabel1.setText("Ingrese el numero de habitacion que desea reservar:");

        txtSelectRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectRoomActionPerformed(evt);
            }
        });

        btnReserv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/hotelaps/files/pencil-write-1-alternate.png"))); // NOI18N
        btnReserv.setText("Reservar");
        btnReserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservActionPerformed(evt);
            }
        });

        btnExit5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/hotelaps/files/house-chimney.png"))); // NOI18N
        btnExit5.setText("Regresar");
        btnExit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(room, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(txtSelectRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 297, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(btnReserv)
                .addGap(35, 35, 35)
                .addComponent(btnExit5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSelectRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReserv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSelectRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectRoomActionPerformed

    private void btnExit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit5ActionPerformed
        FrmCustomerService customerService = new FrmCustomerService();
        this.setVisible(false);
        customerService.setVisible(true);
    }//GEN-LAST:event_btnExit5ActionPerformed

    private void btnReservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservActionPerformed
        String dataReserve;
        dataReserve=txtSelectRoom.getText();
        RegisterController controller = new RegisterController();
        controller.registerRoomCustumer(dataReserve);
        String[] options = {"Reservar", "Salir"};

        int x = JOptionPane.showOptionDialog(null, "Ustd va a reservar la habitacion" + txtSelectRoom.getText(),
                "!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (x == 0) {

            txtSelectRoom.setText("");

        } else {
            txtSelectRoom.setText("");
        }
        // TODO add your handling code here:

    }//GEN-LAST:event_btnReservActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReserveRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReserveRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReserveRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReserveRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReserveRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit5;
    private javax.swing.JButton btnReserv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listRooms;
    private javax.swing.JLabel room;
    private javax.swing.JTextField txtSelectRoom;
    // End of variables declaration//GEN-END:variables
}
