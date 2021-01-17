/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.view;

import ec.edu.espe.hotelaps.model.Worker;

/**
 *
 * @author User
 */
public class WorkerView {
    public WorkerView(Worker worker) {
        this.worker = worker;
    }
    Worker worker;

    public void display() {
        System.out.println("***************************************************");
        System.out.println("Nombre: " + worker.getFirstName());
        System.out.println("Apellido: "+ worker.getLastName());
        System.out.println("C.I: "+ worker.getDocumentNumber());
        System.out.println("Dirección: "+ worker.getAddress());
        System.out.println("Numero de teléfono: "+ worker.getTelephone());
        System.out.println("Email: "+ worker.getEmail());
        System.out.println("***************************************************");
    }
}
