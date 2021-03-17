/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import ec.edu.espe.hotelaps.utils.Conection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jimmy Simbaña <your.name at your.org>
 */
public class Inventory {
    
    Conection conection;
    BasicDBObject document;
    ArrayList<Product> listProduct;
    

    public Inventory() {
        conection = new Conection("inventoryShop");
        document = new BasicDBObject();
        listProduct = new ArrayList();

    }

    public void createProduct(Product product) {

         document.append("idProduct", product.getIdProduct())
                .append("stock", product.getStock())
                .append("salePrice", product.getSalePrice())
                .append("nameProduct", product.getNameProduct())
                .append("isAvailable", product.getIsAvailable());
        conection.getCollection().insert(document);
    }

    public List<Product> readProduct() {
        DBCursor cursor = (DBCursor) conection.getCollection().find();
        while (cursor.hasNext()) {
            Product product = new Product((BasicDBObject) cursor.next());
            listProduct.add(product);
        }
        return listProduct;

    }

    public void updateProduct(Product product, String atribute) {
        document.put("nameProduct", atribute);
        DBCursor cursor =  (DBCursor) conection.getCollection().find(document);
        while (cursor.hasNext()) {
            DBObject object = cursor.next();
            object.put("idProduct", product.getIdProduct());
            object.put("stock", product.getStock());
            object.put("salePrice", product.getSalePrice());
            object.put("nameProduct", product.getNameProduct());
            object.put("isAvailable", product.getIsAvailable());
            conection.getCollection().save(object);
        }
    }

    public void deleteProduct(String atribute) {
        document.put("idProduct", atribute);
        DBCursor cursor = (DBCursor) conection.getCollection().find(document);
        if (cursor.hasNext()) {
            DBObject object = cursor.next();
            conection.getCollection().remove(object);
        }

    }
}
