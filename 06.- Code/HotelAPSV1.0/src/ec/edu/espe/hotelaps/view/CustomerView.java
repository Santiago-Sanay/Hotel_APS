/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.view;

import ec.edu.espe.hotelaps.model.Customer;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class CustomerView {

    public CustomerView(Customer customer) {
        this.customer = customer;
    }
    Customer customer;

    public void display() {
        System.out.println("***************************************************");
        System.out.println("Nombre: " + customer.getFirstName());
        System.out.println("Apellido: "+ customer.getLastName());
        System.out.println("C.I: "+ customer.getDocumentNumber());
        System.out.println("Dirección: "+ customer.getAddress());
        System.out.println("Numero de teléfono: "+ customer.getTelephone());
        System.out.println("Email: "+ customer.getEmail());       
        System.out.println("***************************************************");
    }
}
