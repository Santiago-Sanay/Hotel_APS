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
 * @author Yulliana Roman ESPE-DCCO
 */
public class Consumption {

    Gson gson = new Gson();

    public Consumption() {
    }

    public void showAllComsumtion(String name) {
        String[] roomsFree = FileManager.findAll(name + ".json");
        for (String roomsFree1 : roomsFree) {
            System.out.println(roomsFree1);
        }

    }

    public void printAllProduct(String name) {
        String[] dataFile;

        dataFile = FileManager.findAll(name + ".json");
        ArrayList<Customer> customers = new ArrayList();
        ArrayList<Room> rooms = new ArrayList();
        ArrayList<Product> products = new ArrayList();
        for (int i = 0; i < dataFile.length; i++) {
            customers.add(gson.fromJson(dataFile[0], Customer.class));
            System.out.println(customers.get(0));

            rooms.add(gson.fromJson(dataFile[1], Room.class));
            System.out.println(rooms.get(1));

        }

    }
}
