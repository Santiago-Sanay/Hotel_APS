/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.controller;

import ec.edu.espe.hotelaps.utils.DBManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SSS SANTIAGO
 */
public class DeleteController {
     DBManager db;

    public DeleteController() {
        db = new DBManager();
    }
    public void DeleteProduct(String nameProduct){
    db.connection("inventoryShop");
    if(nameProduct.equals("")){
        JOptionPane.showMessageDialog(null, "No ingreso ningun producto, vuelva a intentar");
    }
    else{
         boolean verify=db.retrived(nameProduct,"name");
         if (verify==true){
             db.delete(nameProduct,"name");
             JOptionPane.showMessageDialog(null, "Vuelva a ingresar para ver los cambios");
         }
         else {
             JOptionPane.showMessageDialog(null, "No existe el producto a eliminar");
         }
    }
    }
    
}
