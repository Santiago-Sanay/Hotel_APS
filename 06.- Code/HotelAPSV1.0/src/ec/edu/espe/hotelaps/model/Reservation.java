/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import ec.edu.espe.filemanager.utils.FileManager;
import java.util.Date;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class Reservation {

    private float costAcommodation;
    private Room room;
    private Customer customer;
    private String reservationType;
    private String status;
    private Date dateEntry;
    private Date dateExit;

    public Reservation() {
        costAcommodation = 0.00F;
        room = null;
        customer = null;
        reservationType = "";
        status = "";
        dateEntry = null;
        dateExit = null;
    }

    @Override
    public String toString() {
        return '{' + "Costo=" + getCostAcommodation() + ", Habitación=" + getRoom() + ", Cliente=" + getCustomer() + ", Tipo de reservación=" + getReservationType() + ", Estado=" + getStatus() + ", Fecha de entradad=" + getDateEntry() + ", Fecha de Salida=" + getDateExit() + '}';
    }

    public Reservation(int idReservation, float costAcommodation, Room room, Customer customer, Worker worker, String reservationType, String status, Date dateEntry, Date dateExit) {

        this.costAcommodation = costAcommodation;
        this.room = room;
        this.customer = customer;
        this.reservationType = reservationType;
        this.status = status;
        this.dateEntry = dateEntry;
        this.dateExit = dateExit;
    }

    public float calculateTotal() {

        float total = 0.0F;
        return total;
    }

    /**
     * @return the costAcommodation
     */
    public float getCostAcommodation() {
        return costAcommodation;
    }

    /**
     * @param costAcommodation the costAcommodation to set
     */
    public void setCostAcommodation(float costAcommodation) {
        this.costAcommodation = costAcommodation;
    }

    /**
     * @return the room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(Room room) {
        this.room = room;
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
     * @return the reservationType
     */
    public String getReservationType() {
        return reservationType;
    }

    /**
     * @param reservationType the reservationType to set
     */
    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the dateEntry
     */
    public Date getDateEntry() {
        return dateEntry;
    }

    /**
     * @param dateEntry the dateEntry to set
     */
    public void setDateEntry(Date dateEntry) {
        this.dateEntry = dateEntry;
    }

    /**
     * @return the dateExit
     */
    public Date getDateExit() {
        return dateExit;
    }

    /**
     * @param dateExit the dateExit to set
     */
    public void setDateExit(Date dateExit) {
        this.dateExit = dateExit;
    }

}
