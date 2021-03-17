/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import ec.edu.espe.hotelaps.utils.Conection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jimmy Simbaña <your.name at your.org>
 */
public class RegistrationRoom {
    
    Conection conection;
    BasicDBObject document;
    ArrayList<Room> listRoom;
    

    public RegistrationRoom() {
        conection = new Conection("Rooms","Room");
        document = new BasicDBObject();
        listRoom= new ArrayList();

    }

    public void createProduct(Room room) {

        document.append("numberRoom", room.getNumberRoom())
                .append("price", room.getPrice())
                .append("status", room.isStatus())
                .append("capacityPerson", room.getCapacityPerson());
        conection.getCollection().insert(document);
    }

    public List<Room> readRoom() {
        DBCursor cursor = (DBCursor) conection.getCollection().find();
        while (cursor.hasNext()) {
            Room room = new Room((BasicDBObject) cursor.next());
            listRoom.add(room);
        }
        return listRoom;

    }

    public void updateRoom(Room room, String atribute) {
        document.put("numberRoom", atribute);
        DBCursor cursor =  (DBCursor) conection.getCollection().find(document);
        while (cursor.hasNext()) {
            DBObject object = cursor.next();
            object.put("numberRoom", room.getNumberRoom());
            object.put("price", room.getPrice());
            object.put("status", room.isStatus());
            object.put("capacityPerson", room.getCapacityPerson());;
            conection.getCollection().save(object);
        }
    }

    public void deleteRoom(String atribute) {
        document.put("status", atribute);
        DBCursor cursor = (DBCursor) conection.getCollection().find(document);
        if (cursor.hasNext()) {
            DBObject object = cursor.next();
            conection.getCollection().remove(object);
        }

    }
}
