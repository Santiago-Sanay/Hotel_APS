/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.controller;

import ec.edu.espe.hotelaps.utils.DBManager;
import ec.edu.espe.hotelaps.view.FrmClientLoggin;
import ec.edu.espe.hotelaps.view.FrmCustomerService;
import javax.swing.JOptionPane;

/**
 *
 * @author SSS SANTIAGO
 */
public class RetriveDataController {
    DBManager db;
    FrmClientLoggin customerLoggin;
    public RetriveDataController(FrmClientLoggin customerLoggin) {
        db = new DBManager();
        this.customerLoggin = customerLoggin ;
    }
    public void validationCustomer(String id){
        db.connection("Customer");
        boolean verify;
        verify = db.retrived(id,"id");
        System.out.println(verify);
        if (verify == true) {
            JOptionPane.showMessageDialog(null, "Bienvenido");
            FrmCustomerService custumerService = new FrmCustomerService();
            this.customerLoggin.setVisible(false);
            custumerService.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "NO EXITO");
        }
}
    
}
