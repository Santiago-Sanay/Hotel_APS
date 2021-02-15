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
 * @author Yulliana Roman ESPE-DCCO
 */

    public class Customer extends Person {

    public Customer(String name, String id, String documentNumber, String telephone, String email) {
        super(name, id, documentNumber, telephone, email);
    }
        
    public void addConsumption(Consumption consumption) {
        Gson gson = new Gson();
        String jsonConsumption = gson.toJson(consumption, Consumption.class);
        FileManager.save("consumption.json", jsonConsumption);
    }

    public float calculateTotal(String dataToFind) {
        String dataOfFile;
        String[] dataFile;
        Float total = 0f;
        try {
            Gson gson = new Gson();

            dataOfFile = FileManager.find("consumption.json", dataToFind);

            dataFile = dataOfFile.split("\n");
            ArrayList<Consumption> consumptions = new ArrayList();
            Consumption consumptionPrices = new Consumption();
            for (int i = 0; i < dataFile.length; i++) {
                consumptions.add(gson.fromJson(dataFile[i], Consumption.class));
                consumptionPrices = gson.fromJson(dataFile[i], Consumption.class);

                total += consumptionPrices.getSalePrice();
            }

        } catch (Exception ex) {
            System.out.println("Error");
            
        }
        return total;
    }
    

    public void showEachConsumption(String dataToFind) {
        String dataOfFile;
        String[] dataFile;
        
        try {
            Gson gson = new Gson();

            dataOfFile = FileManager.find("consumption.json", dataToFind);
            System.out.println("Detalle");
            System.out.println("*******");
            System.out.println("Servicio \t Precio ");

            dataFile = dataOfFile.split("\n");
            ArrayList<Consumption> consumptions = new ArrayList();
            Consumption consumptionPrices = new Consumption();
            for (int i = 0; i < dataFile.length; i++) {
                consumptions.add(gson.fromJson(dataFile[i], Consumption.class));
                consumptionPrices = gson.fromJson(dataFile[i], Consumption.class);
                System.out.println(consumptionPrices.toString());
           
            }
         
        } catch (Exception ex) {
            System.out.println("No hay habitaciones disponibles");
        }

    }

    }
