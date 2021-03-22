/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.controller;

import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.hotelaps.model.Customer;
import ec.edu.espe.hotelaps.model.Person;
import ec.edu.espe.hotelaps.model.Product;
import ec.edu.espe.hotelaps.model.Room;
import ec.edu.espe.hotelaps.model.Worker;
import ec.edu.espe.hotelaps.utils.Persistence;

/**
 *
 * @author Jimmy Simbaña <your.name at your.org>
 */
public class Register {

    public boolean save(Customer customer) {
        boolean saved = saved = false;
        FileManager persistence = new FileManager();

        //json conversion, or any string Iwant to save
        persistence.save(customer.toString(), "reservationscus");

        return saved;

    }

    public boolean save(Room room) {
        boolean saved = saved = false;
        FileManager persistence = new FileManager();

        //json conversion, or any string Iwant to save
        persistence.save(room.toString(), "reservationsroom");

        return saved;

    }

    public boolean save(Product product) {
        boolean saved = saved = false;
        FileManager persistence = new FileManager();

        //TODO 
        //json conversion, or any string Iwant to save
        persistence.save(product.toString(), "reservationsproduc");

        return saved;

    }

    public boolean save(Worker worker) {
        boolean saved = saved = false;
        FileManager persistence = new FileManager();

        //TODO 
        //json conversion, or any string Iwant to save
        persistence.save(worker.toString(), "reservationswor");

        return saved;

    }
}
