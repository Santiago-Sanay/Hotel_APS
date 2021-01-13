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
public class Receptionist {
    
    int id;

    public Receptionist(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Receptionist{" + "id=" + id + '}';
    }
    
    public void deliverRoom(Room room, Customer customer){
        
    }
    
}
