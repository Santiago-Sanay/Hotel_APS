/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import java.util.Date;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class Reservation {

    private int idReservation;
    private float costAcommodation;
    private Room room;
    private Customer customer;
    private Worker worker;
    private String reservationType;
    private String status;
    private Date dateReserved;
    private Date dateEntry;
    private Date dateExit;

    Reservation() {
        idReservation=0;
        costAcommodation=0.00F;
        room = null;
        customer = null;
        worker = null;
        reservationType="";
        status="";
        dateReserved=null;       
        dateEntry=null;
        dateExit=null;
    }

    @Override
    public String toString() {
        return "Reservation{" + "idReservation=" + getIdReservation() + ", costAcommodation=" + getCostAcommodation() + ", idRoom=" + getRoom() + ", idCustomer=" + getCustomer() + ", worker=" + getWorker() + ", reservationType=" + getReservationType() + ", status=" + getStatus() + ", dateReserved=" + getDateReserved() + ", dateEntry=" + getDateEntry() + ", dateExit=" + getDateExit() + '}';
    }

    public Reservation(int idReservation, float costAcommodation, Room room, Customer customer, Worker worker, String reservationType, String status, Date dateReserved, Date dateEntry, Date dateExit) {
        this.idReservation = idReservation;
        this.costAcommodation = costAcommodation;
        this.room = room;
        this.customer = customer;
        this.worker = worker;
        this.reservationType = reservationType;
        this.status = status;
        this.dateReserved = dateReserved;
        this.dateEntry = dateEntry;
        this.dateExit = dateExit;
    }

    public float calculateTotal() {

        float total = 0.0F;
        return total;
    }

    /**
     * @return the idReservation
     */
    public int getIdReservation() {
        return idReservation;
    }

    /**
     * @param idReservation the idReservation to set
     */
    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
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
     * @return the worker
     */
    public Worker getWorker() {
        return worker;
    }

    /**
     * @param worker the worker to set
     */
    public void setWorker(Worker worker) {
        this.worker = worker;
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
     * @return the dateReserved
     */
    public Date getDateReserved() {
        return dateReserved;
    }

    /**
     * @param dateReserved the dateReserved to set
     */
    public void setDateReserved(Date dateReserved) {
        this.dateReserved = dateReserved;
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
