/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.ArrayList;

/**
 *
 * @author SSS SANTIAGO
 */
public class Hotel {

    ArrayList<Room> rooms;
    Gson gson = new Gson();

    public Hotel() {
        rooms = new ArrayList();
    }

    public void assigmentRoom(Room room) {
        String jsonRoom = gson.toJson(room, Room.class);
        FileManager.save("Room.json", jsonRoom);
    }

    public void showAllRoom() {
        String[] roomsFree = FileManager.findAll("Room.json");
        for (int i = 0; i < roomsFree.length; i++) {
            System.out.println(roomsFree[i] + "\n");
        }
    }
    
    public void showRoomFree(){
        String roomsFree = FileManager.find("Room.json","true");        
        System.out.println(roomsFree);
    }
    
    public String findRoom(String numberRoom){
        String roomsFree = FileManager.find("Room.json",numberRoom);        
        return roomsFree;
    }
}
