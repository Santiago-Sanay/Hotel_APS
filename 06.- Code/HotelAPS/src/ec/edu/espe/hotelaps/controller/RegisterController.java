/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.controller;

import ec.edu.espe.hotelaps.model.Conection;
import ec.edu.espe.hotelaps.model.Customer;
import ec.edu.espe.hotelaps.model.Product;
import ec.edu.espe.hotelaps.model.Room;
import ec.edu.espe.hotelaps.utils.DBManager;
import ec.edu.espe.hotelaps.view.FrmRegisterCustomer;
import ec.edu.espe.hotelaps.view.FrmRegisterProduct;
import ec.edu.espe.hotelaps.view.FrmRegisterRoom;
import javax.swing.JOptionPane;
import org.bson.BSONObject;
import org.bson.Document;

/**
 *
 * @author SSS SANTIAGO
 */
public class RegisterController {
    
    DBManager db;
    FrmRegisterCustomer frmCustomer;
    public void registerCustomer (Customer customer){    
        db.connection("Customer");
        BSONObject bson;
        Document admin;
        admin = new Document("name", customer.getName());
        admin.append("id", customer.getId());
        admin.append("documentNumber", customer.getDocumentNumber());
        admin.append("Telephone", customer.getTelephone());
        admin.append("Email", customer.getEmail());
        db.save(admin);
    }

    public RegisterController( FrmRegisterCustomer frmCustomer) {
        this.frmCustomer= frmCustomer;
        db = new DBManager();
       
    }
    FrmRegisterProduct frmproduct;
    public void registerProduct (Product product){    
        db.connection("inventoryShop");
        BSONObject bson;
        Document products;
        products = new Document("name", product.getNameProduct());
        products.append("id", product.getIdProduct());
        products.append("price", product.getSalePrice());
        products.append("stock", product.getStock());
        products.append("availability", product.getIsAvailable());
        db.save(products);

    }

    public RegisterController(FrmRegisterProduct frmproduct) {
        this.frmproduct= frmproduct;
        db = new DBManager();
       }
    
    FrmRegisterRoom frmRoom;
    public void registerRoom (Room room){    
        db.connection("Room");
        BSONObject bson;
        Document rooms;
        rooms = new Document("number", room.getNumberRoom());
        rooms.append("price", room.getPrice());
        rooms.append("status", room.getStatus());
        rooms.append("type", room.getCapacityPerson());
        rooms.append("description", room.getDescription());
        db.save(rooms);
      
    }

    public RegisterController(FrmRegisterRoom frmRoom) {
        this.frmRoom= frmRoom;
        db = new DBManager();
       
    }
    
    public void registerRoomCustumer (String numberRoom){
        db.connection("Room");
        if(numberRoom.equals("")){
        JOptionPane.showMessageDialog(null, "No ingreso ningun producto, vuelva a intentar");
    }
    else{
         boolean verify=db.retrived(numberRoom,"number");
         if (verify==true){
//             Document findDocument = new Document("number",numberRoom);
//             Document updateDocument = new Document("$set", new Document("status", "Deshabilitado"));
//             collection.findOneAndUpdate(findDocument, updateDocument);
//             db.delete(nameProduct,"name");
              db.update(numberRoom);
             JOptionPane.showMessageDialog(null, "Acaba de reservar la habitacion"+numberRoom);
         }
         else {
             JOptionPane.showMessageDialog(null, "No existe el producto a eliminar");
         }
    }
        
    }

    public RegisterController() {
        db = new DBManager();
    }
    
    
}
