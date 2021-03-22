/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.controller;

import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.hotelaps.model.Person;
import ec.edu.espe.hotelaps.utils.Persistence;

/**
 *
 * @author Jimmy Simbaña <your.name at your.org>
 */
public class Register {
        public boolean save(Person person){
        boolean saved = saved = false;
        FileManager persistence = new FileManager();
        
        //TODO 
        
        // 
        
        
        //json conversion, or any string Iwant to save
        persistence.save(person.toString(),"reservations");
        
        return saved;
        
    }
}
