/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.apshotel.model;

import java.util.Date;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Invoice {
    
    int numberAcount;
    int iva;
    Date date;
    Customer customer;
    Payment payment;

    public int getNumberAcount() {
        return numberAcount;
    }

    public void setNumberAcount(int numberAcount) {
        this.numberAcount = numberAcount;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
