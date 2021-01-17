/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Room {
    
    private int idRoom;
    private float price;
    private boolean status;
    private String number;
    private String description;
    private String characteristic;

    @Override
    public String toString() {
        return "Room{" + "idRoom=" + idRoom + ", price=" + price + ", status=" + status + ", number=" + number + ", description=" + description + ", characteristic=" + characteristic + '}';
    }

    public Room(int idRoom, float price, boolean status, String number, String description, String characteristic) {
        this.idRoom = idRoom;
        this.price = price;
        this.status = status;
        this.number = number;
        this.description = description;
        this.characteristic = characteristic;
    }

    /**
     * @return the idRoom
     */
    public int getIdRoom() {
        return idRoom;
    }

    /**
     * @param idRoom the idRoom to set
     */
    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
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

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the characteristic
     */
    public String getCharacteristic() {
        return characteristic;
    }

    /**
     * @param characteristic the characteristic to set
     */
    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }
    
}
