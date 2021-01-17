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
public class Consumtion {

    private int idConsumption;
    private int quantity;
    private float safePrice;
    private Reservation idReservation;
    private Product idProduct;
    private boolean status;

    @Override
    public String toString() {
        return "Consumtion{" + "idConsumption=" + idConsumption + ", quantity=" + quantity + ", safePrice=" + safePrice + ", idReservation=" + idReservation + ", idProduct=" + idProduct + ", status=" + status + '}';
    }

    public Consumtion(int idConsumption, int quantity, float safePrice, Reservation idReservation, Product idProduct, boolean status) {
        this.idConsumption = idConsumption;
        this.quantity = quantity;
        this.safePrice = safePrice;
        this.idReservation = idReservation;
        this.idProduct = idProduct;
        this.status = status;
    }

    /**
     * @return the idConsumption
     */
    public int getIdConsumption() {
        return idConsumption;
    }

    /**
     * @param idConsumption the idConsumption to set
     */
    public void setIdConsumption(int idConsumption) {
        this.idConsumption = idConsumption;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the safePrice
     */
    public float getSafePrice() {
        return safePrice;
    }

    /**
     * @param safePrice the safePrice to set
     */
    public void setSafePrice(float safePrice) {
        this.safePrice = safePrice;
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
     * @return the idProduct
     */
    public Product getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
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

    public float calculateConsumption() {

        float consumption = 0.0F;
        return consumption;
    }

    public void deleteProduct() {

    }
}
