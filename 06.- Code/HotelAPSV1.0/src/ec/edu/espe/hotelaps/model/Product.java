/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class Product {
    
    private int idProduct;
    private int stock;
    private float salePrice;
    private String name;
    private String description;

    @Override
    public String toString() {
        return "Product{" + "idProduct=" + idProduct + ", stock=" + stock + ", salePrice=" + salePrice + ", name=" + name + ", description=" + description + '}';
    }

    public Product(int idProduct, int stock, float salePrice, String name, String description) {
        this.idProduct = idProduct;
        this.stock = stock;
        this.salePrice = salePrice;
        this.name = name;
        this.description = description;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void addProduct(){
        
    }
}
