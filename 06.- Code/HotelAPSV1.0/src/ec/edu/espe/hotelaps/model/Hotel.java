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

    public void showRoom() {
      //  String[] list = FileManager.findAll("Room.json");
     
        }
    }

