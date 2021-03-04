/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.



 */
package ec.edu.espe.hotelaps.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 * @author Jimmy Simbaña
 */
public class Product {
    
    /*
    private String idProduct;
    private String stock;
    private String salePrice;
    private String nameProduct;
    private boolean isAvailable;
    */
    
    String idProduct;
    String stock;
    String salePrice;
    String nameProduct;
    Boolean isAvailable;
    
    public Product(String idProduct, String stock, String salePrice, String nameProduct, boolean isAvailable) {
        this.idProduct = idProduct;
        this.stock = stock;
        this.salePrice = salePrice;
        this.nameProduct = nameProduct;
        this.isAvailable = isAvailable;
    }
        public Product(BasicDBObject object) {
        idProduct = object.getString("idProduct");
        stock = object.getString("stock");
        salePrice = object.getString("salePrice");
        nameProduct = object.getString("nameProduct");
        isAvailable = object.getBoolean("isAvailable");
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    
    
    

    
   
}
