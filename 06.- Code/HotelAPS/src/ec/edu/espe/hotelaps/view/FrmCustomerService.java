/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.view;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class FrmCustomerService extends javax.swing.JFrame {

    /**
     * Creates new form frmCustomerService
     */
    public FrmCustomerService() {
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
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbrReservs = new javax.swing.JMenu();
        mimReservRoom = new javax.swing.JMenuItem();
        mbrBuy = new javax.swing.JMenu();
        mimBuyProduct = new javax.swing.JMenuItem();
        mbrConsumption = new javax.swing.JMenu();
        mimConsumption = new javax.swing.JMenuItem();
        mbrReturn = new javax.swing.JMenu();
        mimPrincipalMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        room.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        room.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        room.setText("Bienvenido a servicio al cliente");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/hotelaps/files/cliente.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mbrReservs.setText("Reservas");

        mimReservRoom.setText("Habitacion");
        mimReservRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimReservRoomActionPerformed(evt);
            }
        });
        mbrReservs.add(mimReservRoom);

        jMenuBar1.add(mbrReservs);

        mbrBuy.setText("Comprar");

        mimBuyProduct.setText("APSShop");
        mimBuyProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimBuyProductActionPerformed(evt);
            }
        });
        mbrBuy.add(mimBuyProduct);

        jMenuBar1.add(mbrBuy);

        mbrConsumption.setText("Consultas");

        mimConsumption.setText("Consumo");
        mimConsumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimConsumptionActionPerformed(evt);
            }
        });
        mbrConsumption.add(mimConsumption);

        jMenuBar1.add(mbrConsumption);

        mbrReturn.setText("Regresar ");

        mimPrincipalMenu.setText("Menu principal");
        mimPrincipalMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimPrincipalMenuActionPerformed(evt);
            }
        });
        mbrReturn.add(mimPrincipalMenu);

        jMenuBar1.add(mbrReturn);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(room, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mimPrincipalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimPrincipalMenuActionPerformed
        FrmPrincipalMenu principalMenu = new FrmPrincipalMenu();
        this.setVisible(false);
        principalMenu.setVisible(true);
    }//GEN-LAST:event_mimPrincipalMenuActionPerformed

    private void mimReservRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimReservRoomActionPerformed
        FrmReserveRoom reservation= new FrmReserveRoom();
        this.setVisible(false);
        reservation.setVisible(true);
    }//GEN-LAST:event_mimReservRoomActionPerformed

    private void mimBuyProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimBuyProductActionPerformed
        FrmBuyProduct product = new FrmBuyProduct();
        this.setVisible(false);
        product.setVisible(true);
    }//GEN-LAST:event_mimBuyProductActionPerformed

    private void mimConsumptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimConsumptionActionPerformed
        FrmConsumptionDetail consumption = new FrmConsumptionDetail();
        this.setVisible(false);
        consumption.setVisible(true);
    }//GEN-LAST:event_mimConsumptionActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCustomerService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCustomerService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCustomerService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCustomerService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCustomerService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mbrBuy;
    private javax.swing.JMenu mbrConsumption;
    private javax.swing.JMenu mbrReservs;
    private javax.swing.JMenu mbrReturn;
    private javax.swing.JMenuItem mimBuyProduct;
    private javax.swing.JMenuItem mimConsumption;
    private javax.swing.JMenuItem mimPrincipalMenu;
    private javax.swing.JMenuItem mimReservRoom;
    private javax.swing.JLabel room;
    // End of variables declaration//GEN-END:variables
}
