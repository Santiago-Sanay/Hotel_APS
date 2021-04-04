/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.controller;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.hotelaps.model.Conection;
import ec.edu.espe.hotelaps.model.Customer;
import ec.edu.espe.hotelaps.model.Product;
import ec.edu.espe.hotelaps.model.Room;
import ec.edu.espe.hotelaps.model.Worker;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.BSONObject;
import org.bson.Document;

/**
 * @author Samuel Sañay ESPE-DCCO
 * @author Gabriel Rosero ESPE-DCCO
 * @author Jimmy Simbaña
 */
public class MenuController {

    public static String[][] showProducts() {
        int i;
        Conection conection = new Conection("inventoryShop");
        ArrayList<Product> products = conection.retrieveProducts();
        String[][] product = new String[products.size()][5];
        for (i = 0; i < products.size(); i++) {
            product[i][0] = products.get(i).getNameProduct();
            product[i][1] = products.get(i).getIdProduct();
            product[i][2] = products.get(i).getSalePrice();
            product[i][3] = products.get(i).getStock();
        }

        return product;
    }

    public static String[][] showRoms() {
        int i;
        Conection conection = new Conection("Room");
        ArrayList<Room> rooms = conection.retrieveRooms();
        String[][] room = new String[rooms.size()][5];
        for (i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getStatus().equals("Habilitado")){
            room[i][0] = rooms.get(i).getNumberRoom();
            room[i][1] = rooms.get(i).getPrice();
            room[i][2] = rooms.get(i).getCapacityPerson();
            room[i][3] = rooms.get(i).getDescription();
        }
    }   return room;
}
}
