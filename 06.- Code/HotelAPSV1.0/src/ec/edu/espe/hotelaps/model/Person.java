/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import java.util.ArrayList;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class Person {
    private ArrayList<Customer> customer;
    private ArrayList<Worker> worker;

    public Person(ArrayList<Customer> customer, ArrayList<Worker> worker) {
        this.customer = customer;
        this.worker = worker;
    }

    public Person() {
        customer = null;
        worker = null;        
    }

    @Override
    public String toString() {
        return "Person{"  + customer + ", " + worker + '}';
    }
    
    public void registerPerson(){
        
    }

    /**
     * @return the customer
     */
    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }

    /**
     * @return the worker
     */
    public ArrayList<Worker> getWorker() {
        return worker;
    }

    /**
     * @param worker the worker to set
     */
    public void setWorker(ArrayList<Worker> worker) {
        this.worker = worker;
    }
}
