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
public class Authentication {

    String id;

    public Authentication() {
    }

    public Authentication(String id) {
        this.id = id;
    }

    public boolean authenticateCustomer() {
        boolean verify = false;
        String recover = FileManager.find("listCostumer.json", id);
        if (!recover.equals("")) {
            verify = true;
        }else{
            System.out.println("Nombre no registrado");
        }
        
        return verify;
    }

    public boolean authenticateWorker(String user, String pass) {
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
