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

    private int idProduct;
    private int stock;
    private float salePrice;
    private String nameProduct;
    private boolean isAvailable;

    public Product(int idProduct, int stock, float salePrice, String nameProduct, boolean isAvailable) {
        this.idProduct = idProduct;
        this.stock = stock;
        this.salePrice = salePrice;
        this.nameProduct = nameProduct;
        this.isAvailable = isAvailable;
    }
        public Product(BasicDBObject object) {
        idProduct = object.getInt("idProduct");
        stock = object.getInt("stock");
        salePrice = object.getInt("salePrice");
        nameProduct = object.getString("nameProduct");
        isAvailable = object.getBoolean("isAvailable");
    }

    @Override
    public String toString() {
        return "   " + stock + "\t   " + salePrice + "\t" + nameProduct;
    }

    /**
     * @return the idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the salePrice
     */
    public float getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return the nameProduct
     */
    public String getNameProduct() {
        return nameProduct;
    }

    /**
     * @param nameProduct the nameProduct to set
     */
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    /**
     * @return the isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * @param isAvailable the isAvailable to set
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
