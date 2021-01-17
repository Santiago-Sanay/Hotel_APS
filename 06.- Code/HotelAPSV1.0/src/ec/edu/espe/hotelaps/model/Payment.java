/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import java.util.Date;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Payment {
    
    private int idPay;
    private float totalPay;
    private Reservation idReservation;
    private String typePayment;
    private String invoiceNumber;
    private Date dateIssue;

    @Override
    public String toString() {
        return "Payment{" + "idPay=" + idPay + ", totalPay=" + totalPay + ", idReservation=" + idReservation + ", typePayment=" + typePayment + ", invoiceNumber=" + invoiceNumber + ", dateIssue=" + dateIssue + '}';
    }

    public Payment(int idPay, float totalPay, Reservation idReservation, String typePayment, String invoiceNumber, Date dateIssue) {
        this.idPay = idPay;
        this.totalPay = totalPay;
        this.idReservation = idReservation;
        this.typePayment = typePayment;
        this.invoiceNumber = invoiceNumber;
        this.dateIssue = dateIssue;
    }

    /**
     * @return the idPay
     */
    public int getIdPay() {
        return idPay;
    }

    /**
     * @param idPay the idPay to set
     */
    public void setIdPay(int idPay) {
        this.idPay = idPay;
    }

    /**
     * @return the totalPay
     */
    public float getTotalPay() {
        return totalPay;
    }

    /**
     * @param totalPay the totalPay to set
     */
    public void setTotalPay(float totalPay) {
        this.totalPay = totalPay;
    }

    /**
     * @return the idReservation
     */
    public Reservation getIdReservation() {
        return idReservation;
    }

    /**
     * @param idReservation the idReservation to set
     */
    public void setIdReservation(Reservation idReservation) {
        this.idReservation = idReservation;
    }

    /**
     * @return the typePayment
     */
    public String getTypePayment() {
        return typePayment;
    }

    /**
     * @param typePayment the typePayment to set
     */
    public void setTypePayment(String typePayment) {
        this.typePayment = typePayment;
    }

    /**
     * @return the invoiceNumber
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * @param invoiceNumber the invoiceNumber to set
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * @return the dateIssue
     */
    public Date getDateIssue() {
        return dateIssue;
    }

    /**
     * @param dateIssue the dateIssue to set
     */
    public void setDateIssue(Date dateIssue) {
        this.dateIssue = dateIssue;
    }
    
    public void show(){
        
    }
}
