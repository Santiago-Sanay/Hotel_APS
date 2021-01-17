/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import ec.edu.espe.filemanager.utils.FileManager;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Autentication {

    String id;

    public Autentication() {
    }

    public Autentication(String id) {
        this.id = id;
    }

    public void autenticationCustomer() {
        FileManager.find("listCustomer.json", id);

    }

    public boolean autenticationWorker(String user, String pass) {
        boolean check;
        
        

        if (user.equals("admin") && pass.equals("admin")) {
            check = true;

        } else {
            System.out.println("Clave o Usuario incorrectos");
            check = false;
        }
        return check;

    }
}
