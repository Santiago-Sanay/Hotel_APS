/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.Date;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Reservation {
    
    private int idReservation;
    private float costAcommodation;
    private Room idRoom;
    private Customer idCustomer;
    private Worker idWorker;
    private String reservationType;
    private String status;
    private Date dateReserved;
    private Date dateEntry;
    private Date dateExit;

    @Override
    public String toString() {
        return "Reservation{" + "idReservation=" + idReservation + ", costAcommodation=" + costAcommodation + ", idRoom=" + idRoom + ", idCustomer=" + idCustomer + ", idWorker=" + idWorker + ", reservationType=" + reservationType + ", status=" + status + ", dateReserved=" + dateReserved + ", dateEntry=" + dateEntry + ", dateExit=" + dateExit + '}';
    }

    public Reservation(int idReservation, float costAcommodation, Room idRoom, Customer idCustomer, Worker idWorker, String reservationType, String status, Date dateReserved, Date dateEntry, Date dateExit) {
        this.idReservation = idReservation;
        this.costAcommodation = costAcommodation;
        this.idRoom = idRoom;
        this.idCustomer = idCustomer;
        this.idWorker = idWorker;
        this.reservationType = reservationType;
        this.status = status;
        this.dateReserved = dateReserved;
        this.dateEntry = dateEntry;
        this.dateExit = dateExit;
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
     * @return the idRoom
     */
    public Room getIdRoom() {
        return idRoom;
    }

    /**
     * @param idRoom the idRoom to set
     */
    public void setIdRoom(Room idRoom) {
        this.idRoom = idRoom;
    }

    /**
     * @return the idCustomer
     */
    public Customer getIdCustomer() {
        return idCustomer;
    }

    /**
     * @param idCustomer the idCustomer to set
     */
    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    /**
     * @return the idWorker
     */
    public Worker getIdWorker() {
        return idWorker;
    }

    /**
     * @param idWorker the idWorker to set
     */
    public void setIdWorker(Worker idWorker) {
        this.idWorker = idWorker;
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
