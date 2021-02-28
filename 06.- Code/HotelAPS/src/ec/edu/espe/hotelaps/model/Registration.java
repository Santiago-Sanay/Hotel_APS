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
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Registration {
    ArrayList<Customer> listCustomer; 
    ArrayList<Worker> listWorker;
    Gson gson = new Gson();

    public Registration() {
        listCustomer = new ArrayList();
        listWorker = new ArrayList();
    }
    public void registerCustomer(Customer customer, String nameFile){
       String GsonCustomer=gson.toJson(customer,Customer.class);
       FileManager.save(nameFile, GsonCustomer);
    }
    public void registerWork(Worker worker){
       String GsonWorker=gson.toJson(worker,Worker.class);
       FileManager.save("listWorker.json", GsonWorker);
    }
    
}
