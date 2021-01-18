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
    private String nameProduct;

    @Override
    public String toString() {
        return '{'+"ID del prodcuto=" + getIdProduct() + ", Stock=" + getStock() + ",Precio=" + getSalePrice() + ", Nombre del producto =" + getNameProduct() + '}';
    }

    public Product(int idProduct, int stock, float salePrice, String nameProduct) {
        this.idProduct = idProduct;
        this.stock = stock;
        this.salePrice = salePrice;
        this.nameProduct = nameProduct;
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

}
