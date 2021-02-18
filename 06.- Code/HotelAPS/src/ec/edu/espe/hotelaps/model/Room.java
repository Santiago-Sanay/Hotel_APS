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
public class Room {

    private int numberRoom;
    private float price;
    private boolean status;
    private int capacityPerson;

    public Room() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "\t" + numberRoom + "\t\t" + price + "\t" + capacityPerson;
    }

    public Room(int numberRoom, float price, boolean status, int capacityPerson) {
        this.numberRoom = numberRoom;
        this.price = price;
        this.status = status;
        this.capacityPerson = capacityPerson;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCapacityPerson() {
        return capacityPerson;
    }

    public void setCapacityPerson(int capacityPerson) {
        this.capacityPerson = capacityPerson;
    }
}
