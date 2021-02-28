/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

/**
 *
 * @author User
 */
public class Consumption {

    private String nameCustomer;
    private String nameProduct;
    private Float salePrice;
    private boolean status;

    
    
    @Override
    public String toString() {
        return nameProduct + "\t" + salePrice;
    }

    /**
     * @return the nameCustomer
     */
    public String getNameCustomer() {
        return nameCustomer;
    }

    /**
     * @param nameCustomer the nameCustomer to set
     */
    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
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
     * @return the salePrice
     */
    public Float getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

}
