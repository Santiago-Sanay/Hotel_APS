/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model;

import java.sql.Date;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Customer {

    /**
     * @return the bedNumber
     */
    public int getBedNumber() {
        return bedNumber;
    }

    /**
     * @param bedNumber the bedNumber to set
     */
    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    /**
     * @return the timeStay
     */
    public Date getTimeStay() {
        return timeStay;
    }

    /**
     * @param timeStay the timeStay to set
     */
    public void setTimeStay(Date timeStay) {
        this.timeStay = timeStay;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    private int bedNumber;
    private Date timeStay;
    private String id;
    private String name;
    private String phoneNumber;
    
    private void buy(Product product, Service service){
        
    }
    private void pay(Service service, Payment payment, Product product){
        
    }
    public void cancelReservation(Room room){
        
    }
    public void editReservation(Room room){
        
    }
}
