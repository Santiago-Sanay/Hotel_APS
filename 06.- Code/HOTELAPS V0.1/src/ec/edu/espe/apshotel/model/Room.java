/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.apshotel.model;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Room {
    
    int roomNumber;
    int capacity;
    float cost;
    boolean availability;
    String description;
    
     public Room(int roomNumber, int capacity, float cost, boolean availability, String description) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.cost = cost;
        this.availability = availability;
        this.description = description;
    }
     
       @Override
    public String toString() {
        return "Room{" + "roomNumber=" + roomNumber + ", capacity=" + capacity + ", cost=" + cost + ", availability=" + availability + ", description=" + description + '}';
    }

    
    public void createReservation(Room room, Customer customer){
        
    }
    public void isClean(){
        
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

  
   
}
