/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import java.util.ArrayList;

/**
 *
 * @author SSS SANTIAGO
 */
public class Bill {
    private Customer customer;
    private ArrayList<ItemBill> products;

    public Bill(Customer customer, ArrayList<ItemBill> products) {
        this.customer = customer;
        this.products = products;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the products
     */
    public ArrayList<ItemBill> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(ArrayList<ItemBill> products) {
        this.products = products;
    }

    
    
}
