/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.ArrayList;
import java.util.List;

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

    public void printAllRoom() {
        FileManager.findAll("Rooom.json");
        List<Room> roomsl;
        roomsl = new ArrayList();
        String[] rooms;
        rooms = FileManager.findAll("Room.json");
        Room eachRoom;
        for (String line : rooms) {
            eachRoom = gson.fromJson(line, Room.class);
            roomsl.add(eachRoom);
        }
        System.out.println("Número de la habitación  Precio Capacidad");
        for (Room room : roomsl) {
            System.out.println(room.toString());
            room.toString();
        }
    }

    public void showRoomFree(String dataToFind) {
        String dataOfFile;
        String[] dataFile;
        try {

            dataOfFile = FileManager.find("Room.json", dataToFind);
            dataFile = dataOfFile.split("\n");
            ArrayList<Room> roomsFree = new ArrayList();
            
            for (int i = 0; i < dataFile.length; i++) {
                roomsFree.add(gson.fromJson(dataFile[i], Room.class));
                System.out.println(roomsFree.get(i));
            }
        } catch (Exception ex) {
            System.out.println("No hay habitaciones disponibles");
        }

    }

    public String findRoom(String numberRoom) {
        String roomsFree = FileManager.find("Room.json", numberRoom);
        return roomsFree;
    }
}
