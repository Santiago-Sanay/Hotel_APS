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
public class Customer {

    private String id;
    private String name;
    private String documentNumber;
    private String address;
    private String telephone;
    private String email;

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + getId() + ", name=" + getName() + ", documentNumber=" + getDocumentNumber() + ", address=" + getAddress() + ", telephone=" + getTelephone() + ", email=" + getEmail() + '}';
    }

    public Customer(String id, String name, String documentNumber, String address, String telephone, String email) {
        this.id = id;
        this.name = name;
        this.documentNumber = documentNumber;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the documentNumber
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * @param documentNumber the documentNumber to set
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
