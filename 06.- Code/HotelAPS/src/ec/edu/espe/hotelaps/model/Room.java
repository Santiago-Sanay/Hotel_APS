/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class Room {

    private String numberRoom;
    private String price;
    private String status;
    private String capacityPerson;
    private String description;

    public Room() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "\t" + getNumberRoom() + "\t\t" + getPrice() + "\t" + getCapacityPerson();
    }

    public Room(String numberRoom, String price, String status, String capacityPerson, String description) {
        this.numberRoom = numberRoom;
        this.price = price;
        this.status = status;
        this.capacityPerson = capacityPerson;
        this.description = description;
    }
        public Room(BasicDBObject object) {
        numberRoom = object.getString("numberRoom");
        price = object.getString("price");
        status = object.getString("status");
        capacityPerson = object.getString("capacityPerson");
        description = object.getString("description");
    }

    /**
     * @return the numberRoom
     */
    public String getNumberRoom() {
        return numberRoom;
    }

    /**
     * @param numberRoom the numberRoom to set
     */
    public void setNumberRoom(String numberRoom) {
        this.numberRoom = numberRoom;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
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
     * @return the capacityPerson
     */
    public String getCapacityPerson() {
        return capacityPerson;
    }

    /**
     * @param capacityPerson the capacityPerson to set
     */
    public void setCapacityPerson(String capacityPerson) {
        this.capacityPerson = capacityPerson;
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

    
        
}
