/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.apshotel.model;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Payment {

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * @return the formPayment
     */
    public String getFormPayment() {
        return formPayment;
    }

    /**
     * @param formPayment the formPayment to set
     */
    public void setFormPayment(String formPayment) {
        this.formPayment = formPayment;
    }

    /**
     * @return the serviceSold
     */
    public Service getServiceSold() {
        return serviceSold;
    }

    /**
     * @param serviceSold the serviceSold to set
     */
    public void setServiceSold(Service serviceSold) {
        this.serviceSold = serviceSold;
    }

    /**
     * @return the productSold
     */
    public Product getProductSold() {
        return productSold;
    }

    /**
     * @param productSold the productSold to set
     */
    public void setProductSold(Product productSold) {
        this.productSold = productSold;
    }
    
    private int total;
    private int balance;
    private String formPayment;
    private Service serviceSold;
    private Product productSold;
    
}
