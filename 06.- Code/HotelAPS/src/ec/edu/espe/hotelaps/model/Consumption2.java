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
 * @author User
 */
public class Consumption2 {

    Gson gson = new Gson();

    public void addConsumption(Consumption consumption) {
        String jsonConsumption = gson.toJson(consumption, Consumption.class);
        FileManager.save("consumption.json", jsonConsumption);
    }

    public void showEachConsumption(String dataToFind) {
        String dataOfFile;
        String[] dataFile;
        try {

            dataOfFile = FileManager.find("consumption.json", dataToFind);
            System.out.println("Detalle");
            System.out.println("*********************");
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

    public void calculateTotal(String dataToFind) {
        String dataOfFile;
        String[] dataFile;
        Float total = 0f;
        try {

            dataOfFile = FileManager.find("consumption.json", dataToFind);
            dataFile = dataOfFile.split("\n");
            ArrayList<Consumption> consumptions = new ArrayList();
            Consumption consumptionPrices = new Consumption();

            for (int i = 0; i < dataFile.length; i++) {
                consumptions.add(gson.fromJson(dataFile[i], Consumption.class));
                consumptionPrices = gson.fromJson(dataFile[i], Consumption.class);
                total += consumptionPrices.getSalePrice();
            }
            System.out.println(total);
        } catch (Exception ex) {
            System.out.println("No hay habitaciones disponibles");
        }
    }
}
