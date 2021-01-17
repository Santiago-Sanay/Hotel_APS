/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.controller;

import ec.edu.espe.hotelaps.model.Room;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class RoomController {

    public ArrayList<Room> createRoom() {

        ArrayList rooms = new ArrayList(); 

        rooms.add(001);
        rooms.add(1);
        rooms.add("Tiene una cama matrimonial y una litera.");
        rooms.add("Tiene vista al mar y se encuentra en el segundo piso.");
        rooms.add(20.00F);
        rooms.add(true);

        Room room2 = new Room();
        room2.setIdRoom(002);
        room2.setNumber(2);
        room2.setCharacteristic("Tiene una cama matrimonial y una litera.");
        room2.setDescription("Tiene vista al mar y se encuentra en el segundo piso.");
        room2.setPrice(20.00F);
        room2.setStatus(true);

        Room room3 = new Room();
        room2.setIdRoom(003);
        room2.setNumber(3);
        room2.setCharacteristic("Tiene una cama matrimonial y una litera.");
        room2.setDescription("Tiene vista al mar y se encuentra en el segundo piso.");
        room2.setPrice(10.00F);
        room2.setStatus(true);

        Room room4 = new Room();
        room2.setIdRoom(004);
        room2.setNumber(4);
        room2.setCharacteristic("Tiene una cama matrimonial y una litera.");
        room2.setDescription("Tiene vista al mar y se encuentra en el segundo piso.");
        room2.setPrice(60.00F);
        room2.setStatus(true);

        Room room5 = new Room();
        room2.setIdRoom(005);
        room2.setNumber(5);
        room2.setCharacteristic("Tiene una cama matrimonial y una litera.");
        room2.setDescription("Tiene vista al mar y se encuentra en el segundo piso.");
        room2.setPrice(50.00F);
        room2.setStatus(true);        
        return rooms;
    }
}
